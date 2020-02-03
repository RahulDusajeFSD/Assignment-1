import java.util.*;
class FibonacciRNR
{
	


	static int Nfb(int n)
	{
		int n1=1;
		int n2=1;
		int n3=0;
		for(int i=2;i<=n;i++)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
		}

		return n3;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
	int k=Nfb(9);
	System.out.println(k);
	}
}