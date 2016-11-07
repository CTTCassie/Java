import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class JTextAreaDemo {
	JFrame frame=new JFrame("JTextAreaDemo  1");
	JTextArea text1;
	JTextArea text2;
	JButton copy;
	JButton clear;
	public static void main(String[] args)
	{
		JTextAreaDemo ta=new JTextAreaDemo();
		ta.go();
	}
	public void go()
	{
		text1=new JTextArea(3,15);
		text1.setSelectedTextColor(Color.BLUE);
		text2=new JTextArea(7,20);
		text2.setEditable(false);      //text2²»¿É±à¼­
		
		JScrollPane jsp1 = new JScrollPane(text1,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			JScrollPane jsp2 = new JScrollPane(text2,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
		copy=new JButton("copy");
		copy.addActionListener(new ActionListener()
		{	
			public void actionPerformed(ActionEvent e)
			{	
				if (text1.getSelectedText() != null)
					text2.append(text1.getSelectedText()+"\n");
				else
					text2.append("\n"+text1.getText()+"\n");
			}
		});
		
		clear=new JButton("clear");
		clear.addActionListener(new ActionListener()
		{	
			public void actionPerformed(ActionEvent e)
			{	
			   text2.setText("");
			}
		});
		
		JPanel panel1=new JPanel();
		panel1.add(jsp1);
		panel1.add(copy);
		Border etched = BorderFactory.createEtchedBorder();
		panel1.setBorder(etched);
		
		JPanel panel2=new JPanel();
		panel2.add(jsp2);
		panel2.add(clear);
		panel2.setBorder(etched);
		
		Container con=frame.getContentPane();
		con.add(panel1,"Center");
		con.add(panel2,"South");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}