public class Maventicq
{
public static  void main(String[]args){

String a="india";
int count=1,ans=0;
for(int i=0;i<a.length();i++){
for(int j=i+1;j<a.length();j++){
if(a.charAt(i)==a.charAt(j))
{
count++;
}
}
}
if(count>1)
{
ans++;
}
System.out.println(ans);
}
}