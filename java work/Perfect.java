import java.util.Scanner;
public class Perfect{
public static void main(String[]args)
{
int sum=0;
System.out.println("Enter the number");
Scanner obj=new Scanner(System.in);
int a=obj.nextInt();
for(int i=1;i<a;i++)
{
if(a%i==0){
sum=sum+i;
}
}
if(sum==a)
System.out.println("This number is perfect number");
else
System.out.println("This number is not perfect number");
}
}