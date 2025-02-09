package Enum;

public class CousePurchase{
	Course course;
	/*
	 * This is called as loose coupling as no object is being created
	 * if java course python course is deleted then also it would not affect this class 
	 * as we haven't created any object
	 */
	public CousePurchase(Course course) {
		this.course = course;
	}
	public boolean buyTheCourse() {
		boolean status = course.coursePurchase();
		return status;
	}
	

}
