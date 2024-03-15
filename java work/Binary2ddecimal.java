class  Binary{

public static int Binarytodecimal(int binary)
{
int decimal=0,power=0;
while(binary!=0)//1100 110
{
int remainder=binary%10;//1100%10=0  110/10=0  //
decimal +=remainder*Math.pow(2,power);//0*2^0=0 0*2^1=0 0+0=0//
power++;//0+1;1+1;//
}
return decimal;
}
}
public class Binary2ddecimal{
public static void main(String[]args)
{
System.out.println(Binary.Binarytodecimal(1100));


}
}