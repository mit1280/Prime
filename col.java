import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class col extends JFrame implements ActionListener{
	Container c;
	JButton b1;
	col()
	{
		c=getContentPane();
		b1=new JButton("Color");
		setLayout(null);
		b1.setBounds(100,200,80,20);
		c.add(b1);
		b1.addActionListener(this);
		
	}
	
		public void actionPerformed(ActionEvent e)
		{
			Color initialColor=Color.red;
			Color color=JColorChooser.showDialog(this,"Select",initialColor);
			c.setBackground(color);
		}
	public static void main(String []arg)
	{
		col r=new col();
		r.setVisible(true);
		r.setDefaultCloseOperation(r.EXIT_ON_CLOSE);
		r.setSize(400,400);
	}
		
}
/*
import javax.swing.*;    
import javax.swing.event.*;  
public class TableExample {    
      public static void main(String[] a) {  
            JFrame f = new JFrame("Table Example");  
            String data[][]={ {"101","Amit","670000"},{"102","Jai","780000"},{"101","Sachin","700000"}};    
                            String column[]={"ID","NAME","SALARY"};         
                            final JTable jt=new JTable(data,column);    
            jt.setCellSelectionEnabled(true);  
            ListSelectionModel select= jt.getSelectionModel();  
            select.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);  
            select.addListSelectionListener(new ListSelectionListener() {  
              public void valueChanged(ListSelectionEvent e) {  
                String Data = null;  
                int[] row = jt.getSelectedRows();  
                int[] columns = jt.getSelectedColumns();  
                for (int i = 0; i < row.length; i++) {  
                  for (int j = 0; j < columns.length; j++) {  
                    Data = (String) jt.getValueAt(row[i], columns[j]);  
                  } }  
                System.out.println("Table element selected is: " + Data);    
              }       
            });  
            JScrollPane sp=new JScrollPane(jt);    
            f.add(sp);  
            f.setSize(300, 200);  
            f.setVisible(true);  
          }  
        } 
		
*/