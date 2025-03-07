import java.io.*;

class abc
{
void fun() throws IOException  // redirect the exception to its parent block
{
throw new IOException("my exp");   // throw used to create & throw exception explicit
}

public static void main(String ar[])
{
try
{
abc a1=new abc();
a1.fun();
}catch(IOException e)
{
System.out.println("process the "+e+" redirect from child block");
}
}

}