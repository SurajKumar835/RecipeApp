package suraj_pkg.recipeapp.service;

import java.util.List;
import java.util.Optional;

import suraj_pkg.recipeapp.entity.Recipe;

public interface RecipeService {

	List<Recipe> findAll();

	public Recipe findById(int id);

}
