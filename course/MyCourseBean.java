package course;

import java.util.Vector;

public class MyCourseBean {
	private String name="";     //�γ���
	private int countnum=0;     //ѡ��ѧ��
	private int maxnum=0;       //���������
	private Vector<CourseChangeListener> listeners = new Vector<CourseChangeListener>();
	MyCourseBean(){
		this.name = "����";
	}
	MyCourseBean(String na){
		this.name=na;
	}
	public String getCourse(){      //���ؿγ���
		return this.name;
	}
	public void setCount(String str){ //�����ѧ��
		this.name=str;
		this.countnum++;
		notifySourceChange();
	}
	public int getCount(){     //����ѡ�ε�ѧ������
		return this.countnum;
	}
	public int getMax(){     //���������޶�
		return this.maxnum;
	}
	public void setMax(int max){    //�����µ�������
		this.maxnum=max;
	}
	public synchronized void addCourseChangeListener(CourseChangeListener l) {
		listeners.add(l);
	}
	public synchronized void removeCourseChangeListener(CourseChangeListener l) {
		listeners.removeElement(l);
	}
	protected void notifySourceChange() {
		    Vector v;
		    CourseChangeEvent e = new CourseChangeEvent(this, maxnum, countnum);
		    synchronized (this) 
		    {
		      v = (Vector) listeners.clone();
		    }
		    for (int i = 0; i < v.size(); i++) 
		    {
		    	((CourseChangeListener) v.elementAt(i)).courseChange(e);
		    }
	}
}
