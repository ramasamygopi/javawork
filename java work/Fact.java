import java.util.Scanner;
public class Fact{
public static void main(String[]args)
{
int fact=0;
System.out.println("Enter the number");
Scanner obj=new Scanner(System.in);
int a=obj.nextInt();
for(int i=1;i<=a;i++)
{
if(a%i==0)
fact++;
}
 if(fact==2)
System.out.println("Given number is prime number");
else
System.out.println("Given number is not  prime number");
}
}

