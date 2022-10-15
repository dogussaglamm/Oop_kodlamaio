package kodlamaio_oop_ödev.business;

import kodlamaio_oop_ödev.coreLogging.Logger;
import kodlamaio_oop_ödev.dataAccess.InstructorDao;
import kodlamaio_oop_ödev.entities.Instructor;

public class InstructorManager {
	
	private InstructorDao instructorDao;
	private Logger[] loggers;
	
	public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
		
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}
	
	public void add(Instructor instructor) {
		instructorDao.add(instructor);
		
		for (Logger logger : loggers) {
			logger.log(instructor.getName());
		}
	}
}
