import java.util.Scanner;
public class Minicalculator
{
public static void main(String[]args)
{
int a,b;
Scanner obi=new Scanner(System.in);
System.out.println("enter the first number");
a=obi.nextInt();
System.out.println("enter the second number");
b=obi.nextInt();
char operator;
System.out.println("enter the operator +,-,*,/ or %:");
operator=obi.next().charAt(0);
switch(operator)
{
case '+':
System.out.println(a+"+"+b+"="+(a+b));
break;
case '-':
System.out.println(a+"-"+b+"="+(a-b));
break;
case '*':
System.out.println(a+"*"+b+"="+(a*b));
break;
case '/':
System.out.println(a+"/"+b+"="+(a/b));
break;
case '%':
System.out.println(a+"%"+b+"="+(a%b));
break;

}
}
}
