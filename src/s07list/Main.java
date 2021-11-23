package s07list;

import s02nogenerics.Car;
import s02nogenerics.Motorcycle;
import s05manyparam.Truck;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        DynamicSizedGarage<Motorcycle> garage = new DynamicSizedGarage<>();
        garage.add(new Motorcycle("Honda CBR500R"));
        garage.add(new Motorcycle("Harley-Davidson"));
        Motorcycle motorcycle1 = garage.get(0);
        Motorcycle motorcycle2 = garage.get(1);
        System.out.println(motorcycle1.getName());
        System.out.println(motorcycle2.getName());

        System.out.println();

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota"));
        cars.add(new Car("Jaguar"));
        cars.add(new Car("BMW"));

        DynamicSizedGarage<Car> garage2 = new DynamicSizedGarage<>();
        garage2.add(new Car("Aston Martin"));
        garage2.addAll(cars);
        garage2.forEach(new Consumer<Car>() {
            @Override
            public void accept(Car car) {
                System.out.println(car);
            }
        });

        // Есть ограничение, мы не можем в гараж добавить список грузовиков
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck("Hell yeah"));
        trucks.add(new Truck("Terminator"));

        DynamicSizedGarage<Car> garage3 = new DynamicSizedGarage<>();
        garage3.add(new Car("Aston Martin"));
        // Error:
        // incompatible types: java.util.List<Truck> cannot be converted to java.util.List<Car>
        // garage3.addAll(trucks);
    }
}
