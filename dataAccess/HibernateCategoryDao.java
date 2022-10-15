package kodlamaio_oop_ödev.dataAccess;

import kodlamaio_oop_ödev.entities.Category;

public class HibernateCategoryDao implements CategoryDao {
	
	@Override
	public void add(Category category) {
		System.out.println("Hibernate ile eklendi : " + category.getCategoryName());
		
	}
	
}
