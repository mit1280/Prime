import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class registration extends JFrame implements ActionListener{
	JLabel l1,l2,l3;
	JTextField t1,t2,t3;
	JFrame f;
	JButton b1,b2;
	registration()
	{
		l1=new JLabel("FIRST NUMBER  ");
		l2=new JLabel("SECOND NUMBER ");
		l3=new JLabel("Third NUMBER ");
		t1=new JTextField();
		t2=new JTextField();
		t3=new JTextField();
		f =new JFrame("Table Example");
		b1=new JButton("ADD");
		setLayout(null);
		l1.setBounds(30,50,100,20);
		l2.setBounds(30,100,100,20);
		l3.setBounds(30,150,100,20);
		t1.setBounds(150,50,100,20);
		t2.setBounds(150,100,100,20);
		t3.setBounds(150,150,100,20);
		b1.setBounds(100,200,80,20);
		add(l1);
		add(l2);
		add(t1);
		add(t2);
		add(l3);
		add(t3);
		add(b1);
	
		b1.addActionListener(this);
	}
	
		public void actionPerformed(ActionEvent e)
		{
			
			  
            String data[][]={ {t1.getText(),t2.getText(),t3.getText()}};                        
                   String column[]={"ID","NAME","SALARY"};         
    JTable jt=new JTable(data,column);       
					jt.setBounds(200,200,200,200);
					f.add(jt);
					f.setSize(300,400);
					f.setVisible(true);
		}
	public static void main(String []arg)
	{
		registration r=new registration();
		r.setVisible(true);
		r.setDefaultCloseOperation(r.EXIT_ON_CLOSE);
		r.setSize(400,400);
	}
		
}
