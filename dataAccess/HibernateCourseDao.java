package kodlamaio_oop_ödev.dataAccess;

import kodlamaio_oop_ödev.entities.Course;

public class HibernateCourseDao implements CourseDao {
	
	@Override
	public void add(Course course) {
		System.out.println("Hibernate ile eklendi : " + course.getCourseName());
	}
	
}
