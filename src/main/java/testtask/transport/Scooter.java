package testtask.transport;

import testtask.Printer;

import java.util.LinkedHashMap;

public class Scooter implements Transport {

    private String name;
    private int wheelCount;
    private double weight;

    public Scooter() {
    }

    public void initialize() {
        name = "Самокат";
        wheelCount = 2;
        weight = 3.2;
    }

    public void Display(Printer printer) {
        LinkedHashMap<String, String> params = new LinkedHashMap<String, String>();
        params.put("name", name);
        params.put("wheelCount", String.valueOf(wheelCount));
        params.put("Scooter.weight", String.valueOf(weight));
        printer.print(params);
    }
}