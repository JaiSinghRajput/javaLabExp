interface abc {
void show1();
void show2();
}

interface pqr{
void fun1();
void fun2();
}

class interx implements abc,pqr{
public void show1(){
System.out.println("show 1 function of interface abc");
}

public void show2(){
System.out.println("show 2 function of interface abc");
}

public void fun1(){
System.out.println("fun 1 function of interface pqr");
}

public void fun2(){
System.out.println("fun 2 function of interface pqr");
}

public static void main(String args[]){
interx x1 = new interx();
x1.show1();
x1.show2();
x1.fun1();
x1.fun2();
}

}