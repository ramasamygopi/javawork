import java.util.Scanner;
import java.util.Arrays;
public class Array_function{
public static int[] sortArray(){
System.out.println("Emter the array element size");
Scanner obj=new Scanner(System.in);
int a=obj.nextInt();
int b[]=new int[a];
for(i=0;i<a;i++)
{
System.out.println("enter the value of array");
a[i]=obj.nextInt();
}
Arrays.sort(a);
}
public static void main(String args[])
{
int arr[]=sortArray();
for(i=0;i<a;i++)
{
System.out.print(a);

}
}

}
