package s06arrays;

import s02nogenerics.Car;

public class Main {

    public static void main(String[] args) {
        FixedSizedGarage<Car> garage = new FixedSizedGarage<>(2);
        garage.set(0, new Car("Aston Martin"));
        garage.set(1, new Car("Audi"));
        Car car1 = garage.get(0);
        Car car2 = garage.get(1);
        System.out.println(car1.getName());
        System.out.println(car2.getName());
    }
}
