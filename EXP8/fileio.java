import java.io.*;

class fileio
{
public static void main(String ar[])
{
try
{
String s="Hello Dear How Are You";
FileOutputStream fo=new FileOutputStream("myfil.txt");
byte b[]=s.getBytes();  //conver string to byte array
fo.write(b); // write complete byte array to file output stream
fo.close();

FileInputStream f1=new FileInputStream("myfil.txt");
FileOutputStream f2=new FileOutputStream("myfil2.txt");
int i=0;

while( (i=f1.read())!=-1)
{
System.out.print((char)i);
f2.write(i);
}

f1.close();
f2.close();
}catch(IOException e)
{
System.out.print(e);
}
}
}