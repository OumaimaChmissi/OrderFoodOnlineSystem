package application;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
public class menuController {

	
 

	    @FXML
	    private Button DeliveryBtn;

	    @FXML
	    private Button ReservationBtn;

	    @FXML
	    void ReservationAction(ActionEvent event) throws IOException {
			Parent ins2 = FXMLLoader.load(getClass().getResource("ReservationTABLE.fxml")); 
			Scene insScene2 = new Scene(ins2);
		     Stage window2 = (Stage)((Node) event.getSource()).getScene().getWindow();
	         window2.setScene(insScene2);
		     window2.show();
		     }

	    @FXML
	    void DeliveryAction(ActionEvent event) throws IOException {
			Parent ins2 = FXMLLoader.load(getClass().getResource("menu1.fxml")); 
			Scene insScene2 = new Scene(ins2);
		     Stage window2 = (Stage)((Node) event.getSource()).getScene().getWindow();
	         window2.setScene(insScene2);
		     window2.show();

	    }

}