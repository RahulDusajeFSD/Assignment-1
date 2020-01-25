class Six
{
	public static void main(String[] args) 
	{
		//System.out.println(Integer.toBinaryString(Integer.parseInt(args[0])));
		int n=Integer.parseInt(args[0]);
		System.out.println(bin(n));
		

	}
	public static int bin(int x)
	{
		if(x==0)
			return 0;

		return(x%2 + 10*bin(x/2));
	}
}