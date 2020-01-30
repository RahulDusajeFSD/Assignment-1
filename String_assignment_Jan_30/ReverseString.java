import java.util.*;

class ReverseStringb
{
	public static void main(String[] args) {
		
		Scanner Sc=new Scanner(System.in);

		String s=Sc.nextLine();

		Stack<Character> stack=new Stack<Character>();

		for(int i=0;i<s.length();i++)
		{
			stack.add(s.charAt(i));
		}
        String neww="";
        
		for(int i=0;i<s.length();i++)
		neww+=stack.pop();
		
		System.out.println(neww);
		
		
	}
}