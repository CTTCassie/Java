package course;

import java.util.EventObject;

public class CourseChangeEvent extends EventObject{
	private int maxnum=0;      //招生限额
	private int countnum=0;    //选课学生人数
	public CourseChangeEvent(Object source,int max,int count) {
		super(source);
		this.maxnum=max;
		this.countnum=count;
	}
	public String toString()
	{
		String str="";
		if(countnum > maxnum){
			str="超出招生限额:"+(countnum-maxnum);
		}
		return str;
	}
}