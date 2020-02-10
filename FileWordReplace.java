import java.util.*;
import java.io.*;

class FileWordReplace
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the word you want to replace");

		String old=sc.nextLine();

		System.out.println("Enter the word you want to replace with");

		String neww=sc.nextLine();

		BufferedReader br=null;
		FileWriter writer=null;

		
		String OldString="";
		try {
		br=new BufferedReader(new FileReader("MyFile.txt"));
		String currentLine=br.readLine();


		while(currentLine!=null)
		{

			OldString+=currentLine+"\n";
			currentLine=br.readLine();
		}

		String NewContent=OldString.replaceAll(old,neww);

		 writer=new FileWriter("MyFile.txt");
		writer.write(NewContent);

		br.close();
	writer.close();
	}
	catch(IOException e)
	{
		System.out.println("Error Occured");
	}

	
	}
}