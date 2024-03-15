import java.util.Scanner;
public class Pone
{
public static void main(String[]args)
{
int a;
System.out.println("Enter the number");
Scanner obj=new Scanner(System.in);
a=obj.nextInt();
if(a>=1)
System.out.println("the number is positive");
else if(a<0)
System.out.println("the number is negative");
else
System.out.println("the number is neutral");
}
}