package kodlamaio_oop_ödev.business;

import java.util.List;

import kodlamaio_oop_ödev.coreLogging.Logger;
import kodlamaio_oop_ödev.dataAccess.CategoryDao;
import kodlamaio_oop_ödev.entities.Category;

public class CategoryManager {
	
	private CategoryDao categoryDao;
	private Logger[] loggers;
	private List<Category> categories;
	
	public CategoryManager(CategoryDao categoryDao, Logger[] loggers, List<Category> categories) {
		
		this.categoryDao = categoryDao;
		this.loggers = loggers;
		this.categories = categories;
	}
	
	public void add(Category category) throws Exception {
		for (Category category2 : categories) {
			
			if (category2.getCategoryName().equals(category2.getCategoryName())) {
				throw new Exception("This category already exists. : " + category2.getCategoryName());
			}
		}
		
		categoryDao.add(category);
		categories.add(category);
		
		for (Logger logger : loggers) {
			logger.log(category.getCategoryName());
		}
	}
}
