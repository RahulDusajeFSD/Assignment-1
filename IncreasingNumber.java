import java.util.*;

class IncreasingNumber
{

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		int number=sc.nextInt();

		if(checkNumber(number))
			System.out.println("Increasing number");

		else
			System.out.println("Not increasing");

	}
	/*static int IntegerLength(int n)
	{	
		int length=0;
		while(n>0)
		{
			int k=n%10;
			length++;
			n/=10;
		}

		return length;

	} */ 

	static boolean checkNumber(int number)
	{
		Integer num= new Integer(number);

		//bint len=IntegerLength(number);
		//int[] A=new int[len];
		//int i=0;

		boolean flag=false;

		String s=Integer.toString(number);

		System.out.println(s);

		for(int i=1;i<s.length();i++)
		{
			int Ascii_1=(int)s.charAt(i-1);
			int Ascii_2=(int)s.charAt(i);

			if(Ascii_1>Ascii_2)
			{
				flag=true;
				break;
			}



		}

		if(flag)
			return false;

		return true;
	

	}


}