import java.util.Scanner;
class decimal{
public static void decimal2binary(int n){
int a[]=new int[1
0];
int i=0;
while(n>0)
{
a[i]=n%2;
n=n/2;
i++;
}
for(int j=a.length-1;j>=0;j--)
{
System.out.print(a[j]);
}
}
}
public class DemicaltoBinary{

public static void main(String[]args)
{
System.out.print("Enter the decimal value");
Scanner obj=new Scanner(System.in);
int a=obj.nextInt();
decimal.decimal2binary(a);
}
}