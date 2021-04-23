package com.techelevator.dao;

import java.util.List;

import com.techelevator.model.Ingredient;

public interface EXAMPLE_DAO
{
	List<Ingredient> getAll();
	Ingredient getById(int id);
	Ingredient create(Ingredient ingredient);
}
