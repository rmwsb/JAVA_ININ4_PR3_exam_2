package pl.wsb;

public abstract class Vehicle implements Interface {
    public String reg, vin, color;
    public double price, kmCount, fuelMax, fuelCount, fuelPer100Km;

    public Vehicle(String reg, String vin, String color, double price, double kmCount,
               double fuelMax, double fuelCount, double fuelPer100Km) {
        this.reg = reg;
        this.vin = vin;
        this.color = color;
        this.price = price;
        this.kmCount = kmCount;
        this.fuelMax = fuelMax;
        this.fuelCount = fuelCount;
        this.fuelPer100Km = fuelPer100Km;
    }
    public void drive(double km) {
        if(km < remainingKm()) {
            this.fuelCount -= (fuelPer100Km / 100 * km);
            this.kmCount += km;
            System.out.println("Pojazd " + reg + " przejechal: " + km + " km. Stan licznika: " + kmCount);
        } else {
            System.out.println("Nie mozna przejechac tylu kilometrow.");
        }
    }

    public void refuel(double fuel) {
        if((this.fuelCount + fuel) <= fuelMax) {
            this.fuelCount += fuel;
            System.out.println("Pojazd " + reg + " zatankowal: " + fuel + " l. Stan paliwa: " + fuelCount);
        } else {
            System.out.println("Pojazd " + reg + " zatankowal: " +  (fuelMax - fuelCount) + " l. Stan paliwa: " + fuelMax);
            this.fuelCount = fuelMax;
        }
    }

    public double remainingKm() {
        return (this.fuelCount/(this.fuelPer100Km/100));
    }

    public void recolor(String color) {
        this.price *= 1.05;
        this.color = color;
        System.out.println("Pojazd " + reg + " przemalowany na kolor: " +  color + " . Obecna wartosc: " + price);
    }
}
