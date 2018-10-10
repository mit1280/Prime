import javax.swing.*;  
public class Slider extends JFrame{  
public Slider() {  
JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 50, 25);  
slider.setMinorTickSpacing(2);  
slider.setMajorTickSpacing(10);  
slider.setPaintTicks(true);  
slider.setPaintLabels(true);  
  
JPanel panel=new JPanel();  
panel.add(slider);  
add(panel);  
}  
public static void main(String s[]) {  
Slider frame=new Slider();  
frame.pack();  
frame.setVisible(true);  
}  
} 