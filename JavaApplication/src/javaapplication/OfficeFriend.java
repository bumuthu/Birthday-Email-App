
package javaapplication;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class OfficeFriend extends Client{
    
        private String birthday;
        private String designation;

    public String getBirthday() {
        return birthday;
    }

    public String getDesignation() {
        return designation;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
@Override
    public void writeOnFile() throws IOException {
        
            File file = new File("D:\\officeFriend.txt");
            FileWriter writer = new FileWriter(file,true);
            BufferedWriter bw = new BufferedWriter(writer);

            bw.append(this.getName());
            bw.append("                     ");
            bw.append(this.getEmail());
            bw.append("                     ");        
            bw.append(this.getDesignation());
            bw.append("                     ");        
            bw.append(this.getBirthday());
            bw.newLine();
            bw.close();
        
    }  
    }