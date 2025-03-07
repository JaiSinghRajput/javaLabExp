import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class abc implements ActionListener
{
Frame f;
Label l1,l2,l3;
TextField t1,t2,t3;
TextArea ta;
Button b1,b2;
Connection co;
PreparedStatement st;
ResultSet rs;
abc()
{
f=new Frame();
ta=new TextArea();
l1=new Label("Name");
l2=new Label("Age");
l3=new Label("Sal");
t1=new TextField();
t2=new TextField();
t3=new TextField();
b1=new Button("insert");
b2=new Button("show");
f.setLayout(null);
l1.setBounds(20,40,80,20);
l2.setBounds(20,80,80,20);
l3.setBounds(20,120,80,20);
t1.setBounds(120,40,80,20);
t2.setBounds(120,80,80,20);
t3.setBounds(120,120,80,20);
b1.setBounds(50,180,50,20);
b2.setBounds(150,180,50,20);
ta.setBounds(20,210,180,100);
f.add(ta);
f.add(l1);
f.add(l2);
f.add(l3);
f.add(t1);
f.add(t2);
f.add(t3);
f.add(b1);
f.add(b2);
b1.addActionListener(this);
b2.addActionListener(this);
f.setSize(300,400);
f.setVisible(true);
try
{
Class.forName("com.mysql.jdbc.Driver");
co=DriverManager.getConnection("jdbc:mysql://localhost:3306/abc","root",null);
}catch(Exception e)
{
System.out.print(e);
}

}

public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
try
{
String s1=t1.getText();
String s2=t2.getText();
String s3=t3.getText();
st=co.prepareStatement("insert into emp(name,age,sal) values(?,?,?)");
st.setString(1,s1);
st.setInt(2,Integer.parseInt(s2));
st.setInt(3,Integer.parseInt(s3));
st.executeUpdate();
st.close();
System.out.print("insert sucessfully");
}catch(SQLException eee)
{
System.out.print("insery "+eee);
}
}
else
{
try
{
st=co.prepareStatement("select * from emp");
rs=st.executeQuery();
String s="";
while(rs.next())
{
s=s+rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+"\n";
}
ta.setText(s);
st.close();
}catch(SQLException ee)
{
System.out.print("show "+ee);
}
}
}

public static void main(String ar[])
{
new abc();
}
}