package net.iamadb13.shoppingbackend.dao;

import java.util.List;

import net.iamadb13.shoppingbackend.dto.Category;


public interface CategoryDAO {

	boolean add(Category category);
	
	List<Category> list();
	Category get(int id);
	
}
