import constants.FilePath;
import utility.Proputility;

import java.io.IOException;

public class zzzz {
    Proputility proputility = new Proputility(FilePath.dataFilePath);
    public static void main(String[] args) {
        zzzz obj=new zzzz();
        obj.retun();
    }


        public String name (String key){
            return proputility.getValue(key);
        }
        public void retun () {
            System.out.println(name("surname"));
        }

    }

