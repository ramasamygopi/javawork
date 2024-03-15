import java.util.Scanner;
public class Togglecase{
public static void main(String[]args)
{
System.out.println("enter the string sentence");
StringBuilder b=new StringBuilder();
String g=b.nextLine();
for(int i=0;i<b.length();i++)
{

if(b.charAt(i)>=97 && b.charAt(i)<=122){
int c=(int) b.charAt(i)-32;
b.setCharAt(i,(char) c);
}
else if(b.charAt(i)>=65 && b.charAt(i)<=90){
int c=(int) b.charAt(i)+32;
b.setCharAt(i,(char) c);
}
} 
System.out.println(b);
} 
}