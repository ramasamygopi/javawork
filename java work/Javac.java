import java.util.Scanner;
public class Javac
{
public static void main(String[]args)
{
int a;
System.out.println("Enter the number");
Scanner ob=new Scanner(System.in);
a=ob.nextInt();
while(true){
if(a%10==0){
System.out.println(a);
break;
}
a--;
}

}
} 

