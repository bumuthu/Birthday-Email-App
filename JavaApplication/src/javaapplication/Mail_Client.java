package javaapplication;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
public class Mail_Client {
    public void send(String to,String sub) throws AddressException{
        String from="bumuthudilshanjava@gmail.com";                               //senders mail
        final String user=from;
        final String pass="java1234java";                                        //password
        String host="smtp.gmail.com";
        Properties props=new Properties();
        props.put("mail.smtp.auth","true");
        props.put("mail.smtp.starttls.enable","true");                          //tls is used so that the port will be 587 in gmail
        props.put("mail.smtp.host",host);
        props.put("mail.smtp.port","587");
        Session s=Session.getInstance(props,new javax.mail.Authenticator(){
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication(user,pass);}});
        try{
            Message message=new MimeMessage(s);
            message.setFrom(new InternetAddress(from));
            message.setRecipients(Message.RecipientType.TO,InternetAddress.parse(to));
            message.setSubject("Birthday Wish");
            message.setText(sub);
            Transport.send(message);
            System.out.println("Message sent successfully");                    //executes if the email has been sent correctly
            
        }
        catch(MessagingException e){
            System.out.println("Could not connect to the internet");            //executes if the computer is not connected to the internet
        }
        
    }
}
            
        
    
    
    

