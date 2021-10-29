package suraj_pkg.recipeapp.dao;

import java.util.List;

import suraj_pkg.recipeapp.entity.Recipe;

public interface RecipeDao {

	List<Recipe> findAll();

	Recipe findById(int id);

}
