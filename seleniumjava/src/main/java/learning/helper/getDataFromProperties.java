package learning.helper;

import java.io.FileInputStream;
import java.util.Properties;




public String getData(String key) {
        Properties properties = new Properties();

        try {
            FileInputStream fileInputStream = new FileInputStream(
                    "seleniumjava/src/test/java/learning/resources/data.properties");
            properties.load(fileInputStream);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return properties.getProperty(key);

    }


