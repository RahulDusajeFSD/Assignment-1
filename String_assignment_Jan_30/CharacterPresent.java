
import java.util.*;
class CharacterPresent
{
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		String s=new String();

		char a;

		s=sc.nextLine();

		a=sc.next().charAt(0);
		int position=0;

		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==a)
				{
					position=i;
					break;
				}
		}

		System.out.println(position);


	}
}