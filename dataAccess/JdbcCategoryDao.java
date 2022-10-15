package kodlamaio_oop_ödev.dataAccess;

import kodlamaio_oop_ödev.entities.Category;

public class JdbcCategoryDao implements CategoryDao {
	
	@Override
	public void add(Category category) {
		System.out.println("Jdbc ile eklendi : " + category.getCategoryName());
		
	}
	
}
