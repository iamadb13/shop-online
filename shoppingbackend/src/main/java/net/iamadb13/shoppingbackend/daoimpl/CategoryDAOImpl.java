package net.iamadb13.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.iamadb13.shoppingbackend.dao.CategoryDAO;
import net.iamadb13.shoppingbackend.dto.Category;


@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {
	
	private static List<Category> categories = new ArrayList<>();
	
	static {
		Category category = new Category();
		
		category.setId(1);
		category.setName("TV");
		category.setDescription("Expensive");
		category.setActive(true);
		
		categories.add(category);
	}

	@Override
	public List<Category> list() {
		
		return categories;
	}

	@Override
	public Category get(int id) {
		
		for(Category category : categories) {
			if(category.getId() == id) return category;
		}
		
		return null;
	}

}
