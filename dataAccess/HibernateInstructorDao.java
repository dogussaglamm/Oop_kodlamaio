package kodlamaio_oop_ödev.dataAccess;

import kodlamaio_oop_ödev.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao {
	
	@Override
	public void add(Instructor instructor) {
		System.out.println("Hibernate ile eklendi : " + instructor.getName());
		
	}
	
}
