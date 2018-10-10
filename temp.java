import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class co extends JFrame implements ActionListener
{
	JButton b1,b2;JPanel c1,c2,c3,c4;
	co()
	{
		c1=new JPanel();		c2=new JPanel();
		c3=new JPanel();		c4=new JPanel();
		b1=new JButton("color");   		b2=new JButton("color");
		setLayout(new GridLayout(2,2));
		b1.addActionListener(this);  		b2.addActionListener(this);
		add(c1);add(c2);	add(c3);add(c4);
		c1.add(b1);  c2.add(b2);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			Color cp=JColorChooser.showDialog(this,"hi",Color.RED);
			c3.setBackground(cp);
		}
		if(e.getSource()==b2)
		{
			Color cp=JColorChooser.showDialog(this,"hi",Color.RED);
			c4.setBackground(cp);
		}
	}
}
public class temp
{
	public static void main(String s[])
	{
		co x=new co();
		x.setSize(400,400);
		x.setVisible(true);
		x.setDefaultCloseOperation(x.EXIT_ON_CLOSE);
	}
	
}
