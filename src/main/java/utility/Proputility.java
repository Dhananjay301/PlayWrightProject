package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Proputility {

    Properties pro;
    String filepath;

    public Proputility(String filepth)  {
        pro=new Properties();
        try {
            this.filepath = filepth;
            FileInputStream fis = new FileInputStream(filepth);
            pro.load(fis);
        } catch (IOException e) {
            System.out.println(e.getMessage());

        }
    }

    public String getValue(String key) {
        return pro.getProperty(key);
    }
}
