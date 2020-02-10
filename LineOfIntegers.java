import java.util.*;
import java.lang.*;
class LineOfIntegers
{
	public static void main(String[] args) {
		
	
	Scanner sc=new Scanner(System.in);
	String string=new String();

	string=sc.nextLine();



	StringTokenizer St=new StringTokenizer(string," ");

int Sum=0;
while(St.hasMoreTokens())
{
	int i=Integer.parseInt(St.nextToken());
	Sum+=i;
	System.out.println(i);


}

System.out.println(Sum);

	
	}

	//System.out.println(Sum);
}
