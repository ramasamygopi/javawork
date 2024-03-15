class mathematical
{
public static int power(int base,int power)
{
int result=1;
for(int i=1;i<=power;i++)
{
result*=base;
}
return result;
}
}
public class Function_power{
public static void main(String args[])
{
System.out.println("power:"+mathematical.power(4,3));

}
}