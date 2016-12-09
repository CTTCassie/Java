package course;

import java.util.EventObject;

public class CourseChangeEvent extends EventObject{
	private int maxnum=0;      //�����޶�
	private int countnum=0;    //ѡ��ѧ������
	public CourseChangeEvent(Object source,int max,int count) {
		super(source);
		this.maxnum=max;
		this.countnum=count;
	}
	public String toString()
	{
		String str="";
		if(countnum > maxnum){
			str="���������޶�:"+(countnum-maxnum);
		}
		return str;
	}
}