package pl.wsb;

public class Car extends Vehicle {
    int doorCount, horsePower;

    public Car(String reg, String vin, String color, double price, double kmCount,
               double fuelMax, double fuelCount, double fuelPer100Km, int doorCount, int horsePower) {
        super(reg, vin, color, price, kmCount, fuelMax, fuelCount, fuelPer100Km);
        this.doorCount = doorCount;
        this.horsePower = horsePower;
    }
}
