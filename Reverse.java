class Reverse{
public static void main(String ar[]){
int number = 598462,reverse = 0;
while(number!=0)
{
int remainder = number % 10;
reverse = reverse * 10 + remainder;
number = number/10;
}
System.out.println("The reverse of given number is : " +reverse);
}
}