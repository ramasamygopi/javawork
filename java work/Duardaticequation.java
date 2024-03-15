import java.util.Scanner;
public class Duardaticequation{
public static void main(String[]arg){
double r1=0;double r2=0;
Scanner obj=new Scanner(System.in);
System.out.println("Enter the A value");
double a=obj.nextDouble();
System.out.println("Enter the B value");
double b=obj.nextDouble();
System.out.println("Enter the C value");
double c=obj.nextDouble();
double d=b*b-4*a*c;
if(d>0)
System.out.println("The roots are unequal");
r1=(-b+Math.Sqrt(d))/(2*a);
r2=(-b+Math.Sqrt(d))/(2*a);
System.out.println(r1);
System.out.println(r2);
}
else if(d==0){
System.out.println("The roots are equal");
r1=-b/(2*a);
r2=-b/(2*a);
System.out.println(r1);
System.out.println(r2);
}

else{
System.out.println("The roots are imaginary");
System.out.println(r1);
System.out.println(r2);
}
}
}