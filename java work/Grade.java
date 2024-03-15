import java.util.Scanner;
public class Grade
{
public static void main(String[]args)
{
int mark;
System.out.println("Enter the mark");
Scanner obj=new Scanner(System.in);
mark=obj.nextInt();
if(mark>=90)
System.out.println("A GRADE");
else if(mark>=80)
System.out.println("B GRADE");
else if(mark>=70)
System.out.println("C GRADE");
else if(mark>=60)
System.out.println("D GRADE");
else
System.out.println("e GRADE");
}
}