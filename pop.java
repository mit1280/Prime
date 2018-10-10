import javax.swing.*;  
import java.awt.event.*;  
class pop1 extends MouseAdapter implements ActionListener
{  JLabel  label; JFrame f;JPopupMenu popupmenu; JMenuItem cut,copy,paste;
     pop1(){  
          JFrame f= new JFrame("PopupMenu Example");  
          label = new JLabel();          
         label.setSize(400,100);  
           popupmenu = new JPopupMenu("Edit");   
         cut = new JMenuItem("Cut");  
         copy = new JMenuItem("Copy");  
         paste = new JMenuItem("Paste");  
         popupmenu.add(cut); popupmenu.add(copy); popupmenu.add(paste);        
         f.addMouseListener(this);  
		 cut.addActionListener(this);
		  f.add(label); f.add(popupmenu);   
         f.setSize(400,400);  
         f.setLayout(null);  
         f.setVisible(true); 
	 }
		 public void mouseClicked(MouseEvent e) 
		 {              
                popupmenu.show(f,e.getX(),e.getY());  
         }                 
         public void actionPerformed(ActionEvent e) {
				if(e.getSource()==cut)
					label.setText("cut MenuItem clicked.");  
			 if(e.getSource()==copy)
				 label.setText("cut MenuItem clicked.");  
		 if(e.getSource()==paste)
             label.setText("cut MenuItem clicked.");  
         }  
 }  
 class pop{
	 
public static void main(String args[])  
{  
        new pop1();  
}  

} 