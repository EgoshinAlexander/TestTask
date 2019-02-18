package testtask;

import java.io.UnsupportedEncodingException;
import java.util.Map;
import java.util.ResourceBundle;

class ConsolePrinter implements Printer {

    private static final String DELIMETER = ": ";

    private final ResourceBundle bundle;

    ConsolePrinter(ResourceBundle bundle) {
        this.bundle = bundle;
    }

    public void print(Map<String, String> params) {
        try {
            for (Map.Entry<String, String> param : params.entrySet()) {
                String val = bundle.getString(param.getKey());
                String s = new String(val.getBytes("ISO-8859-1"), "UTF-8");
                System.out.println(s + DELIMETER + param.getValue());
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        System.out.println();
    }
}
