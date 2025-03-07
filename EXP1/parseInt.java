class abc{
public static void main(String args[])
{
System.out.println(args[0]+args[1]);
//after coverting into integer
int a = Integer.parseInt(args[0]);
int b = Integer.parseInt(args[1]);
int c = a+b;
System.out.print(c);
}
}