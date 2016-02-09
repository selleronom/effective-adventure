package entity.ejb;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Recipe")
public class Recipe {
	private String pNumber;
	private String iNumber;
	private int quantity;
	private Ingredient ingredient;
	private Product product;

	@Id
	@Column(name = "pNumber")
	public String getpNumber() {
		return pNumber;
	}

	public void setpNumber(String pNumber) {
		this.pNumber = pNumber;
	}

	@Id
	@Column(name = "iNumber")
	public String getiNumber() {
		return iNumber;
	}

	public void setiNumber(String iNumber) {
		this.iNumber = iNumber;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Ingredient getIngredient() {
		return ingredient;
	}

	public void setIngredient(Ingredient ingredient) {
		this.ingredient = ingredient;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}