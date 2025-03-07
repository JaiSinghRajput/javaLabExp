class mythread extends Thread{
mythread(String s){
super(s);
start();
}

public void run(){
for(int i=1;i<=5;i++)
{
System.out.println(Thread.currentThread().getName()+" "+i);
try{
Thread.sleep(1000);
}
catch(InterruptedException e)
{
System.out.print("ERRORRRR : "+e);
}
}
}
public static void main(String args[]){
mythread th1 = new mythread("Thread-1");
mythread th2 = new mythread("Thread-2");
}
}