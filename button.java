import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.*;

public class button implements ActionListener{
	JFrame frame=new JFrame("���˼���");
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
		label1 =new JLabel("����");
		label2=new JLabel("�Ͷ�ѧУ");
		label3=new JLabel("ѧ��");
		panel.add(label1);
		panel.add(text1);
		panel.add(label2);
		panel.add(text2);
		panel.add(label3);
		panel.add(text3);
		Border etched = BorderFactory.createEtchedBorder();
		Border border = BorderFactory.createTitledBorder(etched,"1.������Ϣ");
		panel.setBorder(border);
		
		rb1=new JRadioButton("Ů",true);  //��ѡ��ť,Ĭ����Ů
		rb2=new JRadioButton("��");
		panel1.add(rb1);
		panel1.add(rb2);
		border=BorderFactory.createTitledBorder(etched,"2.�Ա�");
		panel1.setBorder(border);
		ButtonGroup g1=new ButtonGroup();  //���ð�ť��ʵ�ֵ�ѡЧ��
		g1.add(rb1);
		g1.add(rb2);
		
		b1=new JCheckBox("���Ȿ��");        //���ð�ť��ʹ�ø�ѡ��ʵ�ֵ�ѡЧ��
		b2=new JCheckBox("��ͨ����",true);
		b3=new JCheckBox("ר��");
		b=new JCheckBox("����...");
		panel2.add(b1);
		panel2.add(b2);
		panel2.add(b3);
		panel2.add(b);
		etched = BorderFactory.createEtchedBorder();
		border = BorderFactory.createTitledBorder(etched, "3.��������");
		panel2.setBorder(border);
		ButtonGroup g2=new ButtonGroup(); 
		g2.add(b1);
		g2.add(b2);
		g2.add(b3);
		g2.add(b);
		
		b4=new JCheckBox("Ӣ���ļ�"); 
		b5=new JCheckBox("���������");
		b6=new JCheckBox("����...");
		panel3.add(b4);
		panel3.add(b5);
		panel3.add(b6);
		border=BorderFactory.createTitledBorder(etched,"4.����֤��(��ѡ)");
		panel3.setBorder(border);
		
		text=new JTextArea("�˽�...����...",2,30);
		JScrollPane jsp=new JScrollPane(text,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		panel4.add(jsp);
		border = BorderFactory.createTitledBorder(etched, "5.��������");
		panel4.setBorder(border);
		
		JButton bu=new JButton("�ύ");
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