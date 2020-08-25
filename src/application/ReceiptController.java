/*package application;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
public class ReceiptController {

 

	    @FXML
	    private Button paymentBtn;
 
 

	 

	    @FXML
	    void PaymentAction(ActionEvent event)throws IOException {
			Parent ins2 = FXMLLoader.load(getClass().getResource("Receipt.fxml")); 
			Scene insScene2 = new Scene(ins2);
		     Stage window2 = (Stage)((Node) event.getSource()).getScene().getWindow();
	         window2.setScene(insScene2);
		     window2.show();

	    }
}*/
package application;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

   import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.stage.Stage;

public class ReceiptController implements Initializable
{
	static ArrayList<String> menu = new ArrayList<>();
	static ArrayList<Integer> quant = new ArrayList<>();
	static ArrayList<Double> price = new ArrayList<>();
	
	
	@FXML
    private TableView<Food> tabview1;
	@FXML
    private TableColumn<Food, String> OrderItemColumn1;
	@FXML
    private TableColumn<Food, Integer> QuantityColumn1;



    @FXML
    private TableView<Drink> tabview2;
	@FXML
    private TableColumn<Drink,String> OrderItemColumn2;
    @FXML
    private TableColumn<Drink,Integer> QuantityColumn2;
    
//-------------------------------------------
	
    @FXML
    private TextField quantity_food;
    @FXML
    private TextField quantityDrink;
    @FXML
    private Button paymentBtn;
    @FXML
    private Button DeleteBtn;
    @FXML
    private Button addFood;
    @FXML
    private Button AddDrink;
    @FXML
    private Label labelQuantity1;
    @FXML
    private Label LabelQuantity2;

    
    //----------------------------------------
    
    @FXML
    private RadioButton id_eau_p;
    @FXML
    private RadioButton id_lait_de_poule;
    @FXML
    private RadioButton id_mojito_aromatise;
    @FXML
    private RadioButton id_jus_fraise;
    @FXML
    private RadioButton id_jus_orange;
    @FXML
    private RadioButton id_boisson_eneg;
    @FXML
    private RadioButton id_soda;
    @FXML
    private RadioButton id_eau_gaz;
    @FXML
    private RadioButton id_nespresso;
    @FXML
    private RadioButton id_virgin_mojito;

//-----------------------------------------

    @FXML
    private RadioButton id_salade_cesar;
    @FXML
    private RadioButton id_sandwich_foie;
    @FXML
    private RadioButton id_pizza_frenchy;
    @FXML
    private RadioButton id_sandwich_kabeb;
    @FXML
    private RadioButton id_nem_boeuf;
    @FXML
    private RadioButton id_sandwich_escalope;
    @FXML
    private RadioButton id_ailes;
    @FXML
    private RadioButton id_pizza_4_saisons;
    @FXML
    private RadioButton id_sandwich_thon;
    @FXML
    private RadioButton id_libanais;
    @FXML
    private RadioButton id_pizza_marg;
    @FXML
    private RadioButton id_nem_crevette;
    @FXML
    private RadioButton id_sandwich_poulet;
    

//---------------------------------------------------
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
		
    	OrderItemColumn1.setCellValueFactory(new PropertyValueFactory<Food, String>("menuFood"));
		QuantityColumn1.setCellValueFactory(new PropertyValueFactory<Food, Integer>("quantity"));
		
		OrderItemColumn1.setCellFactory(TextFieldTableCell.forTableColumn());
		
		tabview1.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		
		OrderItemColumn2.setCellValueFactory(new PropertyValueFactory<Drink, String>("menuDrink"));
		QuantityColumn2.setCellValueFactory(new PropertyValueFactory<Drink, Integer>("quantity"));
		
		OrderItemColumn2.setCellFactory(TextFieldTableCell.forTableColumn());
		
		tabview2.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
	    Menu.calculateOrder(2500);
		
		 
	}
    
  //--------------------------------------------------------------------
    @FXML
    void newFoodButtonPushed(ActionEvent event)
    {
    	if(id_salade_cesar.isSelected()){
   		 Integer value = Integer.valueOf(quantity_food.getText());
   		 
   	     Food newFood = new Food("Salade Cesar" ,value);
   	     tabview1.getItems().add(newFood);
   	     
   	     menu.add("Salade Cesar");
   	     quant.add(value);
   	     price.add((double) (value*6000));
   	     
   	     Menu.calculateOrder(6000*value);
   	}
   	
    	else if(id_sandwich_foie.isSelected()){
      		 Integer value = Integer.valueOf(quantity_food.getText());
      		 
      	     Food newFood = new Food("Sandwich Foie" ,value);
      	     tabview1.getItems().add(newFood);
      	     
      	     menu.add("Sandwich Foie");
      	     quant.add(value);
      	     price.add((double) (value*7500));
      	     
      	     Menu.calculateOrder(7500*value);
      	}
    	
    	else if(id_pizza_frenchy.isSelected()){
     		 Integer value = Integer.valueOf(quantity_food.getText());
     		 
     	     Food newFood = new Food("Pizza Frenchy" ,value);
     	     tabview1.getItems().add(newFood);
     	     
     	     menu.add("Pizza Frenchy");
     	     quant.add(value);
     	     price.add((double) (value*12000));
     	     
     	     Menu.calculateOrder(12000*value);
     	}
    	
    	else if(id_ailes.isSelected()){
     		 Integer value = Integer.valueOf(quantity_food.getText());
     		 
     	     Food newFood = new Food("Ailes De Poulet Grillées" ,value);
     	     tabview1.getItems().add(newFood);
     	     
     	     menu.add("Ailes De Poulet Grillées");
     	     quant.add(value);
     	     price.add((double) (value*15000));
     	     
     	     Menu.calculateOrder(15000*value);
     	}
    	
    	else if(id_pizza_4_saisons.isSelected()){
    		 Integer value = Integer.valueOf(quantity_food.getText());
    		 
    	     Food newFood = new Food("Pizza 4 Saisons" ,value);
    	     tabview1.getItems().add(newFood);
    	     
    	     menu.add("Pizza 4 Saisons");
    	     quant.add(value);
    	     price.add((double) (value*16000));
    	     
    	     Menu.calculateOrder(16000*value);
    	}
    	
    	else if(id_sandwich_thon.isSelected()){
   		 Integer value = Integer.valueOf(quantity_food.getText());
   		 
   	     Food newFood = new Food("Sandwich Thon" ,value);
   	     tabview1.getItems().add(newFood);
   	     
   	     menu.add("Sandwich Thon");
   	     quant.add(value);
   	     price.add((double) (value*5900));
   	     
   	     Menu.calculateOrder(5900*value);
   	}
    	
    	else if(id_libanais.isSelected()){
      		 Integer value = Integer.valueOf(quantity_food.getText());
      		 
      	     Food newFood = new Food("Libanais" ,value);
      	     tabview1.getItems().add(newFood);
      	     
      	     menu.add("Libanais");
      	     quant.add(value);
      	     price.add((double) (value*8500));
      	     
      	     Menu.calculateOrder(8500*value);
      	}
    	
    	else if(id_pizza_marg.isSelected()){
     		 Integer value = Integer.valueOf(quantity_food.getText());
     		 
     	     Food newFood = new Food("Pizza Margherita" ,value);
     	     tabview1.getItems().add(newFood);
     	     
     	     menu.add("Pizza Margherita");
     	     quant.add(value);
     	     price.add((double) (value*11000));
     	     
     	     Menu.calculateOrder(11000*value);
     	}
    	
    	else if(id_nem_crevette.isSelected()){
    		 Integer value = Integer.valueOf(quantity_food.getText());
    		 
    	     Food newFood = new Food("Nem Crevette" ,value);
    	     tabview1.getItems().add(newFood);
    	     
    	     menu.add("Nem Crevette");
    	     quant.add(value);
    	     price.add((double) (value*23000));
    	     
    	     Menu.calculateOrder(23000*value);
    	}
    	
    	else if(id_sandwich_poulet.isSelected()){
   		 Integer value = Integer.valueOf(quantity_food.getText());
   		 
   	     Food newFood = new Food("Sandwich Poulet Grillé" ,value);
   	     tabview1.getItems().add(newFood);
   	     
   	     menu.add("Sandwich Poulet Grillé");
   	     quant.add(value);
   	     price.add((double) (value*7000));
   	     
   	     Menu.calculateOrder(7000*value);
   	}
}
    
    
  //-----------------------------------------------------------------------  
    @FXML
    void newDrinkButtonPushed(ActionEvent event) 
    {
    	if(id_eau_p.isSelected()){
   		 Integer value = Integer.valueOf(quantityDrink.getText());
   		 
   	     Drink newDrink = new Drink("Eau palate" ,value);
   	     tabview2.getItems().add(newDrink);
   	     
   	     menu.add("Eau palate");
   	     quant.add(value);
   	     price.add((double) (value*1000));
   	     
   	     Menu.calculateOrder(1000*value);
   	}
    	
    	 if(id_lait_de_poule.isSelected()){
      		 Integer value = Integer.valueOf(quantityDrink.getText());
      		 
      	     Drink newDrink = new Drink("Lait De Poule" ,value);
      	     tabview2.getItems().add(newDrink);
      	     
      	     menu.add("Lait De Poule");
      	     quant.add(value);
      	     price.add((double) (value*6500));
      	     
      	     Menu.calculateOrder(6500*value);
      	}
    	
    	else if(id_mojito_aromatise.isSelected()){
     		 Integer value = Integer.valueOf(quantityDrink.getText());
     		 
     	     Drink newDrink = new Drink("Mojito Aromatise" ,value);
     	     tabview2.getItems().add(newDrink);
     	     
     	     menu.add("Mojito Aromatise");
     	     quant.add(value);
     	     price.add((double) (value*5600));
     	     
     	     Menu.calculateOrder(5600*value);
     	}
    	
    	else if(id_jus_fraise.isSelected()){
    		 Integer value = Integer.valueOf(quantityDrink.getText());
    		 
    	     Drink newDrink = new Drink("Jus De Faise" ,value);
    	     tabview2.getItems().add(newDrink);
    	     
    	     menu.add("Jus De Faise");
    	     quant.add(value);
    	     price.add((double) (value*6000));
    	     
    	     Menu.calculateOrder(6000*value);
    	}
    	
    	else if(id_jus_orange.isSelected()){
   		 Integer value = Integer.valueOf(quantityDrink.getText());
   		 
   	     Drink newDrink = new Drink("Jus D'Orange" ,value);
   	     tabview2.getItems().add(newDrink);
   	     
   	     menu.add("Jus D'Orange");
   	     quant.add(value);
   	     price.add((double) (value*4500));
   	     
   	     Menu.calculateOrder(4500*value);
   	}
    	
    	else if(id_boisson_eneg.isSelected()){
      		 Integer value = Integer.valueOf(quantityDrink.getText());
      		 
      	     Drink newDrink = new Drink("Boisson Energitique" ,value);
      	     tabview2.getItems().add(newDrink);
      	     
      	     menu.add("Boisson Energitique");
      	     quant.add(value);
      	     price.add((double) (value*2000));
      	     
      	     Menu.calculateOrder(2000*value);
      	}
    	
    	else if(id_soda.isSelected()){
     		 Integer value = Integer.valueOf(quantityDrink.getText());
     		 
     	     Drink newDrink = new Drink("Soda" ,value);
     	     tabview2.getItems().add(newDrink);
     	     
     	     menu.add("Soda");
     	     quant.add(value);
     	     price.add((double) (value*3500));
     	     
     	     Menu.calculateOrder(3500*value);
     	}
    	
    	else if(id_eau_gaz.isSelected()){
    		 Integer value = Integer.valueOf(quantityDrink.getText());
    		 
    	     Drink newDrink = new Drink("Eau Gazifié" ,value);
    	     tabview2.getItems().add(newDrink);
    	     
    	     menu.add("Eau Gazifié");
    	     quant.add(value);
    	     price.add((double) (value*1500));
    	     
    	     Menu.calculateOrder(1500*value);
    	}
    	
    	else if(id_nespresso.isSelected()){
   		 Integer value = Integer.valueOf(quantityDrink.getText());
   		 
   	     Drink newDrink = new Drink("Nespresso" ,value);
   	     tabview2.getItems().add(newDrink);
   	     
   	     menu.add("Nespresso");
   	     quant.add(value);
   	     price.add((double) (value*3500));
   	     
   	     Menu.calculateOrder(3500*value);
   	}
    	
    	else if(id_virgin_mojito.isSelected()){
      		 Integer value = Integer.valueOf(quantityDrink.getText());
      		 
      	     Drink newDrink = new Drink("Virgin Mojito" ,value);
      	     tabview2.getItems().add(newDrink);
      	     
      	     menu.add("Virgin Mojito");
      	     quant.add(value);
      	     price.add((double) (value*3000));
      	     
      	     Menu.calculateOrder(3000*value);
      	}




    }
    

//----------------------------------------------------------------
    @FXML
    void OnActionDeletebtn(ActionEvent event) 
    {
    	ObservableList<Food> selectedRows1, allOrder1;
        allOrder1 = tabview1.getItems();
        
        selectedRows1 = tabview1.getSelectionModel().getSelectedItems();
        
        for (Food food: selectedRows1)
        {
            allOrder1.remove(food);
        }
        
        ObservableList<Drink> selectedRows2, allOrder2;
        allOrder2 = tabview2.getItems();
        
        selectedRows2 = tabview2.getSelectionModel().getSelectedItems();
        
        for (Drink drink: selectedRows2)
        {
            allOrder2.remove(drink);
        }

    }

 //-----------------------------------------------------------------------------  
    @FXML
    void PaymentAction(ActionEvent event)throws IOException {
		Parent ins2 = FXMLLoader.load(getClass().getResource("Receipt.fxml")); 
		Scene insScene2 = new Scene(ins2);
	     Stage window2 = (Stage)((Node) event.getSource()).getScene().getWindow();
         window2.setScene(insScene2);
	     window2.show();

    }
    //------------------------------------------------------------------------
    
    public static ArrayList<String> getMenu(){
    	return menu;
    }
    
    public static ArrayList<Integer> getQuant(){
    	return quant;
    }
    
    public static ArrayList<Double> getPrice(){
    	return price;
    }
	
}
