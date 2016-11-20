import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.*;

public class javatest42 implements ActionListener {
	JFrame frame=new JFrame("javatest42");
	JCheckBox b1,b2,b3,b4,b5,b6;
	Button button1;
	JTextField text1=new JTextField(10);
	JTextArea text2=new JTextArea();
	public static void main(String[] args)
	{
		javatest42 ts=new javatest42();
		ts.go();
	}
	public void go()
	{
		JPanel panel=new JPanel();
		JPanel panel1=new JPanel();
		JPanel panel2=new JPanel();
		
		button1=new Button("名字");
		button1.addActionListener(this);
		panel.add(text1);
		panel.add(button1);
		Border etched = BorderFactory.createEtchedBorder();
		Border border = BorderFactory.createTitledBorder(etched,"Input");
		panel.setBorder(border);
		
		b1=new JCheckBox("1.语");
		b2=new JCheckBox("2.数");
		b3=new JCheckBox("3.外");
		b4=new JCheckBox("4.操作系统");
		b5=new JCheckBox("5.数据库");
		b6=new JCheckBox("6.数据结构");
		panel1.add(b1);
		panel1.add(b2);
		panel1.add(b3);
		panel1.add(b4);
		panel1.add(b5);
		panel1.add(b6);
		border = BorderFactory.createTitledBorder(etched,"选修课(多选),专业课只能选择一门");
		panel1.setBorder(border);
		ButtonGroup g=new ButtonGroup();
		g.add(b4);
		g.add(b5);
		g.add(b6);
		
		text2.setEditable(false);
		JScrollPane jsp=new JScrollPane(text2,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		panel2.setLayout(new BorderLayout());
		panel2.add(jsp);
		border = BorderFactory.createTitledBorder(etched, "Display");
		panel2.setBorder(border);
		
		b1.addItemListener(item);
		b2.addItemListener(item);
		b3.addItemListener(item);
		b4.addItemListener(item);
		b5.addItemListener(item);
		b6.addItemListener(item);
		
		Container con=frame.getContentPane();
		con.setLayout(new GridLayout(0,1));
		con.add(panel);
		con.add(panel1);
		con.add(panel2);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,600);
		frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(text1.getText() != null)
			text2.append(text1.getText()+"\n");
	}
	ItemListener item=new ItemListener()
	{
		public void itemStateChanged(ItemEvent e)
		{
			JCheckBox j=(JCheckBox)e.getItem();
			if(j == b1)
			{
				text2.append("\nb1"+b1.isSelected());
			}
			else if(j == b2)
			{
				text2.append("\nb2"+b2.isSelected());
			}
			else if(j == b3)
			{
				text2.append("\nb3"+b3.isSelected());
			}
			else if(j == b4)
			{
				text2.append("\nb4"+b4.isSelected());
			}
			else if(j == b5)
			{
				text2.append("\nb5"+b5.isSelected());
			}
			else      //j == b6
			{
				text2.append("\nb6"+b6.isSelected());
			}
		}
	};
}