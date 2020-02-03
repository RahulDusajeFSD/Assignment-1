import java.util.*;
class TrafficLight
{
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);

		{
			System.out.println("Traffic Light....Type RED, YELLOW or GREEN");
			String s=sc.nextLine();

			switch(s)
			{
				case  "RED":
				System.out.println("Stop"); break;

				case "YELLOW":
				System.out.println("Ready");break;

				case"GREEN":
				System.out.println("Go");break;

				default:
				System.out.println("Enter the right color");break;

			}
		}
	}
}