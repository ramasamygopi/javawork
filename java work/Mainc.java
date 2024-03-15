public class Person
{
private String name;
private int age;
public Person(String name,int age)
{
this.name=name;
this.age=age;

}
public String getname(){
return name;
}

public int getage(){
return age;
}
}
public class Mainc
{
public static void main(String[]args)
{
Person person1=new Person(" gopi",14);
Person person2=new Person(" gracy",21);
System.out.println(person1.getname()+"ageis"+person1.getage());
System.out.println(person2.getname()+"ageis"+person2.getage());
}
}