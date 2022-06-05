package msg;

import com.sun.javafx.binding.StringFormatter;

import java.util.ResourceBundle;

public class Msg {

    public static String getValue(Class cls, String path, String key){
        key = key.replaceAll("_", ".");
        ResourceBundle rb = ResourceBundle.getBundle(path);
        String val = rb.getString(key);
        System.out.println(cls.getSimpleName() + "-" + "ResourceBundle:" + rb.getLocale().getCountry() + "/" + rb.getLocale().getLanguage());
        System.out.println(cls.getSimpleName() + "-" + "path:" + path);
        System.out.println(cls.getSimpleName() + "-" + "key:" + key + ",val:" + val);
        return val;
    }

    public static String getValue(Class cls, String path, String key, String v){
        key = key.replaceAll("_", ".");
        ResourceBundle rb = ResourceBundle.getBundle(path);
        String val = rb.getString(key);
        val = val + " " +  v;
        System.out.println(cls.getSimpleName() + "-" + "ResourceBundle:" + rb.getLocale().getCountry() + "/" + rb.getLocale().getLanguage());
        System.out.println(cls.getSimpleName() + "-" + "path:" + path);
        System.out.println(cls.getSimpleName() + "-" + "key:" + key + ",val:" + val);
        return val + " " +  v;
    }

}
