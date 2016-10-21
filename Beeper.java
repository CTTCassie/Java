import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Beeper extends JApplet implements ActionListener
{
   JButton button;
   public void init()
   {
      button = new JButton("press");
      getContentPane().add(button,BorderLayout.CENTER);
      button.addActionListener(this);
   }
   public void actionPerformed(ActionEvent e)
   {
      System.out.println("press again");
   }
}