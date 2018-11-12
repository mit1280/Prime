import java.util.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<applet code="xy.class" width=300 height=300></applet>*/

public class xy extends Applet implements MouseListener
{	int x1=-1,x2,y1=-1,y2;
	Button b1,b2,b3;
	public void init()
	{
		
		b1=new Button("LINE");
		b2=new Button("OVAL");
		b3=new Button("SQUAR");
		add(b1);
		add(b2);
		add(b3);
		b1.addActionListener(new A());
		b2.addActionListener(new B());
		b3.addActionListener(new C());
		addMouseListener(this);
	}
	public void paint(Graphics g){}
	public void mouseClicked(MouseEvent ma)
	{
		if(x1==-1 && y1==-1)
		{
			x1=ma.getX();
			y1=ma.getY();
		}
		else
		{
		 x2=ma.getX();
		 y2=ma.getY();
		}
	}
	public void mousePressed(MouseEvent ma){}
	public void mouseEntered(MouseEvent ma){}
	public void mouseExited(MouseEvent ma){}
	public void mouseReleased(MouseEvent ma){}	
}
class A implements ActionListener
{
	public void actionPerformed(ActionEvent ae)
	{
		Graphics g=getGraphics();
		g.drawLine(x1,y1,x2,y2);
	}
}
class B implements ActionListener
{
	public void actionPerformed(ActionEvent ae)
	{
		Graphics g=getGraphics();
		g.drawOval(x1,y1,x2,y2);
	}
}
class C implements ActionListener
{
	public void actionPerformed(ActionEvent ae)
	{
		Graphics g=getGraphics();
		g.drawRect(x1,y1,x2,y2);
	}
}