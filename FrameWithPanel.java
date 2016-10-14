import java.awt.*;
import javax.swing.*;
public class FrameWithPanel
{
   public static void main(String args[])
   {
      JFrame frame=new JFrame("Frame with panel");
      Container contentpanel=frame.getContentPane();
      contentpanel.setBackground(Color.CYAN);
      JPanel panel=new JPanel();
      panel.setBackground(Color.yellow);
      JButton button=new JButton("Press");
      panel.add(button);
      contentpanel.add(panel,"South");
      frame.setSize(300,200);
      frame.setVisible(true);
   }
}