package hudson.cli.client;

import java.util.Locale;
import java.util.ResourceBundle;

/***
 * 测试
 */
public class TestBundle {
    public static void main(String[] args) {
        Locale locale = Locale.getDefault();
        System.out.println(locale.getCountry());
        System.out.println(locale.getLanguage());
        xixi();
        test();
    }

    private static void test(){
        ResourceBundle rb = ResourceBundle.getBundle("BundleTest");
        rb.keySet().forEach(e->{
            System.out.println(e + "=" + rb.getString(e));
        });
    }

    private static void xixi(){
        ResourceBundle rb = ResourceBundle.getBundle("hello/world/xixi");
        rb.keySet().forEach(e->{
            System.out.println(e + "=" + rb.getString(e));
        });

    }
}
