import java.util.Scanner;
class Method
{
public void addition(){
Scanner obj=new Scanner(System.in);
System.out.println("Enter the a value");
int b=obj.nextInt();
System.out.println("Enter the c value");
int d=obj.nextInt();
System.out.println("addtion is:"+(b+d));
}

public void sub(int e,int f){
System.out.println("sub is:"+(e-f));
}
}
public class Function{

public static void main(String args[])
{
Method s=new Method();
s.addition();
s.sub(10,40);
}
}