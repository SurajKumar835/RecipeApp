package suraj_pkg.recipeapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import suraj_pkg.recipeapp.entity.Recipe;
@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Integer> {

}
