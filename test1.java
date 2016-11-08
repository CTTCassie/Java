import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class test1 {
	JFrame frame=new JFrame("test1");
	JTextArea text1;
	JTextArea text2;
	JButton button1;
	JButton button2;
	public static void main(String[] args)
	{
		test1 t=new test1();
		t.go();
	}
	public void go()
	{
		text1=new JTextArea(8,20);
		text1.setSelectedTextColor(Color.BLUE);
		text2=new JTextArea(8,20);
		text2.setSelectedTextColor(Color.RED);
		
		JScrollPane jsp1=new JScrollPane(text1,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		JScrollPane jsp2=new JScrollPane(text2,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		button1=new JButton("-->");
		button1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(text1.getSelectedText() != null)
				{
					text2.append("\n"+text1.getSelectedText()+"\n");
				}
				else
				{
					text2.append("\n"+text1.getText()+"\n");
				}
			}
		});
		button2=new JButton("<--");
		button2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(text2.getSelectedText() != null)
				{
					text1.append("\n"+text2.getSelectedText()+"\n");
				}
				else
				{
					text1.append("\n"+text2.getText()+"\n");
				}
			}
		});
		JPanel panel1=new JPanel();
		panel1.add(jsp1);
		panel1.add(button1);
		Border etched=BorderFactory.createEtchedBorder();
		panel1.setBorder(etched);
		
		JPanel panel2=new JPanel();
		panel2.add(jsp2);
		panel2.add(button2);
		panel2.setBorder(etched);
		
		Container con=frame.getContentPane();
		con.add(panel1,"West");
		con.add(panel2,"East");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}
