import java.util.Scanner;
public class Table
{
public static void main(String[]args)
{
int i=1,j,k ;
System.out.println("Enter the number:");
Scanner table=new Scanner(System.in);
k=table.nextInt();
while(i<=10)
{
j=i*k;
System.out.println(i+"*"+k+"="+j);
i++;
}
}
}