//creating own custom exceptions

import java.util.*;

class MyExceptionFirstName extends Exception{
	void NameException()
	{
		System.out.println("enter full name");
	}


}



class EmployeeName
{
	static void validate(String Name) throws MyExceptionFirstName
	{
			String[] words=Name.split(" ");	
			if(words.length==1)
				throw new MyExceptionFirstName();

	}


public static void main(String[] args) {
	
Scanner sc=new Scanner(System.in);
String Name=sc.nextLine();
//String LastName=sc.nextLine();

	try
	{
		validate(Name);
	}

	catch(MyExceptionFirstName e)
	{
		new MyExceptionFirstName().FirstNameException();
		//System.out.println("Enter full name");
	}

}

}