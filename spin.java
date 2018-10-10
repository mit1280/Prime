import javax.swing.*;    
import javax.swing.event.*;  
class spinn implements ChangeListener {  
 JLabel label;
spinn(){
    JFrame f=new JFrame("Spinner Example");    
     label = new JLabel();            
             label.setSize(250,100);    
    SpinnerModel value =  
             new SpinnerNumberModel(5, //initial value  
				0, //minimum value  
                10, //maximum value  
                1); //step  
    JSpinner spinner = new JSpinner(value);   
            spinner.setBounds(100,100,50,30);    
            f.add(spinner);  
			f.add(label);  
           f.setSize(300,300);    
           f.setLayout(null);    
           f.setVisible(true);     
           spinner.addChangeListener(this);  
}  
		public void stateChanged(ChangeEvent e) 
		{  
			label.setText("Value : " + ((JSpinner)e.getSource()).getValue());
        }  
} 
public class spin 
{
	    public static void main(String[] args) {    
			spinn n=new spinn();
		}
}	
