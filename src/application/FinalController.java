package application;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
 
import application.Menu;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.stage.Stage;

public class FinalController implements Initializable{


	 

	    @FXML
	    private TableColumn<	Menu, Integer> quantityColumn;

	    @FXML
	    private TextField total;

	    @FXML
	    private Button proceedbtn;

	    @FXML
	    private TableColumn<Menu, Double> priceColumn;

	    @FXML
	    private Button exitbtn;

	    @FXML
	    private TableColumn<Menu, String> orderItemColumn;

	    @FXML
	    private Button backbtn;

	    @FXML
	    private TableView<Menu> tableView;

	    @FXML
	    private Button deletebtn;
	    @Override
	    public void initialize(URL url, ResourceBundle rb) {

			orderItemColumn.setCellValueFactory(new PropertyValueFactory<Menu, String>("menu"));
			quantityColumn.setCellValueFactory(new PropertyValueFactory<Menu, Integer>("quant"));
			priceColumn.setCellValueFactory(new PropertyValueFactory<Menu, Double>("price"));
			
			orderItemColumn.setCellFactory(TextFieldTableCell.forTableColumn());
			
			tableView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
			
			ArrayList<String> menu = new ArrayList<>();
			ArrayList<Integer> quantity = new ArrayList<>();
			ArrayList<Double> price = new ArrayList<>();
			
			menu=ReceiptController.getMenu();
			quantity=ReceiptController.getQuant();
			price=ReceiptController.getPrice();
			
			for(int i=0; i<menu.size(); i++)
			{
			Menu receipt = new Menu( menu.get(i), quantity.get(i), price.get(i));
			tableView.getItems().add(receipt);
			}
			
			 total.setText(Double.toString(Menu.getTotal()));
		}
		

	    @FXML
	    void deletebtnpushed(ActionEvent event) {
	        ObservableList<Menu> selectedRows1, allOrder1;
	        allOrder1 = tableView.getItems();
	        
	        selectedRows1 = tableView.getSelectionModel().getSelectedItems();
	        
	        for (Menu menu: selectedRows1)
	        {
	            allOrder1.remove(menu);
	        }
	        
	 
	         

	    }

	    @FXML
	    void exitbtnpushed(ActionEvent event) {
	    	System.exit(0);

	    }

	    @FXML
	    void gobacktomenu(ActionEvent event) throws IOException {
	    	
			Parent ins2 = FXMLLoader.load(getClass().getResource("menu1.fxml")); 
			Scene insScene2 = new Scene(ins2);
		     Stage window2 = (Stage)((Node) event.getSource()).getScene().getWindow();
	         window2.setScene(insScene2);
		     window2.show();
	    	

	    }

	    @FXML
	    void proceedbtnpushed(ActionEvent event) {
			Alert alert = new Alert (Alert.AlertType.INFORMATION);
			alert.setHeaderText(null);
			alert.setTitle("Food Ordering System");
			alert.setContentText("Your Order has been Received, Thank You!");
			alert.showAndWait();
			System.exit(0);

	    }

	 
			
	 

	}