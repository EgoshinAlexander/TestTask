package testtask;

import java.util.Locale;
import java.util.ResourceBundle;

class Main {
    public static void main(String[] args) {

        TransportFactory transportFactory = new TransportFactory();

        Locale locale = new Locale("ru","RU");
        ResourceBundle bundle = ResourceBundle.getBundle("transport_params", locale);
        ConsolePrinter printer = new ConsolePrinter(bundle);

        for (String arg : args) {
            try {
                transportFactory.getInstance(Integer.parseInt(arg)).Display(printer);
            } catch (NumberFormatException ex) {
                System.out.println("НЕВЕРНЫЙ ТИП ВХОДНОГО ПАРАМЕТРА, НА ВХОД ПРИНИМАЮТСЯ ЦЕЛОЧИСЛЕННЫЕ ЗНАЧЕНИЯ\n");
            } catch (NullPointerException npe) {
                System.out.println("НЕИЗВЕСТНЫЙ ТИП ТРАНСПОРТА\n");
            }
        }
    }
}
