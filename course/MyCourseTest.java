package course;

public class MyCourseTest {
	public static void main(String[] args){
		MyCourseListener c=new MyCourseListener();
		MyCourseBean bean=new MyCourseBean();
		bean.addCourseChangeListener(c);
		 //���������޶�2
		bean.setMax(2);
		 //���3��ѧ��
		bean.setCount("C����");
		System.out.println("�γ�����:"+bean.getCount()+"�γ���:"+bean.getCourse()+"�����޶�:"+bean.getMax());
		bean.setCount("����");
		System.out.println("�γ�����:"+bean.getCount()+"�γ���:"+bean.getCourse()+"�����޶�:"+bean.getMax());
		bean.setCount("���ݽṹ");
		System.out.println("�γ�����:"+bean.getCount()+"�γ���:"+bean.getCourse()+"�����޶�:"+bean.getMax());
	}
}