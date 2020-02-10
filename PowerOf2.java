import java.util.*;

class PowerOf2
{

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();

		if(checkNumber(number))
			System.out.println("Power of 2");
		else
			System.out.println("Not power of 2");


	}

	static boolean checkNumber(int number)
	{
		boolean flag=false;

		while(number>1)
		{
			int k=number%2;

			if(k==1)
			{
				flag=true;
				break;
			}
			number/=2;

		}
		if(flag)
			return false;

		return true;

	}
}