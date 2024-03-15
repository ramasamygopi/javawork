class Mathoperation{
public int multiply(int x,int y)
{
return x*y;
}
public double multiply(double x,double y)
{
return x*y;
}
public float multiply(float x,float y)
{
return x*y;
}
}
public class Methodoverloading{
public static void main(String []args)
{
Mathoperation o=new Mathoperation();
Mathoperation o1=new Mathoperation();
System.out.println(o.multiply(4,5));
System.out.println(o1.multiply(2.5,5));


}
}
