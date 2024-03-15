import java.util.Arrays;
import java.util.Scanner;
public class twoarray{
public static void main(String[]args)
{
int a[][]=new int[3][3];
System.out.println("Enter the first arary");
Scanner obj=new Scanner(System.in);
int b[]=obj.nextInt();
System.out.println("Enter the second arary");
Scanner obi=new Scanner(System.in);
int c[]=obi.nextInt();


for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++){

System.out.print(a[i][j]+" ");
}
System.out.println(" ");

}
}
}