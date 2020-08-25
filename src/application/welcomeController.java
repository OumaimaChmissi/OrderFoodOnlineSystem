package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class welcomeController {

    @FXML
    private Button loginBtn;

    @FXML
    private Button inscriBtn;

    @FXML
    private Button exitBtn;

    @FXML
    private Label welcome_label;

    @FXML
    void ebe5e5(ActionEvent event) {

    }

    @FXML
    void connecterAction(ActionEvent event) throws IOException {
		Parent ins1 = FXMLLoader.load(getClass().getResource("login.fxml"));
		 
		 
		Scene insScene1 = new Scene(ins1);
	
	Stage window1 = (Stage)((Node) event.getSource()).getScene().getWindow();
	
	window1.setScene(insScene1);
	window1.show();

    }

    @FXML
    void InscrireAction(ActionEvent event) throws Exception {
		 
		 
			Parent ins = FXMLLoader.load(getClass().getResource("Inscription.fxml"));
 
	 
 		Scene insScene = new Scene(ins);
		
		Stage window = (Stage)((Node) event.getSource()).getScene().getWindow();
		
		window.setScene(insScene);
		window.show();
		}

 

    @FXML
    void closeAction(ActionEvent event) {
    	System.exit(0);

    }

}