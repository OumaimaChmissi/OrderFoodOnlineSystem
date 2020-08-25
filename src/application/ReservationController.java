package application;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ReservationController {

    @FXML
    private TextField number;

    @FXML
    private Label titre;

    @FXML
    private TextField new_password;

    @FXML
    private TextField last_name;

    @FXML
    private TextField id;

    @FXML
    private TextField job;

    @FXML
    private TextField first_name;

    @FXML
    private TextField age;

    @FXML
    private TextField email;

    @FXML
    private Button saveBtn;

 

    @FXML
    void gotoreservationAction(ActionEvent event) throws IOException, SQLException {
	
		Parent ins1 = FXMLLoader.load(getClass().getResource("Reservation_Deleviry.fxml"));
		 
		 
		Scene insScene1 = new Scene(ins1);
	
	Stage window1 = (Stage)((Node) event.getSource()).getScene().getWindow();
	
	window1.setScene(insScene1);
	window1.show();
	Connection cnx=Connexion.connecterDB();
	 	Statement stm=cnx.createStatement();
	    String f=first_name.getText();
    String l=last_name.getText();
    int i =Integer.parseInt(id.getText());
    int num =Integer.parseInt(number.getText());
    System.out.println(i);

    int a =Integer.parseInt(age.getText());
    String e=email.getText();
    String j=job.getText();
    String p=new_password.getText();
  


    Inscription in = new Inscription(i,f,l,e,a,j,num,p);
    String  query="INSERT INTO les_clients VALUES (' "+ in.getId()+ "','"+in.getFirst_name()+"','"+in.getLast_name()+ "','"+in.getEmail()+" ','"+in.getJob()+" ','"+in.getPhone_number()+ "','"+in.getPassword()+"')";
 	System.out.println("hhhhhhhhhh");
     stm.executeUpdate(query);
	System.out.println("enfinnnnn");
	Alert alert = new Alert (Alert.AlertType.INFORMATION);
	alert.setHeaderText(null);
	alert.setTitle("Food Ordering System");
	alert.setContentText("You have been added successfully , Enjoy!");
	alert.showAndWait();
	}

}