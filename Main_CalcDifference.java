import java.util.*;
class CalculateDiff
{

int sum=0;

int calculateDifference(int n)
{
	return (SumOfTheSquares(n) - SquaresOfTheSum(n));

}

int SumOfTheSquares(int n)
{
	int Sum_of_Squares=0;
	for(int i=1;i<=n;i++)
		Sum_of_Squares+=i*i;

	return Sum_of_Squares;

}

int SquaresOfTheSum(int n)
{
	int Squares_of_Sum=0;
	int Sum=0;
	for(int i=1;i<n;i++)
		Sum+=i;

	Squares_of_Sum=Sum*Sum;

	return Squares_of_Sum;
}
}

class Main_CalcDifference
{
	public static void main(String[] args) 
	{

		
		Scanner Sc=new Scanner(System.in);

		int input=Sc.nextInt();

		System.out.println(new CalculateDiff().calculateDifference(10));


	}
}
