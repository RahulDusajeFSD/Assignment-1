import java.util.*;
import java.lang.*;
class PositiveString
{
	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);

String s=sc.nextLine();

//int ascii = (int)s.charAt(0);
int flag=1;
for(int i=1;i<s.length();i++)
{
	int ascii=(int)s.charAt(i-1);
	int asciiNext=(int)s.charAt(i);

	if(asciiNext<ascii)
		{
			flag=0;
			break;
		}


}

if(flag==1)
System.out.println("Positive String");
else
System.out.println("Negative String");

	}
}