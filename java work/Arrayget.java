import java.util.Scanner;
public class Arrayget{
public static void main(String arg[])
{
Scanner obj=new Scanner(System.in);
System.out.println("enter the array element size");
int size=obj.nextInt();
int a[]=new int[size];




for(int i=0;i<a.length;i++){
System.out.println("enter the array element");
a[i]=obj.nextInt();
}
System.out.println("enter  array element is");
for(int i=0;i<a.length;i++)
{
System.out.print(a[i]+" ");
}
}
}