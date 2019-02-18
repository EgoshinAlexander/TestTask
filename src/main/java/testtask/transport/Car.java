package testtask.transport;

import testtask.Printer;

import java.util.LinkedHashMap;

public class Car implements Transport{

    private String name;
    private int maxSpeed;
    private int wheelCount;
    private String bodyStyle;

    public Car() {
    }

    public void initialize() {
        name = "Автомобиль";
        wheelCount = 4;
        maxSpeed = 150;
        bodyStyle = "Седан";
    }

    public void Display(Printer printer) {
        LinkedHashMap<String, String> params = new LinkedHashMap<String, String>();
        params.put("name", name);
        params.put("maxSpeed", String.valueOf(maxSpeed));
        params.put("wheelCount", String.valueOf(wheelCount));
        params.put("Car.bodyStyle", bodyStyle);
        printer.print(params);
    }
}
