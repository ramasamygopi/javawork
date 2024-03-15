import java.util.Scanner;
public class Largestamongthree{
public static void main(String[]args)
{
int a,b,c;
System.out.println("Enter the  1 number");
Scanner obj=new Scanner(System.in);
a=obj.nextInt();
System.out.println("Enter the  2 number");
b=obj.nextInt();
System.out.println("Enter the  3 number");
c=obj.nextInt();
if(a>b && a>c)
{
System.out.println("the largest number is:" +a);
}
else if(b>c && b>a)
{
System.out.println("the largest number is:" +b);
}
else
{
System.out.println("the largest number is:" 
+c);
}
}
}