import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class text4 extends WindowAdapter implements ActionListener{
	JFrame frame;
	JButton button;
	JTextField text;
	int flag=0;
	public static void main(String[] args)
	{
		text4 t = new text4();
		t.go();
	}
	public void go()
	{
		frame = new JFrame("Love");
		button = new JButton("Reverse");
		button.addActionListener(this);
		frame.getContentPane().add(button,"South");
		text = new JTextField(50);
		frame.getContentPane().add(text,"Center");
		
		frame.addWindowListener(this);
		frame.setSize(300,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		String str1="you miss me";
		String str2="i miss you";
		if(flag == 0)
		{
			text.setText(str1);
			text.setBackground(Color.RED);
			flag=1;
		}
		else
		{
			text.setText(str2);
			text.setBackground(Color.GREEN);
			flag=0;
		}
	}
}
