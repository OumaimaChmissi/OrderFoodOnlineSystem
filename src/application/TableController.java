package application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
public class TableController{

    @FXML
    private TextField num_table;

    @FXML
    private Button doneBtn;

    @FXML
    private TextField time_res;

    @FXML
    private DatePicker date_res;

    @FXML
    void DoneAction(ActionEvent event) { 
    	Alert alert = new Alert (Alert.AlertType.INFORMATION);
    	alert.setHeaderText(null);
    	alert.setTitle("Food Ordering System");
    	alert.setContentText(" Your Reservation has been added successfully !");
    	alert.showAndWait(); 
    	System.exit(0);

    }

 

}