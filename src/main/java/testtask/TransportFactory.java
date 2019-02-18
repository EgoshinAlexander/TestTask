package testtask;

import testtask.transport.*;

import java.util.HashMap;

class TransportFactory {

    private static final HashMap<TransportType, Transport> transportMap = new HashMap<TransportType, Transport>();

    Transport getInstance(Integer type) {

        switch (type) {
            case 0: {
                if (!transportMap.containsKey(TransportType.MOTORCYCLE)) {
                    Motorcycle motorcycle = new Motorcycle();
                    motorcycle.initialize();
                    transportMap.put(TransportType.MOTORCYCLE, motorcycle);
                }
                return transportMap.get(TransportType.MOTORCYCLE);
            }
            case 1: {
                if (!transportMap.containsKey(TransportType.SCOOTER)) {
                    Scooter scooter = new Scooter();
                    scooter.initialize();
                    transportMap.put(TransportType.SCOOTER, scooter);
                }
                return transportMap.get(TransportType.SCOOTER);
            }
            case 2: {
                if (!transportMap.containsKey(TransportType.CAR)) {
                    Car car = new Car();
                    car.initialize();
                    transportMap.put(TransportType.CAR, car);
                }
                return transportMap.get(TransportType.CAR);
            }
            case 3: {
                if (!transportMap.containsKey(TransportType.BUS)) {
                    Bus bus = new Bus();
                    bus.initialize();
                    transportMap.put(TransportType.BUS, bus);
                }
                return transportMap.get(TransportType.BUS);
            }
            default:
                return null;
        }
    }
}