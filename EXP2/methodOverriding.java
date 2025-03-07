class base{
void show1(){
System.out.println("Base class Show1 Function ");
}
void show(){
System.out.println("Base class show Function");
}
}

class derive extends base{
void show2(){
System.out.println("Derived class show2 Function");
}
void show(){
System.out.println("Derived class show Function");
}

public static void main(String[] args){
derive d1 = new derive();
d1.show1();
d1.show2();
d1.show();
}
}