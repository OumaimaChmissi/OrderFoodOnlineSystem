package application;
import java.io.IOException;
 
import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
 import javafx.stage.Stage;

public class Welcome extends Application {
  
   
  public static void main(String[] args) {
	   
	  launch(args); 
 	  }
  
  @Override
  public void start(Stage primaryStage) throws IOException {
 
   Parent root = ( Parent) FXMLLoader.load(Welcome.class.getResource("welcome.fxml")) ;
     primaryStage.setTitle("Food Ordering System ");
    primaryStage.setScene(new Scene(root)); 
    primaryStage.show(); 
 
 
} 
}



