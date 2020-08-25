package application;

import javafx.beans.property.SimpleStringProperty;

public class Food 
{
	private SimpleStringProperty menuFood;
	private double price;
	private int quantity;
	
	//---------------------------------

	public  Food(String menuFood,int quantity){
		this.menuFood=new SimpleStringProperty(menuFood);
				
		this.quantity=quantity;
	
	}
	
	//-------------------------------------
	
	public Food( double price){
		this.price=price;
	}
	
	public String getMenuFood(){
		return menuFood.get();
	}
	
	public void setMenuFood(String menuFood ){
		this.menuFood=new SimpleStringProperty(menuFood);
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
	
	public String toString(){
		return String.format("%s", menuFood);
	}
	
}

