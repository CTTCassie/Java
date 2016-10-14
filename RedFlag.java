import java.awt.*;
public class RedFlag extends Frame{
   public RedFlag(String str){
              super(str);
  }
  public static void main(String args[]){
    RedFlag fr=new RedFlag("Frame with panel");
    Panel pan=new Panel();
    fr.setSize(500,500);
    fr.setBackground(Color.red);
    fr.setLayout(null);
    pan.setSize(100,100);
    pan.setBackground(Color.yellow);
    //把面板添加到框架中去
    fr.add(pan);
    fr.setVisible(true);
  }
}