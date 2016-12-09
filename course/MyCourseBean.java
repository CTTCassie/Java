package course;

import java.util.Vector;

public class MyCourseBean {
	private String name="";     //课程名
	private int countnum=0;     //选课学生
	private int maxnum=0;       //招生最大数
	private Vector<CourseChangeListener> listeners = new Vector<CourseChangeListener>();
	MyCourseBean(){
		this.name = "高数";
	}
	MyCourseBean(String na){
		this.name=na;
	}
	public String getCourse(){      //返回课程名
		return this.name;
	}
	public void setCount(String str){ //添加新学生
		this.name=str;
		this.countnum++;
		notifySourceChange();
	}
	public int getCount(){     //返回选课的学生人数
		return this.countnum;
	}
	public int getMax(){     //返回招生限额
		return this.maxnum;
	}
	public void setMax(int max){    //设置新的招生线
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
