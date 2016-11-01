
import java.awt.*;
import java.applet.*;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Draw extends Applet
{
	public void paint(Graphics g)
	{
		g.setColor(Color.RED);        //Õ÷‘≤
        g.drawOval(30,30,50,20);       
        g.fillOval(30,30,50,20);
		
		g.setColor(Color.GREEN);      //‘≤
		g.drawOval(4, 4, 8,8);
		g.fillOval(4, 4, 8,8);
		
		g.setColor(Color.BLUE);       //‘≤ª°
		g.drawArc(150,150,50,50,0,60); 
		g.fillArc(210,210,50,50,0,-60);
		
		g.setColor(Color.BLACK);
		g.drawString("ctt",100,100);  //Œƒ±æ
		super.paint(g);
    }
}