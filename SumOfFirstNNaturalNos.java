import java.util.*;

class SumOfFirstNNaturalNos
{

	int Sum=0;

int calculateSum(int n){


		for(int i=1;i<n;i++)
		{

			if(i%3==0 || i%5==0)

				Sum+=i;
		}

		return Sum;


	}
}

class Main
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.println(new SumOfFirstNNaturalNos().calculateSum(10));

	}
}