import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile
{
	public static void main(String[] args) {
		
try
{
FileWriter myObj=new FileWriter("MyFile.txt");
myObj.write("hello to the world of java.\n This is the beauty of java. \n This is awesome.\n Awesome stuff to play with.\n");
myObj.close();

}
catch(IOException e)
{
	System.out.println("An error occured");
}





}


}

