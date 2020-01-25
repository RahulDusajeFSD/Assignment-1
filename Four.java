class Four
{
	public static void main(String[] args) 
	{
		int num=Integer.parseInt(args[0]);
		int limit=Integer.parseInt(args[1]);
		for(int i=1;i<=Integer.parseInt(args[1]);i++)
			System.out.println(num+"*"+i+"="+Integer.parseInt(args[0])*i);
	}
}