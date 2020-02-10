import java.io.File; 
import java.io.FileNotFoundException;  
import java.util.Scanner; 

public class ReadFile {
  public static void main(String[] args) {
    try {
      File myObj = new File("MyFile.txt");
      Scanner myReader = new Scanner(myObj);
      int counter=0;
      while (myReader.hasNextLine()) {

        String data = myReader.nextLine();
        System.out.println(counter+ ")"+data);
        counter++;
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}