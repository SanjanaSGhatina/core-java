import java.util.*;
class LowUpper
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to be converted to UpperCase");
		String str = sc.nextLine();

		str = str.toUpperCase(); 
		System.out.println(str);
		
	}
}