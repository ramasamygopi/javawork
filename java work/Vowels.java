public class Vowels
{
public static void main(String[]args)
{
String name="gopi";
int vowels=0,consonants=0;
int b=name.length();
for(int i=0;i<b;i++)
{
if(name.charAt(i)=='a' || name.charAt(i) =='e' || name.charAt(i) =='i' || name.charAt(i) =='o' || name.charAt(i) =='u')
vowels++;
else
consonants++;
}
System.out.println(vowels);
System.out.println(consonants);
}
}