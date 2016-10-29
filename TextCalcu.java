import java.awt.*;
import javax.swing.*;
public class TextCalcu
{	
    private JFrame frame;
	private JPanel p1,p2,p3;
	JTextField text;
	public static void main(String []args)
	{	
	    TextCalcu that = new TextCalcu();
		that.go();      
    }
	void go()
	{	
	    frame = new JFrame("Calcu");
		Container contentPane = frame.getContentPane();
		p1 = new JPanel();
		p1.setLayout(new BoxLayout(p1,BoxLayout.Y_AXIS));
		p1.add(new JLabel("number1"));
		p1.add(new JLabel("number2"));
		p1.add(new JLabel("number3"));
		contentPane.add(p1, BorderLayout.WEST);

		p2=new JPanel();
		p2.setLayout(new BoxLayout(p2,BoxLayout.Y_AXIS));
		p2.add(new JButton());
		p2.add(new JButton());
		p2.add(new JButton());
		contentPane.add(p2,BorderLayout.CENTER);

		p3 = new JPanel();
		p3.setLayout(new BoxLayout(p3, BoxLayout.X_AXIS));
		p3.add(new JButton("ADD"));
		p3.add(new JButton("SUB"));
		p3.add(new JButton("MUL"));
		p3.add(new JButton("DIV"));
		contentPane.add(p3,BorderLayout.SOUTH);
		
		frame.pack();
		frame.setVisible(true);
	}
}
