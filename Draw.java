import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Draw extends JFrame
{
	private String s="Draw";
    JFrame frame;
	public Draw() 
	{
		frame = new JFrame("Draw oval,circle,arc and text");
        frame.setSize(400,400);
        frame.setVisible(true);
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.red);
        g.drawOval(30,30,50,20);       
        g.fillOval(30,30,50,20);
		
		g.setColor(Color.green);       
		g.drawOval(4, 4, width-8, height-8);
		g.fillOval(4, 4, width-8, height-8);
		
		g.setColor(Color.yellow);
		g.drawArc(150,150,50,50,0,60); 
		g.fillArc(210,210,50,50,0,-60);
    }
	public static void main(String[] args) 
	{
		Draw d=new Draw();
        d.addWindowListener(
        new WindowAdapter(){
			public void windowClosing (WindowEvent e){
				System.exit(0);
				}
			});
    }
}