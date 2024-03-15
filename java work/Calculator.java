import java.util.Scanner;
public class Calculator
{
public static void main(String[]args)
{
int a,b;
Scanner scanner=new Scanner(System.in);
System.out.println("Enter the  1 number");
a=scanner.nextInt();
System.out.println("Enter the  2 number");
b=scanner.nextInt();
char oprator;
System.out.println("Enter the oprator +,-,*,/ or%");
oprator=scanner.next().charAt(0);
switch(oprator){
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
case'%':
System.out.println(a+"%"+b+"="+(a%b));
break;
}
}
}