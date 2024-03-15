import java.util.Scanner;
public class Income
{
public static void main(String[]args)
{
int p,r=2,n=4,SI;
System.out.println("enter the amount");
Scanner ant=new Scanner(System.in);
p=ant.nextInt();
System.out.println("the principle Amount is:"+p);
SI=p*n*r/100;
System.out.println("SI is:"+SI);
}
}

