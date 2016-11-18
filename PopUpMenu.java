import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PopUpMenu extends MouseAdapter implements ActionListener {
	JFrame frame=new JFrame("popupmenu");
	JPopupMenu menu=new JPopupMenu();
	JTextField text=new JTextField();
	JLabel label=new JLabel("press right");
	public static void main(String[] args)
	{
		PopUpMenu m=new PopUpMenu();
		m.go();
	}
	public void go()
	{
		JMenuItem item=new JMenuItem("New",KeyEvent.VK_N);
		item.addActionListener(this);
		menu.add(item);
		item=new JMenuItem("Load",KeyEvent.VK_K);
		item.addActionListener(this);
		menu.add(item);
		item=new JMenuItem("Save",KeyEvent.VK_S);
		item.addActionListener(this);
		menu.add(item);
		
		menu.addSeparator();
		
		item=new JMenuItem("Copy",KeyEvent.VK_C);
		item.addActionListener(this);
		menu.add(item);
		item=new JMenuItem("Cut",KeyEvent.VK_U);
		item.addActionListener(this);
		menu.add(item);
		item=new JMenuItem("Paste",KeyEvent.VK_P);
		item.addActionListener(this);
		menu.add(item);
		item=new JMenuItem("Exit",KeyEvent.VK_E);
		item.addActionListener(this);
		menu.add(item);
		
		label.addMouseListener(this);
		text.setEditable(false);
		
		Container con=frame.getContentPane();
		con.add(label,"Center");
		con.add(text,"South");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,400);
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
		//显示弹出菜单是必须调用show方法
		if(e.isPopupTrigger())
		{
			menu.show(e.getComponent(),e.getX(),e.getY());
		}
	}
	public void actionPerformed(ActionEvent e)
	{
		text.setText(e.getActionCommand());
		if(e.getActionCommand() == "Exit")
		{
			System.exit(0);
		}
	}
}
