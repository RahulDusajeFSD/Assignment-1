import java.util.*;

class SumOfFirstNNaturalNos
{

	int Sum=0;

int calculateSum(int n){


		for(int i=1;i<=n;i++)
		{

			if(i%3==0 || i%5==0)

				Sum+=i;
		}

		return Sum;


	}
}

class Main_N
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();

		System.out.println(new SumOfFirstNNaturalNos().calculateSum(input));

	}
}