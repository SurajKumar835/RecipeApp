package suraj_pkg.recipeapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import suraj_pkg.recipeapp.dao.RecipeDao;
import suraj_pkg.recipeapp.entity.Recipe;
@Service
public class RecipeServiceImpl implements RecipeService {
	private RecipeDao recipeDao;
	@Autowired
	public RecipeServiceImpl(RecipeDao therecipeDao)
	{
		recipeDao=therecipeDao;
	}
	@Override
	@Transactional
	public List<Recipe> findAll() {
		
		return recipeDao.findAll();
	}

	@Override
	@Transactional
	public Recipe findById(int id) {
		
		return  recipeDao.findById(id);
	}

}
