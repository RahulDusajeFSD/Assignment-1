import java.util.*;
import java.lang.*;
class SumOfCubes
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int x=sc.nextInt();

		SumCubes(x);


	}



public static void SumCubes(int n)
{
	int sum=0;
	while(n>0)
	{
		int k=n%10;
		sum+=k*k*k;
		n=n/10;
	}

	System.out.println(sum);


}}
