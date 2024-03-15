import java.util.Scanner;
public class Builder{
public static void main(String[]args){
System.out.println("Enter the sentence");
Scanner obj=new Scanner(System.in);
String a=obj.nextLine();
StringBuilder b=new StringBuilder(a);
System.out.println(a);
StringBuilder c=new StringBuilder();
for(int i=b.length()-1;i>=0;i--){
c.append(b.charAt(i));
}
System.out.println(c);

}
}