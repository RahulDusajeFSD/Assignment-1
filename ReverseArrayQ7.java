import java.util.*;
import java.lang.*;
class ReverseArrayQ7
{

	public static void main(String[] args) 
	{
		StringBuilder sb1=new StringBuilder();
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter limit");

					int n=sc.nextInt();

					int[] A=new int[n];

			//	Scanner sc=new Scanner(System.in);
			int[] reverse=new int[A.length];
					for(int i=0;i<n;i++)
						{
							A[i]=sc.nextInt();

							StringBuilder sb=new StringBuilder();
							sb.append(A[i]);
							sb.reverse();

							reverse[i]=Integer.parseInt(new String(sb));
						}

						int[] toBeReversed=new int[reverse.length];
						
						for(int i=0;i<reverse.length;i++)
							toBeReversed[i]=reverse[i];
						
				for(int i=0;i<reverse.length;i++)
					//System.out.print(reverse[i]);
				{
					sb1.append(new Integer(reverse[i]).toString());   
				}

				System.out.println("Reversed array"+ sb1);

				
				Arrays.sort(toBeReversed);

				System.out.println("Sorted Array"+ Arrays.toString(toBeReversed));







	}
}