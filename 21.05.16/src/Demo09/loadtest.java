package Demo09;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class loadtest {
    public static void main(String[] args) throws IOException {
        Properties prop=new Properties();
        prop.load(new FileReader("prop.txt"));
        Set<String> set=prop.stringPropertyNames();
        for (String key : set) {
            System.out.println(key+"="+prop.getProperty(key));
        }
    }
}
