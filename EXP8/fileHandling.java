import java.io.*;
class Fileio{
public static void main(String args[]){
String file1 = "first.txt";
String file2 = "copy-first.txt";

String s = "Hello from nonb world"; 
try{
FileOutputStream fos = new FileOutputStream(file1);
byte byteString[] = s.getBytes();
fos.write(byteString);
System.out.println("wrote in file sucessfully");
fos.close();

FileInputStream fis = new FileInputStream(file1);
fos = new FileOutputStream(file2);
int i =0;
while((i = fis.read())!=-1)
{
System.out.print((char)i);
fos.write(i);
}
fis.close();
fos.close();
}
catch(IOException e)
{
System.out.println("ERROR : "+e);
}
}
}