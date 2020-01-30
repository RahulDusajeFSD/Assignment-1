import java.util.Scanner;
class BufferManipulation
{
	public static void main(String[] args) {
		
		Scanner Sc=new Scanner(System.in);
		StringBuffer buffer=new StringBuffer();

		buffer.append(Sc.nextLine());

		System.out.println(buffer);

		int length=buffer.length();
		buffer.replace(0,length,"new world");

		System.out.println(buffer);


	}
}