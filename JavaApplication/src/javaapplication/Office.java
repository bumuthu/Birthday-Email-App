
package javaapplication;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

    public class Office extends Client{
        
    private String designation;

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
   
    @Override
    public void writeOnFile() throws IOException {
        
            File file = new File("D:\\office.txt");
            FileWriter writer = new FileWriter(file,true);
            BufferedWriter bw = new BufferedWriter(writer);

            bw.append(this.getName());
            bw.append("                     ");
            bw.append(this.getEmail());
            bw.append("                     ");        
            bw.append(this.getDesignation());
            bw.newLine();
            bw.close();
        
    }

    }