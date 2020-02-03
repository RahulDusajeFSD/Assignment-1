
import java.util.*;
class AgeException extends Exception
{	
	void AgeExep()
	{
		System.out.println("Age of the person should be above 15.");
	}
}





class ValidateAge
{
	static void Validate(int age) throws AgeException 
	{
		if(age<15)
			throw new AgeException();
		else
			System.out.println("Age is valid");
	}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		try{
		Validate(n);
		}

		catch(AgeException ae)
		{
			new AgeException().AgeExep();
		}
	}
}

