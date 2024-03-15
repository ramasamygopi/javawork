class Father{
public void Myfather()
{
System.out.println("my father name is Ramasamy");
}
}
class Gopi extends Father{
public void Myfather()
{
System.out.println("my mother name is malliswari");
}
}
class Meena extends Father{
public void Myfather()
{
System.out.println("my brother name is mani");
}
}
class Mani extends Father{
public void Myfather()
{
System.out.println("my sister name is meena");
}
}
class Relation{
public static void main(String[] args)
{
Father Myna=new Father();
Father mymama=new Gopi();
Father memama=new Meena();
Father mymani=new Mani();
Myna.Myfather();
mymama.Myfather();
memama.Myfather();
mymani.Myfather();
}
}






