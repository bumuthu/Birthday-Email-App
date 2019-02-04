
package javaapplication;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.internet.AddressException;
import java.util.Date;

public class Email {
      
    
public ArrayList<String> readyEmail(String line) throws IOException{
    ArrayList<String> dataList=new ArrayList<String>();  
    String detailList[] = line.split("                     ");
    String[] details = null;
    for(String elem: detailList){
          dataList.add(elem);          
       }
    //System.out.println(dataList);
    if (dataList.size()>2){
        return dataList;                 
    }
    return null;
    
}
    
    
public void officeFriendEmail() throws IOException{
    try{
    File file = new File("D:\\officeFriend.txt");
    FileReader reader = new FileReader(file);
    BufferedReader br = new BufferedReader(reader);
    String line;
    ArrayList<String> details;
    while ((line = br.readLine())!=null){
        
        details = readyEmail(line);
        
        if(details!=null){
            String name = details.get(0);
            String email = details.get(1);
            String bDay = details.get(3);
            String birthday = bDay.substring(5,10);
            
            
            
            DateFormat dateFormat = new SimpleDateFormat("MM/dd");
            Date date = new Date();
            String today = dateFormat.format(date);
            
            String wish = "Wish You A Very Happy Birthday ";
            
            if(birthday.equals(today)){                
                try {
                    Mail_Client clientEmail = new Mail_Client();
                    clientEmail.send(email, "Dear "+name+","+"\n\t"+wish+name+".");
                } catch (AddressException ex) {
                    Logger.getLogger(Email.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        }
        
    }
    br.close();
    reader.close();  
    }
    catch (FileNotFoundException e) {
    System.out.println("The officeFrind.txt file can not be found at D:\\officeFriend.txt.");
    
}
    
}
public void friendEmail() throws IOException{
    try{
    
    File file = new File("D:\\friend.txt");
    FileReader reader = new FileReader(file);
    BufferedReader br = new BufferedReader(reader);
    String line;
    ArrayList<String> details;
    while ((line = br.readLine())!=null){
        
        details = readyEmail(line);
        
        if(details!=null){
            String name = details.get(0);
            String email = details.get(1);
            String bDay = details.get(3);
            String birthday = bDay.substring(5,10);
            
            
            
            DateFormat dateFormat = new SimpleDateFormat("MM/dd");
            Date date = new Date();
            String today = dateFormat.format(date);
            
            String wish = "My birthday wish for you is that you discover rainbows when there are dark clouds above, and have the courage to smile when sadness overwhelms you. Happiest birthday to you, my dear friend ";
            
            if(birthday.equals(today)){                 
            try {
                Mail_Client clientEmail = new Mail_Client();
                clientEmail.send(email, "Dear "+name+","+"\n\t"+wish+name+".");
            } catch (AddressException ex) {
                Logger.getLogger(Email.class.getName()).log(Level.SEVERE, null, ex);
            }
                
            }
        }
        
    }
    br.close();
    reader.close();
}
catch (FileNotFoundException e) {
    System.out.println("The freind.txt file can not be found at D:\\friend.txt.");
    
}
}}
