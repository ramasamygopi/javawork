import java.util.Scanner;
class Number{
public void sum(int a,int b)
{
c=a+b;
System.out.println("the resultis:"+c);
}
}
class First extends Number
{
public void sub(float a,float b)
{
f=a-b;
System.out.println("the result is:"+f);
}
}
class Second extends Number{
public void mul(int a,int b){
g=a*b;
System.out.println("the result is:+");
}
}
class Third extends Number{
h=a/b;
public void divi(double a,double b){
System.out.println("the result is:"+h);
}
}
 public class inheritence{
public static void main(String[] args)
{
System.out.println("Enter the a value : ");
Scanner d=new Scanner(System.in);
System.out.println("Enter the b value");
Scanner e=new Scanner(System.in)
int a=d.nextInt();
int b=e.nextInt();
Number go=new Number();
First goo=new First();
Second gooo=new Second();
Third goooo=new Third();
go.sum(a,b);
goo.sub(a,b);
goo.mul(a,b);
gooo.divi(a,b);

}

}


