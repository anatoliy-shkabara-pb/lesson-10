package s05manyparam;

import s02nogenerics.Car;
import s02nogenerics.Motorcycle;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Aston Martin");
        Motorcycle motorcycle = new Motorcycle("Honda CBR500R");
        Truck truck = new Truck("Road Kill");

        TripleGarage<Car, Motorcycle, Truck> garage1 = new TripleGarage<>();
        garage1.set1(car);
        garage1.set2(motorcycle);
        garage1.set3(truck);

        TripleGarage<Car, Motorcycle, Truck> garage2 = new TripleGarage<>();
        garage2.set1(truck);
        garage2.set2(motorcycle);
        garage2.set3(truck);
        Car car1 = garage2.get1();

        //Truck truck1 = garage2.get1();
        Truck myTruck = (Truck) garage2.get1();

        TripleGarage<Car, Car, Car> garage3 = new TripleGarage<>();
        garage3.set1(car);
        garage3.set2(car);
        garage3.set3(car);
    }
}
