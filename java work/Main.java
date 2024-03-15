import java.util.Scanner;
class Number{
public void num(int a)
{
if(a%2==0)
{
System.out.println("the number is even");
}
else
{
System.out.println("the number is odd");
}
}
}
class First extends Number
{
public void sum(int a){
if(a%2==0)
{
System.out.println(a+"the number is even");
}
else
{
System.out.println(a+"the number is odd");
}
}
}
class Main{
public static void main(String[] args)
{
System.out.println("Enter the a value : ");
Scanner d=new Scanner(System.in);
int a=d.nextInt();
First gopi=new First();
gopi.num(a);
gopi.sum(a);
}
}


