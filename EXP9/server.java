import java.io.*;
import java.net.*;

class server
{
	ServerSocket ss;
	Socket  so;
	DataInputStream dis;
	DataOutputStream dou;		
server()
	{
try
{
	ss=new ServerSocket(102);
System.out.println("server started");	
	so=ss.accept();

dis=new DataInputStream(so.getInputStream());
dou=new DataOutputStream(so.getOutputStream());
String s="";
do
{
s=dis.readUTF();
System.out.println("client side is   "+s+"\n");
dou.writeUTF("ok "+s);
dou.flush();

}while(!s.equals("stop"));

dis.close();
dou.close();
}catch(Exception ee)
{
	System.out.println(ee);
}
	}//cons

public static void main(String []args)
{
server se=new server();	
	
}	
}