package kodlamaio_oop_ödev.business;

import kodlamaio_oop_ödev.coreLogging.Logger;
import kodlamaio_oop_ödev.dataAccess.CourseDao;
import kodlamaio_oop_ödev.entities.Course;

public class CourseManager {
	
	private CourseDao courseDao;
	private Logger[] loggers;
	
	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		
		this.courseDao = courseDao;
		this.loggers = loggers;
	}
	
	public void add(Course course) throws Exception {
		if (course.getCoursePrice() < 0) {
			throw new Exception("Course price can not be less than 0 : " + course.getCourseName());
			
		}
		courseDao.add(course);
		
		for (Logger logger : loggers) {
			logger.log(course.getCourseName());
		}
	}
}
