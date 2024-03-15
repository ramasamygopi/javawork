import java.util.Scanner;
public class Details
{
public static void main(String[]args)
{
String a,c;
Long b;
System.out.println("Enter the name");
Scanner object=new Scanner(System.in);
a=object.nextLine();
System.out.println("NAME IS: "+a);

System.out.println("Reg no");
Scanner obj=new Scanner(System.in);
b=obj.nextLong();
System.out.println("reg no : "+b);

System.out.println("Department");
Scanner ob=new Scanner(System.in);
c=ob.nextLine();
System.out.println("Department: "+c);

}
}
