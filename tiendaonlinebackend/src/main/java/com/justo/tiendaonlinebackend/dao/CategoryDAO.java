package com.justo.tiendaonlinebackend.dao;

import java.util.List;

import com.justo.tiendaonlinebackend.dto.Category;

public interface CategoryDAO {

	List<Category> list();

	Category get(int id);
}
