package SingletonExample;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigLoader {
    private static ConfigLoader config;
    private static String username;
    private static String password;
    private static String url;
    private ConfigLoader(){
        try{
            FileInputStream inputStream =new FileInputStream("C:\\Users\\laxmi_bala\\Desktop\\Laxmi\\Project\\EpamTestProject\\src\\main\\resources\\appliation.properties");
            Properties prop =new Properties();
            prop.load(inputStream);
            setUsername(prop.getProperty("user"));
            setPassword(prop.getProperty("pass"));
            setUrl(prop.getProperty("application_url"));
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static String getUsername() {
        if(config==null)
            config= new ConfigLoader();
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public static String getPassword() {
        if(config==null)
            config= new ConfigLoader();
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static String getUrl() {
        if(config==null)
            config= new ConfigLoader();
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
