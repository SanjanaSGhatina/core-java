class Marge{
	public static void main(String arg[]){
		int a[]={2,4,6,8,10};
		int b[]={1,3,5,7,9};
		int c[]=new int[a.length + b.length];
		
		
		for(int i=0; i < a.length ; i++)
		{
			c[i]=a[i];
			
		}
		for(int j=0 ; j < b.length ; j++)
		{
			c[a.length+j] = b[j];
		}
		
		for(int i = 0;c.length; i++)
			System.out.print(c[i]+" ");
		}
}