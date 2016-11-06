import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class text1{
	public static void main(String[] args)
	{
		MyFrame frame=new MyFrame();
	}
}
class MyFrame extends JFrame
{
	public MyFrame()
	{
		super("test1");
		JPanel panel=new JPanel();
		JButton button=new JButton("press");
		button.addActionListener(new ActionListener()
		{	
			public void actionPerformed(ActionEvent e)
			{	
			   panel.setBackground(Color.RED);
			}
		});
		panel.add(button);
		this.getContentPane().add(panel);
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}