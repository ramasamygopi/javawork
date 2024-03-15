public class Reversestring
{
public static void main(String[]args)
{
String name="Madam";
int a;
String b="";
a=name.length();
for(int i=(a-1);i>=0;i--)
{
b=b+name.charAt(i);
}
System.out.println(b);
if(name.toLowerCase().equals(b.toLowerCase()))
System.out.println(name+ "it is polendrome");
else
System.out.println(name+" it is not polendrome");
}
}




