package course;

import java.util.EventListener;

public interface CourseChangeListener extends EventListener {
	void courseChange(CourseChangeEvent e);    //���������¼��ķ���
}