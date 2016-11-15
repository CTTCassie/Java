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
		JMenuBar mb=new JMenuBar();    //创建菜单栏
		frame.setJMenuBar(mb);
		JMenu m;          //菜单
		JMenu sub;        //子菜单
		JMenuItem item;   //菜单项
		
		m=new JMenu("File");
		m.setMnemonic(KeyEvent.VK_A);
		mb.add(m);
		//File的菜单项
		item=new JMenuItem("Open");
		item.setAccelerator(KeyStroke.getKeyStroke(
		KeyEvent.VK_1, ActionEvent.ALT_MASK));		//设置加速键
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
		m.add(new JSeparator());    //加入分隔线
		
		item=new JMenuItem("Exit");
		item.setMnemonic(KeyEvent.VK_O);
		item.addActionListener(this);
		m.add(item);
		
		m=new JMenu("Option");
		mb.add(m);
		//Option的菜单项
		m.add("Font");
		//Font中的子菜单
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
		m.add(new JSeparator());     //加入分隔线
		JCheckBoxMenuItem cb = new JCheckBoxMenuItem("Always On Top");
		cb.addItemListener(this);
		m.add(cb);
		m.addSeparator();
		JRadioButtonMenuItem rm = new JRadioButtonMenuItem("Small",true);
		rm.addItemListener(this);
		m.add(rm);
		ButtonGroup g = new ButtonGroup();     //设置按钮组实现单选效果
		g.add(rm);
		rm = new JRadioButtonMenuItem("Large");
		rm.addItemListener(this);
		m.add(rm);
		g.add(rm);
		
		m=new JMenu("Help");
		mb.add(m);
		//Help中的菜单项
		item = new JMenuItem( "about" ,new ImageIcon("dukeWaveRed.gif"));
		item.addActionListener(this);
		m.add(item);
		
		text.setEditable(false);       //text设置不可编辑
		
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
			text.setText(str+"选择");
		else
			text.setText(str+"取消");
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
