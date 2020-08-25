package application;

import javafx.beans.property.SimpleStringProperty;
 
public class Menu 
{
	
	private SimpleStringProperty menu;
	private int quant;
	private double price;
	static double total;
	
	//------------------------------------------------
	
	public Menu(String menu, int quant, double price){
		this.menu= new SimpleStringProperty(menu);
		this.quant=quant;
		this.price=price;
	}
	
	//--------------------------------------------------
	
	public String getMenu(){
		return menu.get();
	}
	
	public void setMenu(String menu){
		this.menu= new SimpleStringProperty(menu);
	}
	
	public int getQuant(){
		return quant;
	}
	
	public void setQuant(int quant){
		this.quant=quant;
	}
	
	public double getPrice(){
		return price;
	}
	
	public void setPrice(double price){
		this.price=price;
	}
	
	public String toString(){
		return String.format("%s", menu);
	}
	
	public static void  calculateOrder (double Price) {
       total +=Price;
    }
	
	public static double getTotal(){
		return total;
	}	
}

