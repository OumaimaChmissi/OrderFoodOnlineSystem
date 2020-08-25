package application;

import javafx.beans.property.SimpleStringProperty;

public class Drink  
{
	private SimpleStringProperty menuDrink;
	private double price;
	private int quantity;

	//--------------------------------------
	
	public  Drink(String menuDrink,int quantity){
		this.menuDrink=new SimpleStringProperty(menuDrink);
		this.quantity=quantity;
		
	}
	
	//--------------------------------------
	
	public Drink(double price){
		this.price=price;
	}
	
	public String getMenuDrink(){
		return menuDrink.get();
	}
	
	public void setMenuDrink(String menuDrink){
		this.menuDrink=new SimpleStringProperty(menuDrink);
	}
	
	public double getPrice(){
		return price;
	}
	
	public void setPrice(double price){
		this.price=price;
	}
	
	public int getQuantity(){
		return quantity;
	}
	
	public void setQuantity(int quantity){
		this.quantity=quantity;
	}
	
	public String toString()
	{
		return String.format("%s", menuDrink);
	}
}
