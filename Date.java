import java.util.*;
import java.lang.*;
import java.time.*;

class Date
{
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);



		System.out.println("enter the date in Format: DD MM YYYY");
			String CurrDate="31 01 2020";
			String UDate1=Sc.nextLine();

		StringTokenizer CurrentDate= new StringTokenizer(CurrDate," ");
		StringTokenizer UDate= new StringTokenizer(UDate1," ");

		while(CurrentDate.hasMoreTokens())// && UserDate.hasMoreTokens())
		{
			int days=Math.abs(Integer.parseInt(CurrentDate.nextToken()) -Integer.parseInt(UDate.nextToken()));
			System.out.println("Days =" +" "+ days);
			int month=Math.abs(Integer.parseInt(CurrentDate.nextToken()) -Integer.parseInt(UDate.nextToken()));
			System.out.println("Month =" +" "+ month);
			int year=Math.abs(Integer.parseInt(CurrentDate.nextToken()) -Integer.parseInt(UDate.nextToken()));
			System.out.println("Year =" +" "+ year);

		}


		




	}

}