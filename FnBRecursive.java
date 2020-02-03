import java.util.*;

class FnBRecursive
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		int k=fiboRecursive(n);

		System.out.println(k);
	}


	static int fiboRecursive(int n)
	{
		if(n<=1)
			return n;

		return fiboRecursive(n-1)+fiboRecursive(n-2);

	}
}