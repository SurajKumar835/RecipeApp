package suraj_pkg.recipeapp.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import suraj_pkg.recipeapp.entity.Recipe;
import suraj_pkg.recipeapp.repo.RecipeRepository;
import suraj_pkg.recipeapp.service.RecipeService;

@RestController
@RequestMapping("/recipe")
public class RecipeController {
	//private RecipeRepository recipeRepo;
	private RecipeService recipeService;
	@Autowired
	public RecipeController(RecipeService therecipeService) {
		this.recipeService = therecipeService;
	}
	@RequestMapping(value="/recipes",method=RequestMethod.GET)
	public List<Recipe> findAll()
	{
		return recipeService.findAll();
	}
	@RequestMapping(value="/recipes/{id}",method=RequestMethod.GET)
	public Recipe getRecipe(@PathVariable int id)
	{
		Optional<Recipe> result=Optional.ofNullable(recipeService.findById(id));
		Recipe e;
		if(result.isPresent())
		{
			e=result.get();
		}else
		{
			throw new RuntimeException ("Recipe id not found");
		}
		return e;
	}
	
	//for image
	@RequestMapping(value="/recipes/{id}/{show}",method=RequestMethod.GET)
	public String getImageUrl(@PathVariable int id,@PathVariable String show)
	{
		Optional<Recipe> result=Optional.ofNullable(recipeService.findById(id));
		String imageUrl;
		if(result.isPresent())
		{
			imageUrl=result.get().getImageUrl();
		}else
		{
			throw new RuntimeException ("Recipe id not found");
		}
		return imageUrl;
	}
}
