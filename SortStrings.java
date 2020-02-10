import java.util.*;

class SortStrings
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		String s=sc.nextLine();

		

		SortUppercaseHalf(s);
	}

	static void SortUppercaseHalf(String s)
	{
		char[] c=s.toCharArray();
		int length=s.length();
		Arrays.sort(c);

		System.out.println("Sorted String"+Arrays.toString(c));
	


		if(length%2==0)
		{
			for(int i=0;i<length/2;i++)
			{
				System.out.print(Character.toUpperCase(c[i]));
			}
			for(int i=((length/2)+1);i<length;i++)
			{
				System.out.print(c[i]);
			}
		}

		else
		{
			for(int i=0;i<(length/2)+1;i++)
			{
				System.out.print(Character.toUpperCase(c[i]));
			}
			for(int i=((length/2)+1);i<length;i++)
			{
				System.out.print(c[i]);
			}
		}
	}
}