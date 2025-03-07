class abc{
int a;
float b;
char c;
boolean d;
String s;

void show(){
System.out.println("a="+a);
System.out.println("b="+b);
System.out.println("c="+c);
System.out.println("d="+d);
System.out.println("s="+s);
}

public static void main(String args[])
{
abc obj1 = new abc();
obj1.show();
}
}