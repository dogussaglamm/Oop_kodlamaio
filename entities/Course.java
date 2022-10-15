package kodlamaio_oop_ödev.entities;

public class Course {
	
	private int courseId;
	private String courseName;
	private int coursePrice;
	
	public Course() {
		
	}
	
	public Course(int courseId, String courseName, int coursePrice) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.coursePrice = coursePrice;
	}
	
	public int getCourseId() {
		return courseId;
	}
	
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public int getCoursePrice() {
		return coursePrice;
	}
	
	public void setCoursePrice(int coursePrice) {
		this.coursePrice = coursePrice;
	}
	
}
