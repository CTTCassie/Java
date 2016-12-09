package course;

public class MyCourseListener implements CourseChangeListener{
	public void courseChange(CourseChangeEvent e){
		System.out.print("事件对象中的信息:事件源"+e.getSource().getClass().getName());
		System.out.print("发生招生事件");
		System.out.println(e.toString());
	}
}
