import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;
 
public class text3 extends JFrame implements ActionListener {
	JButton button1 = new JButton("华氏温度");
    JButton button2 = new JButton("摄氏温度");
    JButton button3 = new JButton("K氏温度");
    JTextField text1 = new JTextField(10);
    JTextField text2 = new JTextField(10);
    JTextField text3 = new JTextField(10);
    float c,f,k;
    public text3() 
    {
        super("华氏摄氏K氏温度转换");
        try 
        {
            Init();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    public void Init() 
    {
    	button1.setBounds(30,30,70,25);
		button2.setBounds(30,110,70,25);
		button3.setBounds(30,190,70,25);
        text1.setBounds(150,30,100,25);
        text2.setBounds(150,110,100,25);
        text3.setBounds(150,190,100,25);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        Container con = getContentPane();
        con.setLayout(null);
        con.add(text1);
        con.add(text2);
        con.add(text3);
        con.add(button1);
        con.add(button2);
        con.add(button3);
        this.setSize(400,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public static void main(String[] args)
    {
        new text3();
    }
    public void actionPerformed(ActionEvent e) {
        //华氏温度f,摄氏度c,K氏温度k
    	//c=(f-32)*5/9
    	//k=c+273
        if (e.getSource() == button2) {
        	try 
            {
        		//华氏转摄氏
        		f=Float.parseFloat(text1.getText());
        		c=(f-32)*5/9;
                text2.setText(String.valueOf(c));
            }
            catch (Exception ex) 
            {
                ex.printStackTrace();
            }
        }
        if (e.getSource() == button3) {
            try 
            {
            	//摄氏转K氏
            	f=Float.parseFloat(text2.getText());
            	k=f+273;
                text3.setText(String.valueOf(k));
            } 
            catch (Exception ex) 
            {
                ex.printStackTrace();
            }
        }
    }
  }
