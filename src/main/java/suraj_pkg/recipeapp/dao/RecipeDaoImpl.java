package suraj_pkg.recipeapp.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import suraj_pkg.recipeapp.entity.Recipe;
@Repository
public class RecipeDaoImpl implements RecipeDao {

	private EntityManager entityManager;
	@Autowired
	public RecipeDaoImpl(EntityManager theentityManger)
	{
			entityManager=theentityManger;
	}
	@Override
	public List<Recipe> findAll() {
		
		Session current=entityManager.unwrap(Session.class);
		Query<Recipe> q=current.createQuery("from Recipe",Recipe.class);
		return q.getResultList();
	}

	@Override
	public Recipe findById(int id) {
		Session current=entityManager.unwrap(Session.class);
		Recipe q=current.get(Recipe.class, id);
		return q;
	}
	

}
