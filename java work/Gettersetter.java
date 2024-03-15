class Rectangular{
private int length,width;
int getLength(){
return length;
}
int getWidth(){
return width;
}
void setLength(int l){
length=l;
}
void setWidth(int w){
width=w;
}
int area(){
int a=length*width;
return a;
}
}
public class Gettersetter{
public static void main(String[]args){
Rectangular o=new Rectangular();
o.setLength(10);
o.setWidth(20);
System.out.println(o.getLength());
System.out.println(o.getWidth());
System.out.println(o.area());

}
}