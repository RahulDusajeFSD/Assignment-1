
import java.util.*;
import java.io.*;
class Filetype{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the file name");
		String fileName = scan.nextLine();
        try
        {
   			File myFile=new File(fileName);
        	BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
             // object of file is created
            if(myFile.exists()==false)
            {
                System.out.println("File doesn't exist!!!");
                //System.exit(0);
            }
            else{
            	System.out.println("File exists!!");
            	if(myFile.canExecute()){
            		System.out.println("The file is executable!!");
            	}
            	if(myFile.canRead()){
            		System.out.println("The file is readable!!");
            	}
            	if(myFile.canWrite()){
            		System.out.println("The file is writable!!");
            	}
            	if(fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
				System.out.println("The type of file is:"+fileName.substring(fileName.lastIndexOf(".")+1));
            }
        }catch (Exception Ex)
        {
            System.out.println("Exception : " + Ex.toString());
        }


	}
}
