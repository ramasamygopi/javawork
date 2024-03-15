class Complex{
private int real,imag;
public Complex(){
this.real=0;
this.imag=0;
}
public Complex(int x,int y)
{
this.real=x;
this.imag=y;
}
public Complex(Complex o2)
{
this.real=o2.real;
this.imag=o2.imag;
}
public String toString(){
return"(" + real + "+" + imag + "i)";
}
}
public class Copyconstrutor{
public static void main(String[]args)
{
Complex o1=new Complex();
System.out.println("object:"+o1);
Complex o2=new Complex(8,9);
System.out.println("object:"+o2);
Complex o3=new Complex(o2);
System.out.println("object:"+o3);
}
}
