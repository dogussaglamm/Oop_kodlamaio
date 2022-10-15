package kodlamaio_oop_ödev.dataAccess;

import kodlamaio_oop_ödev.entities.Course;

public class JdbcCourseDao implements CourseDao {
	
	@Override
	public void add(Course course) {
		System.out.println("Jdbc ile eklendi : " + course.getCourseName());
		
	}
	
}
