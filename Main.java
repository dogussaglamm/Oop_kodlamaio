package kodlamaio_oop_ödev;

import java.util.ArrayList;
import java.util.List;

import kodlamaio_oop_ödev.business.CategoryManager;
import kodlamaio_oop_ödev.business.CourseManager;
import kodlamaio_oop_ödev.business.InstructorManager;
import kodlamaio_oop_ödev.coreLogging.DatabaseLogger;
import kodlamaio_oop_ödev.coreLogging.FileLogger;
import kodlamaio_oop_ödev.coreLogging.Logger;
import kodlamaio_oop_ödev.dataAccess.HibernateCategoryDao;
import kodlamaio_oop_ödev.dataAccess.HibernateInstructorDao;
import kodlamaio_oop_ödev.dataAccess.JdbcCourseDao;
import kodlamaio_oop_ödev.entities.Category;
import kodlamaio_oop_ödev.entities.Course;
import kodlamaio_oop_ödev.entities.Instructor;

public class Main {
	
	public static void main(String[] args) throws Exception {
		
		Logger[] loggers = { new DatabaseLogger(), new FileLogger() };
		
		Category category1 = new Category(1, "Java");
		// Category category2 = new Category(2, "Java");
		List<Category> categoryList = new ArrayList<>();
		
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers, categoryList);
		
		categoryManager.add(category1);
		// categoryManager.add(category2);
		
		Course course1 = new Course(1, "Python", 8);
		Course course2 = new Course(2, "C++", 20);
		
		CourseManager courseManager = new CourseManager(new JdbcCourseDao(), loggers);
		
		courseManager.add(course1);
		courseManager.add(course2);
		
		Instructor instructor = new Instructor(1, "Engin", "Demiroğ");
		
		InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), loggers);
		
		instructorManager.add(instructor);
	}
}
