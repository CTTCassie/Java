package course;

public class MyCourseListener implements CourseChangeListener{
	public void courseChange(CourseChangeEvent e){
		System.out.print("�¼������е���Ϣ:�¼�Դ"+e.getSource().getClass().getName());
		System.out.print("���������¼�");
		System.out.println(e.toString());
	}
}
