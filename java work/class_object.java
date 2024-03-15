class Rectangular{
int length,width;
void Bi(int x,int y)
{
length=x;
width=y;

}
int area(){
int a=length * width;
return a;
}
}
public class class_object{
public static void main(String args[]){
Rectangular o1=new Rectangular();
o1.Bi(20,30);
System.out.println(o1.area());
}
}
