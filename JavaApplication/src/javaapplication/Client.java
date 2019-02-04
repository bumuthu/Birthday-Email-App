
package javaapplication;

import java.io.IOException;

public abstract class Client{
        private String name;
        private String email;

        public void setName(String name) {
            this.name = name;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }
        
       abstract void writeOnFile() throws IOException;
    }
