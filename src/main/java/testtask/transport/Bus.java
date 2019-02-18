package testtask.transport;

import testtask.Printer;

import java.util.LinkedHashMap;

public class Bus implements Transport {

    private String name;
    private int maxSpeed;
    private int wheelCount;
    private int seatCount;

    public Bus() {
    }

    public void initialize() {
        name = "Автобус";
        wheelCount = 6;
        maxSpeed = 100;
        seatCount = 24;
    }

    public void Display(Printer printer) {
        LinkedHashMap<String, String> params = new LinkedHashMap<String, String>();
        params.put("name", name);
        params.put("maxSpeed", String.valueOf(maxSpeed));
        params.put("wheelCount", String.valueOf(wheelCount));
        params.put("Bus.seatCount", String.valueOf(seatCount));
        printer.print(params);
    }
}
