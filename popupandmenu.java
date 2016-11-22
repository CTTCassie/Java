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
		
		m=new JMenu("�ļ�");
		m.setMnemonic(KeyEvent.VK_G);
		mb.add(m);
		item=new JMenuItem("��",KeyEvent.VK_O);
		m.add(item);
		item=new JMenuItem("����",KeyEvent.VK_S);
		item.setEnabled(false);
		m.add(item);
		item=new JMenuItem("�ر�");
		item.setMnemonic(KeyEvent.VK_C);
		m.add(item);
		m.addSeparator();
		item=new JMenuItem("�˳�");
		item.setMnemonic(KeyEvent.VK_E);
		item.addActionListener(this);
		m.add(item);
		
		m=new JMenu("��ʽ");
		m.setMnemonic(KeyEvent.VK_S);
		mb.add(m);
		sub=new JMenu("����");
		m.add(sub);
		item=new JMenuItem("����",KeyEvent.VK_T);
		sub.add(item);
		item=new JMenuItem("����",KeyEvent.VK_H);
		sub.add(item);
		sub=new JMenu("��ɫ");
		m.add(sub);
		item=new JMenuItem("ǰ��ɫ",KeyEvent.VK_Q);
		sub.add(item);
		item=new JMenuItem("����ɫ",KeyEvent.VK_B);
		sub.add(item);
		m.addSeparator();
		JCheckBoxMenuItem cb = new JCheckBoxMenuItem("�Զ�����",true);
		m.add(cb);
		m.addSeparator();
		JRadioButtonMenuItem rm = new JRadioButtonMenuItem("��",true);
		ButtonGroup g = new ButtonGroup();
		m.add(rm);
		g.add(rm);
		rm = new JRadioButtonMenuItem("С");
		m.add(rm);
		g.add(rm);
		
		m=new JMenu("�༭");
		mb.add(m);
		item = new JMenuItem("����",KeyEvent.VK_C);
		m.add(item);
		item=new JMenuItem("ճ��");
		m.add(item);
		m.addSeparator();
		item=new JMenuItem("�滻");
		m.add(item);
		item=new JMenuItem("ȫѡ");
		m.add(item);
		
		JMenuItem it=new JMenuItem("����",KeyEvent.VK_J);    //�����˵�
		menu.add(it);
		menu.addSeparator();
		it=new JMenuItem("����",KeyEvent.VK_F);
		menu.add(it);
		sub=new JMenu("����");
		menu.add(sub);
		it=new JMenuItem("����",KeyEvent.VK_S);
		sub.add(it);
		it=new JMenuItem("����",KeyEvent.VK_B);
		sub.add(it);
		it=new JMenuItem("�Ӵ�",KeyEvent.VK_J);
		sub.add(it);
		menu.add(sub);
		it=new JMenuItem("����",KeyEvent.VK_D);
		menu.add(it);
		it=new JMenuItem("�˳�");
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
		if(e.getActionCommand() == "�˳�")
		{
			System.exit(0);
		}
	}
}
