import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.*;

public class TwoStatus {
	JFrame frame=new JFrame("个人情况调查表");
	JCheckBox b1=new JCheckBox("打游戏");          //复选框
	JCheckBox b2=new JCheckBox("查资料");
	JCheckBox b3=new JCheckBox("看视屏");
	
	JCheckBox b4=new JCheckBox("吃");          //复选框实现单旋效果
	JCheckBox b5=new JCheckBox("玩");
	JCheckBox b6=new JCheckBox("睡");
	
	JRadioButton rb1=new JRadioButton("篮球");  //单旋按钮实现复选效果
	JRadioButton rb2=new JRadioButton("羽毛球");
	JRadioButton rb3=new JRadioButton("乒乓球");
	
	JRadioButton rb4=new JRadioButton("爱");  //单旋按钮
	JRadioButton rb5=new JRadioButton("不爱");
	
	JTextArea text=new JTextArea();
	public static void main(String[] args)
	{
		TwoStatus ts=new TwoStatus();
		ts.go();
	}
	public void go()
	{
		JPanel panel1=new JPanel();
		JPanel panel2=new JPanel();
		JPanel panel3=new JPanel();
		JPanel panel4=new JPanel();
		JPanel panel5=new JPanel();
		JPanel panel6=new JPanel();
		JPanel panel7=new JPanel();
		
		panel1.add(b1);
		panel1.add(b2);
		panel1.add(b3);
		Border etched = BorderFactory.createEtchedBorder();
		Border border = BorderFactory.createTitledBorder(etched, "1.你通常用手机做什仫？(多选)");
		panel1.setBorder(border);	//设置边框
		
		panel2.add(b4);
		panel2.add(b5);
		panel2.add(b6);
		border=BorderFactory.createTitledBorder(etched,"2.你平时喜欢做什仫？(单选)");
		panel2.setBorder(border);
		ButtonGroup g1=new ButtonGroup();     //设置按钮组使得复选框实现单选效果
		g1.add(b4);
		g1.add(b5);
		g1.add(b6);
		
		panel3.add(rb1);
		panel3.add(rb2);
		panel3.add(rb3);
		border=BorderFactory.createTitledBorder(etched,"3.你喜欢什仫运动?(多选)");
		panel3.setBorder(border);
		
		panel4.add(rb4);
		panel4.add(rb5);
		border=BorderFactory.createTitledBorder(etched,"4.你爱我吗？(单选)");
		panel4.setBorder(border);
		ButtonGroup g2=new ButtonGroup();     //设置按钮组实现单选效果
		g2.add(rb4);
		g2.add(rb5);
		
		JScrollPane jsp=new JScrollPane(text,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);     //设置滚动效果
		panel5.setLayout(new BorderLayout());
		panel5.add(jsp);
		border = BorderFactory.createTitledBorder(etched, "Display");
		panel5.setBorder(border);	   //设置边框
		
		ItemListener item1=new ItemListener()
		{
			public void itemStateChanged(ItemEvent e)
			{
				JCheckBox j=(JCheckBox)e.getItem();
				if(j == b1)
				{
					text.append("\n"+"b1"+b1.isSelected());
				}
				else if(j == b2)
				{
					text.append("\n"+"b2"+b2.isSelected());
				}
				else if(j == b3)
				{
					text.append("\n"+"b3"+b3.isSelected());
				}
				else if(j == b4)
				{
					text.append("\n"+"b4"+b4.isSelected());
				}
				else if(j == b5)
				{
					text.append("\n"+"b5"+b5.isSelected());
				}
				else      //j == b6
				{
					text.append("\n"+"b6"+b6.isSelected());
				}
			}
		};
		b1.addItemListener(item1);
		b2.addItemListener(item1);
		b3.addItemListener(item1);
		b4.addItemListener(item1);
		b5.addItemListener(item1);
		b6.addItemListener(item1);
		ItemListener item2=new ItemListener()
		{
			public void itemStateChanged(ItemEvent e)
			{
				JRadioButton b=(JRadioButton)e.getSource();
				if(b == rb1)
				{
					text.append("\n"+"rb1"+rb1.isSelected());
				}
				else if(b == rb2)
				{
					text.append("\n"+"rb2"+rb2.isSelected());
				}
				else if(b == rb3)
				{
					text.append("\n"+"rb3"+rb3.isSelected());
				}
				else if(b == rb4)
				{
					text.append("\n"+"rb4"+rb4.isSelected());
				}
				else if(b == rb5)
				{
					text.append("\n"+"rb5"+rb5.isSelected());
				}
			}
		};
		rb1.addItemListener(item2);
		rb2.addItemListener(item2);
		rb3.addItemListener(item2);
		rb4.addItemListener(item2);
		rb5.addItemListener(item2);
		
		panel6.setLayout(new GridLayout(0,1));
		panel6.add(panel1);
		panel6.add(panel2);
		panel7.setLayout(new GridLayout(0,1));
		panel7.add(panel3);
		panel7.add(panel4);
		
		Container con=frame.getContentPane();
		con.setLayout(new GridLayout(0,1));
		frame.add(panel6);
		frame.add(panel7);
		frame.add(panel5);
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}