package pl.wsb;

public class Motorcycle extends Vehicle {
    int engineSize, horsePower;

    public Motorcycle(String reg, String vin, String color, double price, double kmCount,
                      double fuelMax, double fuelCount, double fuelPer100Km, int engineSize, int horsePower) {
        super(reg, vin, color, price, kmCount, fuelMax, fuelCount, fuelPer100Km);
        this.engineSize = engineSize;
        this.horsePower = horsePower;
    }
}
