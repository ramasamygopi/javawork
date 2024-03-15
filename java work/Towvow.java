import java.util.Scanner;
public class Towvow
{
public static void main(String[]args)
{
String b;
System.out.println("enter the word");
Scanner letter=new Scanner(System.in);
b=letter.nextLine();
for(int i=1;i<=1;i++)
{
if(b.charAt(i)=='a' || b.charAt(i) =='e' || b.charAt(i) =='i' || b.charAt(i) =='o' || b.charAt(i) =='u')
System.out.println("it is vowles");
else
System.out.println("it is not vowels");
}
}
}