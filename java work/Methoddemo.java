public class Methoddemo{
public void Digits(int a){
int sum=0;
while(a>0)
{
sum=sum+(a%10);
a=a/10;
System.out.println(sum);
}
}
public static void main(String[]args)
{
Methoddemo obj=new Methoddemo ();
obj.Digits(123);

//System.out.println(Digits(3,3,4));
}
}

