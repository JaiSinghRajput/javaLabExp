import java.awt.*;
import java.awt.event.*;

class MyEvent implements MouseListener ,MouseMotionListener ,KeyListener
{
Frame f;
TextField t1,t2,txt;
MyEvent()
{
f=new Frame("Event Handling");
t1=new TextField();
t2=new TextField();
txt=new TextField();
f.add(t1,BorderLayout.NORTH);
f.add(t2,BorderLayout.SOUTH);
f.add(txt);
txt.addKeyListener(this);
f.addMouseListener(this);
f.addMouseMotionListener(this);
f.setSize(600,500);
f.setVisible(true);
}

public void mouseClicked(MouseEvent e)
{
t1.setText("Clicked");
}

public void mousePressed(MouseEvent e)
{
t2.setText("Mouse Pressed");
}

public void mouseReleased(MouseEvent e)
{
t2.setText("Mouse Released");
}

public void mouseEntered(MouseEvent e)
{
t1.setText("Mouse In");
}
public void mouseExited(MouseEvent e)
{
t1.setText("Mouse Out");
}

public void mouseMoved(MouseEvent e)
{
t2.setText("Mouse Move At "+e.getX()+" "+e.getY());
}
public void mouseDragged(MouseEvent e)
{
t2.setText("Mouse Drag At "+e.getX()+" "+e.getY());
}

public void keyPressed(KeyEvent e)
{
txt.setText("Key Pressed");
}

public void keyReleased(KeyEvent e)
{
txt.setText("Key Released");
}

public void keyTyped(KeyEvent e)
{
txt.setText(txt.getText()+String.valueOf(e.getKeyChar() ));
}

public static void main(String ar[])
{
MyEvent me=new MyEvent();
}
}