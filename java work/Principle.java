import java.util.Scanner;
public class Principle
{
public static void main(String[]args)
{
int p;
System.out.println("Enter the Amount");
Scanner object=new Scanner(System.in);
p=object.nextInt();
System.out.println("Amount Is: "+p);

int r,n,si;
r=2;
n=4;

si=p*n*r/100;

System.out.println("the SI is:"+si);



}
}