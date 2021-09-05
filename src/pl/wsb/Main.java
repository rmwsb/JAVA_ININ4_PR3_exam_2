package pl.wsb;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car("GD 111", "123ABC", "bialy", 50000,
                0, 60, 50, 6, 4, 100);
        Car car2 = new Car("GD 222", "123CBC", "czarny", 100000,
                10000, 40, 30, 12, 3, 150);
        Truck truck1 = new Truck("GD 333", "233CBC", "czerwony", 900000,
                10000, 120, 30, 20, 1000, 300);
        Truck truck2 = new Truck("GD 444", "333CBC", "zielony", 850000,
                5000, 100, 30, 22, 1200, 350);
        Motorcycle motorcycle1 = new Motorcycle("GD 555", "988GGG", "czarny", 10000,
                10000, 12, 4, 3, 125, 20);
        Motorcycle motorcycle2 = new Motorcycle("GD 666", "984GGG", "czarny", 5000,
                1000, 14, 5, 4, 125, 22);

        car1.refuel(1);
        car1.drive(1);
        car1.recolor("rozowy");

        car2.refuel(111);
        car2.drive(11111);
        car2.recolor("rozowy");

        truck1.refuel(22);
        truck1.drive(333);
        truck1.recolor("rozowy");

        truck2.refuel(33);
        truck2.drive(123);
        truck2.recolor("rozowy");

        motorcycle1.refuel(2);
        motorcycle1.drive(33);
        motorcycle1.recolor("rozowy");

        motorcycle2.refuel(11);
        motorcycle2.drive(44);
        motorcycle2.recolor("rozowy");
        System.out.println("Pojazd " + motorcycle2.reg + " moze przejechac jeszcze: " + motorcycle2.remainingKm() + " km");
    }
}
