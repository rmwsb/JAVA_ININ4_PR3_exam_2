package pl.wsb;

public class Truck extends Vehicle {
    int capacity, horsePower;

    public Truck(String reg, String vin, String color, double price, double kmCount,
                 double fuelMax, double fuelCount, double fuelPer100Km, int capacity, int horsePower) {
        super(reg, vin, color, price, kmCount, fuelMax, fuelCount, fuelPer100Km);
        this.capacity = capacity;
        this.horsePower = horsePower;
    }
}
