import java.util.Scanner;
public class Sumofdigits{
public static void main(String[]args){

int a,rem,sum=0;
System.out.println("Enter the number three digit");
Scanner obj=new Scanner(System.in);
a=obj.nextInt();
while(a!=0)
{
rem=a%10;
sum=sum+rem;
a=a/10;
}
System.out.println(sum);
}
}