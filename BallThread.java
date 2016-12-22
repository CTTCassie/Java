package xianchen;

import java.awt.*;
import java.applet.*;
@SuppressWarnings("serial")
public class BallThread extends Applet implements Runnable{
	Thread red, blue;
	Graphics redPen, bluePen;
	int t=0;
	public void init(){
		red = new Thread(this);
		blue = new Thread(this);
		redPen = getGraphics();
		bluePen = getGraphics();
		redPen.setColor(Color.red);
		bluePen.setColor(Color.blue);
	}
	public void start(){
		red.start();
		blue.start();
	}
	@SuppressWarnings("static-access")
	public void run(){
		while(true){
			t=t+1;
			if(Thread.currentThread()==red){      //红线程
				if(t>100)
					t=0;
				redPen.clearRect(0,0,110,400);
				redPen.fillOval(0,(int)(1.0/2*t*9.8),20,20);
				try{
					red.sleep(40);
				}
				catch(InterruptedException e){}
			}
			else{    //Thread.currentThread()==blue   蓝线程
				bluePen.clearRect(120,0,900,500);
			    bluePen.fillOval(120+7*t,(int)(1.0/2*t*9.8),20,20);
				try{
					blue.sleep(40);
				}
				catch(InterruptedException e){}
			}
		}
	}
}
