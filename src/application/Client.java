package application;

import java.sql.Connection;
 

import javafx.stage.Stage;

public class Client {
	
	public Client(String first_name, String password) {
		super();
		this.first_name = first_name;
		this.password = password;
	}

	static Connection con ;
	private String first_name ;
	private String last_name ;
	private String email;
	private String password ;
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Client [first_name=" + first_name + ", last_name=" + last_name + ", email=" + email + ", password="
				+ password + "]";
	}
	public Client(String first_name, String last_name, String email, String password) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.password = password;
	}
	public Client() {}
	public void start(Stage primaryStage) {
		// TODO Auto-generated method stub
		
	}
 
 
 
}
