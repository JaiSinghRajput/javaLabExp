import java.util.Scanner;
class InputDemo{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter Name , Age , salary , Gender ");
String name = sc.next();
int age = sc.nextInt();
float Sal = sc.nextFloat();
char Gender = (sc.next()).charAt(0);
System.out.println("name = "+name);
System.out.println("age = "+age);
System.out.println("salary = "+Sal);
System.out.println("gender = "+Gender);
}
}