package Demo08;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class propertisetest {
    public static void main(String[] args) throws IOException {
        Properties pro=new Properties();
        pro.setProperty("迪丽热巴","24");
        pro.setProperty("古力娜扎","26");
        pro.setProperty("马尔扎哈","44");
        FileWriter fw=new FileWriter("prop.txt");
        pro.store(fw,"data store");
        fw.close();
    }
}
