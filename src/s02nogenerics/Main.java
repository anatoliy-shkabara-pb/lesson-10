package s02nogenerics;

public class Main {

    public static void main(String[] args) {
        Garage garage = new Garage();
        garage.set(new Car("Aston Martin"));
        Car car = (Car) garage.get();
        System.out.println(car.getName());

        Garage garage2 = new Garage();
        garage2.set(new Motorcycle("Honda CBR500R"));
        // ClassCastException
        Motorcycle motorcycle = (Motorcycle) garage.get();
        System.out.println(motorcycle.getName());
    }
}
