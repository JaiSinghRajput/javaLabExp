import java.awt.*;
import java.applet.*;

public class myapp extends Applet
{
public void init()
{
System.out.println("Applet Init is called");
setBackground(Color.cyan);
setForeground(Color.red);
}
public void start()
{
System.out.println("Applet Start is called");
}

public void paint(Graphics g)
{
g.drawLine(20,30,120,200);
g.drawRect(20,40,200,150);
g.fillOval(130,150,250,150);
}
public void stop()
{
System.out.println("Applet Stop is called");
}

public void destroy()
{
System.out.println("Applet Destroy is called");
}



}