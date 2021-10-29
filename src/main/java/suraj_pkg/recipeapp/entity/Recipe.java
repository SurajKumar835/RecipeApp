package suraj_pkg.recipeapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="recipe")
public class Recipe {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name="image")
	private String imageUrl;
	@Column(name="category")
	private String category;
	@Column(name="label")
	private String label;
	@Column(name = "price")
	private String price;
	@Column(name = "description")
	private String description;
	
	public Recipe() {
		
	}

	public Recipe(String name, String imageUrl, String category, String label, String price, String description) {
		this.name = name;
		this.imageUrl = imageUrl;
		this.category = category;
		this.label = label;
		this.price = price;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "RecipeEntity [id=" + id + ", name=" + name + ", imageUrl=" + imageUrl + ", category=" + category
				+ ", label=" + label + ", price=" + price + ", description=" + description + "]";
	}
	
}
