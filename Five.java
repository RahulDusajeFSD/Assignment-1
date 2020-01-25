class Five
{
	public static void main(String[] args) {
		int n1=Integer.parseInt(args[0]);
		int n2=Integer.parseInt(args[1]);
		int n3=Integer.parseInt(args[2]);
		int sum=n1+n2+n3;
		if(n1>40)
		{
			if(n2>40)
			{
				if(n3>40)
				{
					if(sum>=125)
					{
						System.out.println("Pass");
					}

				}
			}
		}
		    
			
		else
			System.out.println("Fail");

	}
}