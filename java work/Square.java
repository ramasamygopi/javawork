import java.util.Scanner;
public class Square
{
public static void main(String[]args)
{
double n;
Scanner obi=new Scanner(System.in);
System.out.println("enter the  number");
n=obi.nextDouble();
double squareRoot=Math.sqrt(n);
int nearestSquareRoot=(int)Math.ceil(squareRoot);
System.out.println(nearestSquareRoot);
}
}