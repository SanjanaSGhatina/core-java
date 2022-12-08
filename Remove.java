class Remove
{
	public static void main(String arg[])
	{
		String str="Sanjana S Ghatina";
		int count=0;
		
		for(char ch:str.toCharArray())
		{
			if(ch!=' ')
			{
				System.out.print(ch);
			}
			else
			{
				count++;
			}
		}
		System.out.print("\nSpace Count: "+count);
	}
}