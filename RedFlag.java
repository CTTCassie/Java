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
    //�������ӵ������ȥ
    fr.add(pan);
    fr.setVisible(true);
  }
}