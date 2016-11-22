import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class popupandmenu extends MouseAdapter implements ActionListener{
	JFrame frame=new JFrame();
	JPopupMenu menu=new JPopupMenu("popupmenu");
	public static void main(String[] args)
	{
		popupandmenu m=new popupandmenu();
		m.go();
	}
	public void go()
	{
		JMenuBar mb=new JMenuBar();
		frame.setJMenuBar(mb);
		JMenu m;
		JMenu sub;
		JMenuItem item;
		
		m=new JMenu("文件");
		m.setMnemonic(KeyEvent.VK_G);
		mb.add(m);
		item=new JMenuItem("打开",KeyEvent.VK_O);
		m.add(item);
		item=new JMenuItem("保存",KeyEvent.VK_S);
		item.setEnabled(false);
		m.add(item);
		item=new JMenuItem("关闭");
		item.setMnemonic(KeyEvent.VK_C);
		m.add(item);
		m.addSeparator();
		item=new JMenuItem("退出");
		item.setMnemonic(KeyEvent.VK_E);
		item.addActionListener(this);
		m.add(item);
		
		m=new JMenu("格式");
		m.setMnemonic(KeyEvent.VK_S);
		mb.add(m);
		sub=new JMenu("字体");
		m.add(sub);
		item=new JMenuItem("宋体",KeyEvent.VK_T);
		sub.add(item);
		item=new JMenuItem("黑体",KeyEvent.VK_H);
		sub.add(item);
		sub=new JMenu("颜色");
		m.add(sub);
		item=new JMenuItem("前景色",KeyEvent.VK_Q);
		sub.add(item);
		item=new JMenuItem("背景色",KeyEvent.VK_B);
		sub.add(item);
		m.addSeparator();
		JCheckBoxMenuItem cb = new JCheckBoxMenuItem("自动换行",true);
		m.add(cb);
		m.addSeparator();
		JRadioButtonMenuItem rm = new JRadioButtonMenuItem("大",true);
		ButtonGroup g = new ButtonGroup();
		m.add(rm);
		g.add(rm);
		rm = new JRadioButtonMenuItem("小");
		m.add(rm);
		g.add(rm);
		
		m=new JMenu("编辑");
		mb.add(m);
		item = new JMenuItem("复制",KeyEvent.VK_C);
		m.add(item);
		item=new JMenuItem("粘贴");
		m.add(item);
		m.addSeparator();
		item=new JMenuItem("替换");
		m.add(item);
		item=new JMenuItem("全选");
		m.add(item);
		
		JMenuItem it=new JMenuItem("剪切",KeyEvent.VK_J);    //弹出菜单
		menu.add(it);
		menu.addSeparator();
		it=new JMenuItem("复制",KeyEvent.VK_F);
		menu.add(it);
		sub=new JMenu("字体");
		menu.add(sub);
		it=new JMenuItem("宋体",KeyEvent.VK_S);
		sub.add(it);
		it=new JMenuItem("黑体",KeyEvent.VK_B);
		sub.add(it);
		it=new JMenuItem("加粗",KeyEvent.VK_J);
		sub.add(it);
		menu.add(sub);
		it=new JMenuItem("段落",KeyEvent.VK_D);
		menu.add(it);
		it=new JMenuItem("退出");
		it.addActionListener(this);
		menu.add(it);
		
		Container con=frame.getContentPane();
		con.addMouseListener(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,300);
		frame.setVisible(true);
	}
	public void mousePressed(MouseEvent e)
	{
		PopUpShow(e);
	}
	public void mouseReleased(MouseEvent e)
	{
		PopUpShow(e);
	}
	private void PopUpShow(MouseEvent e)
	{
		if(e.isPopupTrigger())
		{
			menu.show(e.getComponent(),e.getX(),e.getY());
		}
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand() == "退出")
		{
			System.exit(0);
		}
	}
}
