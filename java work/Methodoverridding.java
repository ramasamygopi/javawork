class User{
String name;
int age;
User(String n,int a){
this.name=n;
this.age=a;
}
public void  main()
{
System.out.println("Name:"+name);
System.out.println("age:"+age);
}
}
class mainprogrammer extends User{
String companyname;
mainprogrammer(String n,int a,String c)
{
super(n,a);
this.companyname=c;
}
public void display()
{
System.out.println("Name:"+name);
System.out.println("age:"+age);
System.out.println("companyname:"+companyname);
}
}
public class Methodoverridding{
public static void main(String[]args){
mainprogrammer o=new mainprogrammer("gopi",22,"ggg");
o.display();
}
}