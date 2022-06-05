package msg;

import com.sun.javafx.binding.StringFormatter;

import java.util.Arrays;
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

    public static String getValue(Class cls, String path, String key, String... vs){
        final StringBuilder stringBuilder = new StringBuilder();
        Arrays.stream(vs).forEach(e->stringBuilder.append(e));
        key = key.replaceAll("_", ".");
        ResourceBundle rb = ResourceBundle.getBundle(path);
        String val = rb.getString(key);
        val = val + " " +  stringBuilder.toString();
        System.out.println(cls.getSimpleName() + "-" + "ResourceBundle:" + rb.getLocale().getCountry() + "/" + rb.getLocale().getLanguage());
        System.out.println(cls.getSimpleName() + "-" + "path:" + path);
        System.out.println(cls.getSimpleName() + "-" + "key:" + key + ",val:" + val);
        return val + " " +  stringBuilder.toString();
    }

}
