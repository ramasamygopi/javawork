import java.util.Arrays;
public class Asss{

public static void main(String[]args)
{

int a[]={5,2,8,9,1,6};
int tem;
for(int i=0;i<a.length;i++)
{
for(int j=i+1;j<a.length;j++)
{
if(a[i]>a[j])
{
tem=a[i];
a[i]=a[j];
a[j]=tem;
}
}
System.out.println(Arrays.toString(a));
}
}
}