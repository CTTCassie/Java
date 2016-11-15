import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class menu implements ItemListener,ActionListener{
	JFrame frame=new JFrame();
	JTextField text=new JTextField();
	public static void main(String[] args)
	{
		menu m=new menu();
		m.go();
	}
	public void go()
	{
		JMenuBar mb=new JMenuBar();    //�����˵���
		frame.setJMenuBar(mb);
		JMenu m;          //�˵�
		JMenu sub;        //�Ӳ˵�
		JMenuItem item;   //�˵���
		
		m=new JMenu("File");
		m.setMnemonic(KeyEvent.VK_A);
		mb.add(m);
		//File�Ĳ˵���
		item=new JMenuItem("Open");
		item.setAccelerator(KeyStroke.getKeyStroke(
		KeyEvent.VK_1, ActionEvent.ALT_MASK));		//���ü��ټ�
		item.addActionListener(this);
		m.add(item);
		
		item=new JMenuItem("Save",KeyEvent.VK_B);
		item.addActionListener(this);
		item.setEnabled(false);
		m.add(item);
		
		item=new JMenuItem("Close");
		item.setMnemonic(KeyEvent.VK_C);
		item.addActionListener(this);
		m.add(item);
		m.add(new JSeparator());    //����ָ���
		
		item=new JMenuItem("Exit");
		item.setMnemonic(KeyEvent.VK_O);
		item.addActionListener(this);
		m.add(item);
		
		m=new JMenu("Option");
		mb.add(m);
		//Option�Ĳ˵���
		m.add("Font");
		//Font�е��Ӳ˵�
		sub=new JMenu("Colour");
		m.add(sub);
		item=new JMenuItem("Foreground");
		item.addActionListener(this);
		item.setAccelerator(KeyStroke.getKeyStroke(
				KeyEvent.VK_2, ActionEvent.ALT_MASK));	
		sub.add(item);
		item=new JMenuItem("Background");
		item.addActionListener(this);
		item.setAccelerator(KeyStroke.getKeyStroke(
				KeyEvent.VK_3, ActionEvent.ALT_MASK));	
		sub.add(item);
		m.add(new JSeparator());     //����ָ���
		JCheckBoxMenuItem cb = new JCheckBoxMenuItem("Always On Top");
		cb.addItemListener(this);
		m.add(cb);
		m.addSeparator();
		JRadioButtonMenuItem rm = new JRadioButtonMenuItem("Small",true);
		rm.addItemListener(this);
		m.add(rm);
		ButtonGroup g = new ButtonGroup();     //���ð�ť��ʵ�ֵ�ѡЧ��
		g.add(rm);
		rm = new JRadioButtonMenuItem("Large");
		rm.addItemListener(this);
		m.add(rm);
		g.add(rm);
		
		m=new JMenu("Help");
		mb.add(m);
		//Help�еĲ˵���
		item = new JMenuItem( "about" ,new ImageIcon("dukeWaveRed.gif"));
		item.addActionListener(this);
		m.add(item);
		
		text.setEditable(false);       //text���ò��ɱ༭
		
		Container con=frame.getContentPane();
		con.add(text,"South");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,300);
		frame.setVisible(true);
	}
	public void itemStateChanged(ItemEvent e)
	{	
		int state = e.getStateChange();
		JMenuItem it = (JMenuItem)e.getSource();
		String str = it.getText();
		if (state == ItemEvent.SELECTED)
			text.setText(str+"ѡ��");
		else
			text.setText(str+"ȡ��");
	}
	public void actionPerformed(ActionEvent e)
	{	
		text.setText(e.getActionCommand());
		if (e.getActionCommand() == "Exit")
		{	
			System.exit(0);
		}
	}
}
