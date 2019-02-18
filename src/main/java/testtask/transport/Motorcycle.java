package testtask.transport;

import testtask.Printer;

import java.util.LinkedHashMap;

public class Motorcycle implements Transport {

    private String name;
    private int maxSpeed;
    private int wheelCount;
    private String type;

    public Motorcycle() {
    }

    public void initialize() {
        name = "Мотцикл";
        wheelCount = 2;
        maxSpeed = 180;
        type = "Чоппер";
    }

    public void Display(Printer printer) {
        LinkedHashMap<String, String> params = new LinkedHashMap<String, String>();
        params.put("name", name);
        params.put("maxSpeed", String.valueOf(maxSpeed));
        params.put("wheelCount", String.valueOf(wheelCount));
        params.put("Motorcycle.type", type);
        printer.print(params);
    }
}