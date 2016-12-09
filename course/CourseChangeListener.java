package course;

import java.util.EventListener;

public interface CourseChangeListener extends EventListener {
	void courseChange(CourseChangeEvent e);    //处理招生事件的方法
}