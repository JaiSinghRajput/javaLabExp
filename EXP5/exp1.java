class abc
{
public static void main(String ar[])
{
try
{

if(ar.length==1)
{
System.out.println("In 1st block");
int arr[]=new int[5];
arr[10]=20;
}
else
{
System.out.println("In 2nd block");
int a=5/ar.length;
System.out.println("2nd block completed");
}
}
catch(ArithmeticException e)
{
System.out.println("I process "+e+" Exception");
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("I process "+e+" Exception");
}
finally
{
System.out.println("Its finally so must be executed");
}
}
}