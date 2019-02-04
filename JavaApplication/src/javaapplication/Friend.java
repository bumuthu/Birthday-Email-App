
package javaapplication;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

 public class Friend extends Client{
        private String birthday;
        private String nickname;

    public String getBirthday() {
        return birthday;
    }

    public String getNickname() {
        return nickname;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
        
    @Override
    public void writeOnFile() throws IOException {
        
            File file = new File("D:\\friend.txt");
            FileWriter writer = new FileWriter(file,true);
            BufferedWriter bw = new BufferedWriter(writer);

            bw.append(this.getName());
            bw.append("                     ");
            bw.append(this.getEmail());
            bw.append("                     ");        
            bw.append(this.getNickname());
            bw.append("                     ");        
            bw.append(this.getBirthday());
            bw.newLine();
            bw.close();
        
    }     
    }