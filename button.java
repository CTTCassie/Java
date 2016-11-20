import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.*;

public class button implements ActionListener{
	JFrame frame=new JFrame("个人简历");
	JLabel label1,label2,label3;
	JTextField text1,text2,text3;
	JRadioButton rb1,rb2;
	JCheckBox b1,b2,b3,b;
	JCheckBox b4,b5,b6;
	JTextArea text;
	JButton bu;
	public static void main(String[] args)
	{
		button ts=new button();
		ts.go();
	}
	public void go()
	{
		JPanel panel=new JPanel();
		JPanel panel1=new JPanel();
		JPanel panel2=new JPanel();
		JPanel panel3=new JPanel();
		JPanel panel4=new JPanel();
		JPanel panel5=new JPanel();
		
		text1=new JTextField(10);
		text2=new JTextField(10);
		text3=new JTextField(10);
		label1 =new JLabel("姓名");
		label2=new JLabel("就读学校");
		label3=new JLabel("学号");
		panel.add(label1);
		panel.add(text1);
		panel.add(label2);
		panel.add(text2);
		panel.add(label3);
		panel.add(text3);
		Border etched = BorderFactory.createEtchedBorder();
		Border border = BorderFactory.createTitledBorder(etched,"1.基本信息");
		panel.setBorder(border);
		
		rb1=new JRadioButton("女",true);  //单选按钮,默认是女
		rb2=new JRadioButton("男");
		panel1.add(rb1);
		panel1.add(rb2);
		border=BorderFactory.createTitledBorder(etched,"2.性别");
		panel1.setBorder(border);
		ButtonGroup g1=new ButtonGroup();  //设置按钮组实现单选效果
		g1.add(rb1);
		g1.add(rb2);
		
		b1=new JCheckBox("特殊本科");        //设置按钮组使得复选框实现单选效果
		b2=new JCheckBox("普通本科",true);
		b3=new JCheckBox("专科");
		b=new JCheckBox("其他...");
		panel2.add(b1);
		panel2.add(b2);
		panel2.add(b3);
		panel2.add(b);
		etched = BorderFactory.createEtchedBorder();
		border = BorderFactory.createTitledBorder(etched, "3.教育背景");
		panel2.setBorder(border);
		ButtonGroup g2=new ButtonGroup(); 
		g2.add(b1);
		g2.add(b2);
		g2.add(b3);
		g2.add(b);
		
		b4=new JCheckBox("英语四级"); 
		b5=new JCheckBox("计算机二级");
		b6=new JCheckBox("其他...");
		panel3.add(b4);
		panel3.add(b5);
		panel3.add(b6);
		border=BorderFactory.createTitledBorder(etched,"4.技能证书(多选)");
		panel3.setBorder(border);
		
		text=new JTextArea("了解...掌握...",2,30);
		JScrollPane jsp=new JScrollPane(text,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		panel4.add(jsp);
		border = BorderFactory.createTitledBorder(etched, "5.自我评价");
		panel4.setBorder(border);
		
		JButton bu=new JButton("提交");
		bu.addActionListener(this);
		panel5.add(bu);
		border = BorderFactory.createTitledBorder(etched);
		panel5.setBorder(border);
		
		Container con=frame.getContentPane();
		con.setLayout(new GridLayout(0,1));
		frame.add(panel);
		frame.add(panel1);
		frame.add(panel2);
		frame.add(panel3);
		frame.add(panel4);
		frame.add(panel5);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,600);
		frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		System.exit(0);
	}
}