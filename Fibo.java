class Fibo
{
	public static void main(String[] args) {
		System.out.print("0 1");
		int n1=0;
		int n2=1;
		int n3;
		for(int i=2;i<89;i++)
		{
			n3=n1+n2;
			if(n3>89)
				break;
				System.out.print(" " +n3);
			n1=n2;
			n2=n3;
		
			
		}
	}
}