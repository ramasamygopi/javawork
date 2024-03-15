import java.util.Scanner;
public class Num
{
public static void main(String[]args)
{
int a;
System.out.println("enter the number");
Scanner obj=new Scanner(System.in);
a=obj.nextInt();
if(a==3 && a==2)
{
System.out.println("the number is prime");
}
else if(a%2!=0 || a%3!= 0)
{
System.out.println("the number is prime");
}
else
System.out.println("the number is  not prime");
}
}
