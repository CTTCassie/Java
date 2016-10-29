import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ChangeColour extends JFrame implements ActionListener
{
	JButton button1;
	JButton button2;
	JButton button3;
	JTextField text;
	public ChangeColour() 
	{
		super("change colour");
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		Container con = getContentPane();
		
		button1 = new JButton("red");
		button2 = new JButton("green");
		button3 = new JButton("blue");
		button1.setBounds(30, 30, 70, 40);
		button2.setBounds(110,30, 70, 40);
		button3.setBounds(190,30, 70, 40);
		con.add(button1);
		con.add(button2);
		con.add(button3);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		text = new JTextField(10);
		text.setBounds(30,90, 230, 30);
		con.add(text);
	}
	public void actionPerformed(ActionEvent e) 
	{
		JButton clicked = (JButton) e.getSource();
		if(clicked == button1) 
		{
			text.setBackground(Color.RED);
		} 
		else if(clicked == button2) 
		{
			text.setBackground(Color.GREEN);
		} 
		else   //clicked == button3 
		{
			text.setBackground(Color.BLUE);
		}
	}
	public static void main(String[] args) 
	{
		new ChangeColour().setVisible(true);
	}
}