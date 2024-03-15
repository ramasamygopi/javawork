import java.util.Scanner;
import java.util.Arrays;
public class Array_function{
public static int[] sortArray(){
System.out.println("Emter the array element size");
Scanner obj=new Scanner(System.in);
int a=obj.nextInt();
int b[]=new int[a];
for(int i=0;i<a;i++)
{
System.out.println("enter the value of array");
b[i]=obj.nextInt();
}
Arrays.sort(b);
return b;
}
public static void main(String args[])
{
int arr[]=sortArray();

System.out.print(b
);

}
}


