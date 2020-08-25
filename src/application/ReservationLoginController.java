 package application;

import java.io.IOException;
 
import java.sql.SQLException;
 

 
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
 
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
 import javafx.stage.Stage;
 
public class ReservationLoginController {
 
    @FXML
    private static PasswordField password;

    @FXML
    private Button Loginbtn;

    @FXML
    private static TextField last_name;

    @FXML
    private static TextField first_name;

    @FXML
    private static TextField email;
    @FXML
    private Label isConnected;
  
  
   
 
    @FXML
    public void gotoAction(ActionEvent event) throws SQLException, IOException{ 
                   
     
    /*	Connection connection =Connexion.connecterDB();
 	    
        Statement st =connection.createStatement();
 	    String s ="SELECT first_name,password FROM les_clients WHERE first_name='"+first_name.getText()+"' AND password='"+password.getText()+"'";
 
	    System.out.println("no");

	    ResultSet resultSet=st.executeQuery(s );
 
        if (resultSet.next()){
            isConnected.setText("Connected");*/

    		Parent ins2 = FXMLLoader.load(getClass().getResource("Reservation_Deleviry.fxml")); 
			Scene insScene2 = new Scene(ins2);
		     Stage window2 = (Stage)((Node) event.getSource()).getScene().getWindow();
	         window2.setScene(insScene2);
		     window2.show();
     
    	}
                
     
 
}
        
        		/*public static void infoBox(String infoMessage, String headerText, String title){
        	        Alert alert = new Alert(AlertType.CONFIRMATION);
        	        alert.setContentText(infoMessage);
        	        alert.setTitle(title);
        	        alert.setHeaderText(headerText);
        	        alert.showAndWait();
        	        */
 
   
    	
 
      /*Connection connection =Connexion.connecterDB();
        String fir =first_name.getText();  
	    String las =last_name.getText(); 
	    String em =email.getText(); 
	    String pass =password.getText(); 
  
    
        String sql = "SELECT 1 FROM les_clients WHERE  first_name = ? and last_name = ? and password = ? and email = ? ";
        
        try{
        	
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,fir);
             preparedStatement.setString(2,las);
            preparedStatement.setString(3,em);
            preparedStatement.setString(4, pass);
            resultSet = preparedStatement.executeQuery();
            if(!resultSet.next()){
                infoBox("Please enter correct Email and Password", null, "Failed");
            }else{
                infoBox("Login Successfull",null,"Success" );
             	Parent ins2 = FXMLLoader.load(getClass().getResource("Reservation_Deleviry.fxml")); 
        		Scene insScene2 = new Scene(ins2);
        	     Stage window2 = (Stage)((Node) event.getSource()).getScene().getWindow();
                 window2.setScene(insScene2);
        	     window2.show();
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
 

	public static void infoBox(String infoMessage, String headerText, String title){
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setContentText(infoMessage);
        alert.setTitle(title);
        alert.setHeaderText(headerText);
        alert.showAndWait();
    }
    
    
    
    public void initialize(URL url, ResourceBundle rb) {
        
        
    }    
    
}
   void gotoAction(ActionEvent event) throws IOException {
    	
    	   String fir =first_name.getText();  
    	    String las =last_name.getText(); 
    	    String em =email.getText(); 
    	    String pass =password.getText(); 
    	    Client acc= new Client(fir,las,em,pass);
    	  
    	
		Parent ins2 = FXMLLoader.load(getClass().getResource("Reservation_Deleviry.fxml")); 
		Scene insScene2 = new Scene(ins2);
	     Stage window2 = (Stage)((Node) event.getSource()).getScene().getWindow();
         window2.setScene(insScene2);
	     window2.show();

    }
 

 

}*/
 

