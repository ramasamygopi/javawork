import java.util.Arrays;
public class Assendingarray
{
public static void main(String[]args)
{
int a[]={1,2,9,7,33,3,87};
System.out.println("Before sort:"+Arrays.toString(a));
/*int temp;
for(int i=0;i<a.length;i++)
{
for(int j=i+1;j<a.length;j++)
{
if(a[i]>a[j]){
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
System.out.println("After sort:"+Arrays.toString(a));*/
Arrays.sort(a);
System.out.println(a[a.length-5]);

}
}
