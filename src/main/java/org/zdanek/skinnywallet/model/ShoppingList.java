package org.zdanek.skinnywallet.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class ShoppingList {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@OneToMany(targetEntity=Item.class, mappedBy="shoppingList", fetch=FetchType.EAGER)
	private List<Item> items;
	private double sum;
	private Date dateOfShooping;
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	public double getSum() {
		return sum;
	}
	public void setSum(double sum) {
		this.sum = sum;
	}
	public Date getDateOfShooping() {
		return dateOfShooping;
	}
	public void setDateOfShooping(Date dateOfShooping) {
		this.dateOfShooping = dateOfShooping;
	}
	@Override
	public String toString() {
		return "ShoppingList [id=" + id + ", sum=" + sum + ", dateOfShooping=" + dateOfShooping + "]";
	}
	

	
	
	

}
