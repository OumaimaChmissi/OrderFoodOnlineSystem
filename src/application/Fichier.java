package application;
import java.util.ArrayList;
import java.util.List;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
 import java.util.StringTokenizer;

import application.Client;
public class Fichier    {


 

 	
	public static int save (Client emp) throws IOException{
		
		
                try{
            PrintWriter sortie=new PrintWriter(new FileWriter("Clients.txt",true));
        sortie.println (emp.getFirst_name()+"#"+emp.getLast_name()+"#"+emp.getEmail()+"#"+emp.getPassword()+"#"); 
        sortie.close();
        return 1;
        }
        catch(IOException e){
            return -1;
        }
	}

	
	
public static int update(Client emp) throws IOException, ClassNotFoundException{
		
	try{
        BufferedReader entree=new BufferedReader(new FileReader("Clients.txt"));
        PrintWriter sortie=new PrintWriter(new FileWriter("copie.txt",true));
        String ligne,phone;
            while((ligne=entree.readLine())!=null){
                StringTokenizer str=new StringTokenizer(ligne,"#");         
                phone=str.nextToken();
                
                if(emp.getFirst_name()==(phone))
        sortie.println (emp.getFirst_name()+"#"+emp.getLast_name()+"#"+emp.getEmail()+"#"+emp.getPassword()+"#"); 
                else
                    sortie.println(ligne);
                
            }
            sortie.close();
            entree.close();
            File Clients= new File("Clients.txt");
            Clients.delete();
            File copie = new File("copie.txt");
            File f1 = new File("Clients.txt");
            copie.renameTo(f1);
        return 1;
        }
        catch(IOException e){
            return -1;
        }
	}
	
	
public static int delete(String id) throws FileNotFoundException, IOException, ClassNotFoundException{
	
        try{
        BufferedReader entree=new BufferedReader(new FileReader("Clients.txt"));
        PrintWriter sortie=new PrintWriter(new FileWriter("copie.txt",true));
        String ligne,phone;
            while((ligne=entree.readLine())!=null){
                StringTokenizer str=new StringTokenizer(ligne,"#");
                
                phone=str.nextToken();
                
                if(!(id.equals(phone)))              
                    sortie.println(ligne);
                
            }
            sortie.close();
            entree.close();
            File employee = new File("Clients.txt");
            employee.delete();
            File copie = new File("copie.txt");
            File f1 = new File("Clients.txt");
            copie.renameTo(f1);
        return 1;
        }
        catch(IOException e){
            return -1;
        }
}

public static Client  getClientId(String id) throws FileNotFoundException, IOException, ClassNotFoundException{

Client emp = new Client();


    BufferedReader entree=new BufferedReader(new FileReader("Clients.txt"));
String ligne,phone;
    while((ligne=entree.readLine())!=null){
        StringTokenizer str=new StringTokenizer(ligne," ");
        phone=str.nextToken();
        if(id.equals(phone)){
        emp.setFirst_name(str.nextToken());
        emp.setLast_name(str.nextToken());
        emp.setEmail(str.nextToken());
        emp.setPassword(str.nextToken());
         
        break;}
                
            }
   
        System.out.println(emp.getFirst_name());
        System.out.println(emp.getLast_name());
        System.out.println(emp.getEmail());
        System.out.println(emp.getPassword());
         entree.close();
return emp;

}



public static List<Client>  getClient() throws FileNotFoundException, IOException, ClassNotFoundException{

List<Client> list = new ArrayList<Client>();
    BufferedReader entree=new BufferedReader(new FileReader("Clients.txt"));
    Client emp=new Client();
    String ligne;
while((ligne=entree.readLine())!=null){
                    StringTokenizer str=new StringTokenizer(ligne," ");
                    emp.setFirst_name(str.nextToken());
                    emp.setLast_name(str.nextToken());
                    emp.setEmail(str.nextToken());
                    emp.setPassword(str.nextToken());
                list.add(emp);
            }
entree.close();

return list;

}	

}
	
	