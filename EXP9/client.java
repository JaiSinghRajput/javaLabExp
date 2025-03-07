import java.io.*;
import java.net.*;
import java.util.*;

class client
{
Socket so;
DataOutputStream dos;
DataInputStream din;
Scanner sc;
client()
{ 
	try
	{
		so=new Socket("localhost",102);
		dos=new DataOutputStream(so.getOutputStream());
		din=new DataInputStream(so.getInputStream());
		sc=new Scanner(System.in);  // for keyboard input
		String s="";
		
			do
			{
			s=sc.next();	
			dos.writeUTF(s);
			String a=din.readUTF();
			System.out.print("server "+a+"\n");
			}while(!s.equals("stop"));
			dos.close();
			din.close();
	}
	catch(Exception ee)
	{
	
	System.out.println(ee);
	}	

}

public static void main(String []args)
{
client c=new client();	
}
	
	
}