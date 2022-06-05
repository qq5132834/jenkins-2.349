package msg;

import java.util.Arrays;
import java.util.ResourceBundle;

public class Msg {

    public static String getValue(String path, String key){
        key = key.replaceAll("_", ".");
        ResourceBundle rb = ResourceBundle.getBundle(path);
        String val = rb.getString(key);
        System.out.println("ResourceBundle:" + rb.getLocale().getCountry() + "/" + rb.getLocale().getLanguage());
        System.out.println("path:" + path);
        System.out.println("key:" + key + ",val:" + val);
        return val;
    }

    public static String getValue(Package pack, String path, String key){
        String str = pack.getName().replaceAll("\\.", "/");
        path = str + "/" + path;
        return getValue(path, key);
    }

    public static String getFormatValue(String path, String key, String... vs){
        final StringBuilder stringBuilder = new StringBuilder();
        Arrays.stream(vs).forEach(e->stringBuilder.append(e));
        key = key.replaceAll("_", ".");
        ResourceBundle rb = ResourceBundle.getBundle(path);
        String val = rb.getString(key);
        val = val + " " +  stringBuilder.toString();
        System.out.println("ResourceBundle:" + rb.getLocale().getCountry() + "/" + rb.getLocale().getLanguage());
        System.out.println("path:" + path);
        System.out.println("key:" + key + ",val:" + val);
        return val + " " +  stringBuilder.toString();
    }

    public static String getFormatValue(Package pack, String path, String key, String... vs){
        path = pack.getName().replaceAll("\\.", "/") + "/" + path;
        return getFormatValue(path, key, vs);
    }

}
