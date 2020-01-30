import java.lang.*;
import java.util.*;
class Palindrome
{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		StringBuilder sb=new StringBuilder();
		StringBuilder reverse=new StringBuilder();

		sb.append(sc.nextLine());

		reverse=reverse.append(sb.reverse());

		System.out.println(reverse);
		
		if(sb.toString().equals(reverse.toString()))
			System.out.println(" palindrome");
		else
			System.out.println("Not Palindrome");
	}
}