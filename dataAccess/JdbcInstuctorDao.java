package kodlamaio_oop_ödev.dataAccess;

import kodlamaio_oop_ödev.entities.Instructor;

public class JdbcInstuctorDao implements InstructorDao {
	
	@Override
	public void add(Instructor instructor) {
		System.out.println("Jdbc ile eklendi : " + instructor.getName());
		
	}
	
}
