import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.*;

public class TwoStatus {
	JFrame frame=new JFrame("������������");
	JCheckBox b1=new JCheckBox("����Ϸ");          //��ѡ��
	JCheckBox b2=new JCheckBox("������");
	JCheckBox b3=new JCheckBox("������");
	
	JCheckBox b4=new JCheckBox("��");          //��ѡ��ʵ�ֵ���Ч��
	JCheckBox b5=new JCheckBox("��");
	JCheckBox b6=new JCheckBox("˯");
	
	JRadioButton rb1=new JRadioButton("����");  //������ťʵ�ָ�ѡЧ��
	JRadioButton rb2=new JRadioButton("��ë��");
	JRadioButton rb3=new JRadioButton("ƹ����");
	
	JRadioButton rb4=new JRadioButton("��");  //������ť
	JRadioButton rb5=new JRadioButton("����");
	
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
		Border border = BorderFactory.createTitledBorder(etched, "1.��ͨ�����ֻ���ʲ�(��ѡ)");
		panel1.setBorder(border);	//���ñ߿�
		
		panel2.add(b4);
		panel2.add(b5);
		panel2.add(b6);
		border=BorderFactory.createTitledBorder(etched,"2.��ƽʱϲ����ʲ�(��ѡ)");
		panel2.setBorder(border);
		ButtonGroup g1=new ButtonGroup();     //���ð�ť��ʹ�ø�ѡ��ʵ�ֵ�ѡЧ��
		g1.add(b4);
		g1.add(b5);
		g1.add(b6);
		
		panel3.add(rb1);
		panel3.add(rb2);
		panel3.add(rb3);
		border=BorderFactory.createTitledBorder(etched,"3.��ϲ��ʲ���˶�?(��ѡ)");
		panel3.setBorder(border);
		
		panel4.add(rb4);
		panel4.add(rb5);
		border=BorderFactory.createTitledBorder(etched,"4.�㰮����(��ѡ)");
		panel4.setBorder(border);
		ButtonGroup g2=new ButtonGroup();     //���ð�ť��ʵ�ֵ�ѡЧ��
		g2.add(rb4);
		g2.add(rb5);
		
		JScrollPane jsp=new JScrollPane(text,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);     //���ù���Ч��
		panel5.setLayout(new BorderLayout());
		panel5.add(jsp);
		border = BorderFactory.createTitledBorder(etched, "Display");
		panel5.setBorder(border);	   //���ñ߿�
		
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