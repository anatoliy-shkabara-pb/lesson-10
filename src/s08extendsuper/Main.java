package s08extendsuper;

import s02nogenerics.Car;
import s02nogenerics.Vehicle;
import s05manyparam.Truck;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        // Верхняя граница подстановки
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck("Hell yeah"));
        trucks.add(new Truck("Terminator"));

        DynamicSizedGarage<Car> garage = new DynamicSizedGarage<>();
        garage.add(new Car("Aston Martin"));
        garage.addAll(trucks);



        // Нижняя граница подстановки
        Consumer<Object> objectConsumer = new Consumer<Object>() {
            @Override
            public void accept(Object object) {
                System.out.println(object.hashCode());
            }
        };

        Consumer<Vehicle> vehicleConsumer = new Consumer<Vehicle>() {
            @Override
            public void accept(Vehicle vehicle) {
                System.out.println(vehicle.getName());
            }
        };

        DynamicSizedGarage<Car> garage2 = new DynamicSizedGarage<>();
        garage2.add(new Car("Toyota"));
        garage2.add(new Car("Jaguar"));
        garage2.add(new Car("BMW"));
        garage2.forEach(vehicleConsumer);
        garage2.forEach(objectConsumer);
    }
}
