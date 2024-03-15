import java.util.Scanner;
public class Stringbuilder{
public static void main(String[]args){
Scanner a=new Scanner(System.in);
System.out.println("Enter the sentence");
String b=a.nextLine();
StringBuilder c=new StringBuilder(b);
System.out.println(b);
int upper=0,lower=0,space=0,num=0,symbol=0,vowels=0;
for(int i=0;i<b.length();i++){
if(b.charAt(i)>=97 && b.charAt(i)<=122){
lower++;
}
if(b.charAt(i)>=65 && b.charAt(i)<=90){
upper++;
}
if(b.charAt(i)>=47 && b.charAt(i)<=56){
num++;
}
if(b.charAt(i)>='A'||b.charAt(i)>='I'||b.charAt(i)>='O'||b.charAt(i)>='u'||b.charAt(i)>='E'||b.charAt(i)>='a'||b.charAt(i)>='e'||b.charAt(i)>='i'||b.charAt(i)>='o'||b.charAt(i)>='u')
{
vowels++;
}
}
System.out.println("lower is:"+lower);
System.out.println("upper is:"+upper);
System.out.println("number is is:"+num);
System.out.println("vowles is:"+vowels);
}
}