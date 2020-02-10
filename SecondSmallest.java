import java.util.*;
import java.lang.*;
class SecondSmallest
{
public static int  getSecondSmallest(int [] A)
{

	Arrays.sort(A);

	return A[1];
}
	public static void main(String[] args) 
	{
		Scanner Sc=new Scanner(System.in);

		int[] A=new int[5];

		for(int i=0;i<A.length;i++)
			A[i]=Sc.nextInt();

		System.out.println(getSecondSmallest(A));
	}
}


