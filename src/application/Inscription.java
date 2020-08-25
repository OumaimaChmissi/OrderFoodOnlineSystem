package application;

import javafx.stage.Stage;

public class Inscription {
	private String first_name ;
	private String last_name ;
	private String email;
	private int id ;
	private int age ;
	private String job ;
	private int phone_number ;
	private String password ;
	public String getFirst_name() {
		return first_name;
	}
	public Inscription() {}
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(int phone_number) {
		this.phone_number = phone_number;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Inscription( int id,String first_name, String last_name, String email, int age, String job, int phone_number,
			String password) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.id = id;
		this.age = age;
		this.job = job;
		this.phone_number = phone_number;
		this.password = password;
	}
	@Override
	public String toString() {
		return "Inscription [first_name=" + first_name + ", last_name=" + last_name + ", email=" + email + ", id=" + id
				+ ", age=" + age + ", job=" + job + ", phone_number=" + phone_number + ", password=" + password + "]";
	}
	public void start(Stage primaryStage) {
		// TODO Auto-generated method stub
		
	}
	

}
