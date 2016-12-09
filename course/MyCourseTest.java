package course;

public class MyCourseTest {
	public static void main(String[] args){
		MyCourseListener c=new MyCourseListener();
		MyCourseBean bean=new MyCourseBean();
		bean.addCourseChangeListener(c);
		 //设置招生限额2
		bean.setMax(2);
		 //添加3个学生
		bean.setCount("C语言");
		System.out.println("课程人数:"+bean.getCount()+"课程名:"+bean.getCourse()+"招生限额:"+bean.getMax());
		bean.setCount("高数");
		System.out.println("课程人数:"+bean.getCount()+"课程名:"+bean.getCourse()+"招生限额:"+bean.getMax());
		bean.setCount("数据结构");
		System.out.println("课程人数:"+bean.getCount()+"课程名:"+bean.getCourse()+"招生限额:"+bean.getMax());
	}
}