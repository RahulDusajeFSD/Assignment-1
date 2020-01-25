class First
{
	public static void main(String[] args) {
		
		System.out.println(fact(Integer.parseInt(args[0])));
	}

	public static int fact(int x)
	{
		if(x==0)
			return 1;

		return x*fact(x-1);
	}
}