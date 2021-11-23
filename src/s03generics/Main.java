package s03generics;

import s02nogenerics.Car;
import s02nogenerics.Motorcycle;

public class Main {

    public static void main(String[] args) {
        Garage<Car> garage = new Garage<>();
        garage.set(new Car("Aston Martin"));
        Car car = garage.get();
        System.out.println(car.getName()); // Aston Martin

        Garage<Motorcycle> garage2 = new Garage<>();
        garage2.set(new Motorcycle("Honda CBR500R"));
        // ошибка компиляции
        // Motorcycle motorcycle = garage.get();
        // System.out.println(motorcycle.getName());

        //Но в гараж можно положить что угодно
        Garage<String> garage3 = new Garage<>();
        garage3.set("abc");
        String str = garage3.get();
        System.out.println(str);
    }
}
