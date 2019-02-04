
package javaapplication;

import java.io.IOException;

public class JavaApplication {

    public static void main(String[] args) throws IOException {
        
        System.out.println("Please wait for sending birthday wishes.\nsending...");
        Email email = new Email();
        email.officeFriendEmail();
        email.friendEmail(); 
        
        mainFrame form = new mainFrame();
        form.setVisible(true); 
    }

}

    
   

