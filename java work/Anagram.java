import java.util.Arrays;
public class Anagram
{
public static void main(String[]args)
{
String n="gopi";
String n1="bagr";
boolean b=true;
if(n.length()!=n1.length()){
b=false;
}
else 
{
char a[]=n.toCharArray();
char c[]=n1.toCharArray();
Arrays.sort(a);
Arrays.sort(c);
b=Arrays.equals(a,c);
}
if(b)
System.out.println("it is anagram");
else
System.out.println("it is  not anagram");
}
}