import java.util.Scanner;
class Mrng
{
	public static void main(String arg[])
	{		
	  
	Scanner sp = new Scanner(System.in);  
	System.out.print("Enter a String: ");  
	String sentence=sp.nextLine();
	System.out.print("Enter a word to reverse: ");
	String word=sp.nextLine();
	
	String reverse="";
	String[] str=sentence.split(" ");
	for(int i=0;i<str.length;i++)
	{
		if(str[i].equals(word))
		{
			char ch[]=word.toCharArray();
			for(int j=word.length()-1;j>=0;j--){
				reverse=reverse+ch[j];
			}
			str[i]=reverse;
		}
	}
	for(int i=0;i<str.length;i++){
		System.out.print(str[i]+" ");
	}
	
	}
	
}
	