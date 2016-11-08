import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;

public class test2 {
	JFrame frame=new JFrame("test2");
	JTextArea text;
	JButton button1;
	JButton button2;
	int count;
	public static void main(String[] args)
	{
		test2 t=new test2();
		t.go();
	}
	public void go()
	{
		text=new JTextArea(8,20);
		text.setEditable(false);
		
		JScrollPane jsp=new JScrollPane(text,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		button1=new JButton("button1");
		button1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				System.exit(0);
			}
		});
		button2=new JButton("button2");
		button2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				count++;
				String str=String.valueOf(count);
				text.setText(str);
			}
		});
		
		JPanel panel=new JPanel();
		panel.add(jsp);
		panel.add(button1);
		panel.add(button2);
		Border etched=BorderFactory.createEtchedBorder();
		panel.setBorder(etched);
		
		Container con=frame.getContentPane();
		con.add(panel,"Center");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}
