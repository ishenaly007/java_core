public class Car {
    String color;
    String model;
    int fuel;
    int maxFuel;
    double fuelConsumption;

    Car(String color, String model) {
        this.color = color;
        this.model = model;
    }

    void move(int x1, int y1, int x2, int y2) {
        double path = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        int toplivo = (int) (path / 100 * fuelConsumption);
        fuel = fuel - toplivo;
        if (fuel < 0) {
            System.out.println("Автомобиль " + model + "не доехал, пора заправляться!");
            fuel = 0;
        } else {
            System.out.println("Автомобиль " + model + " проехал " + path + "км дороги, " +
                    "Потрачено топлива: " + toplivo + "л, Осталось топлива: " + fuel + "л");
        }
    }

    void reFuel(int liters) {
        if (liters > maxFuel) {
            System.out.println("Бензин льется через край!");
            fuel = maxFuel;
        } else {
            fuel += liters;
            System.out.println("топливо заправилось на " + liters + "л");
            System.out.println("Кол-во топлива в машине " + fuel + "л");
        }
    }
}
