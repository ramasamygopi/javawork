import java.util.Scanner;
public class Arithmetic
{
public static void main(String[]args)
{
int a,b,c,d,e,f,g;
System.out.println("Enter the number1");
Scanner obj=new Scanner(System.in);
a=obj.nextInt();
System.out.println("your number is:"+a);
System.out.println("Enter the number2");
Scanner ob=new Scanner(System.in);
b=ob.nextInt();
System.out.println("your number is:"+b);
c=a+b;
d=a-b;
e=a*b;
f=a/b;
g=a%b;
System.out.println("Result is:"+c);
System.out.println("Result is:"+d);
System.out.println("Result is:"+e);
System.out.println("Result is:"+f);
System.out.println("Result is:"+g);
}
}
