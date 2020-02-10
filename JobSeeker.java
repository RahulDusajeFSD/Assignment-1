import java.util.*;
import java.lang.*;

class JobSeeker
{
	int flag=1;
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	String Uname=sc.nextLine();


	
	if(ValidateUsername(Uname));
		System.out.println("Works fine");

}

public static boolean ValidateUsername(String name)
{
	StringTokenizer st=new StringTokenizer(name,"_");

while(st.hasMoreTokens())
{


	if(st.nextToken().toString().length()>=8)
		return true;

	
}
return false;
}
}