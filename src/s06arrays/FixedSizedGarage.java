package s06arrays;

import s02nogenerics.Vehicle;

public class FixedSizedGarage<T extends Vehicle> {

    private final T[] vehicles;

    @SuppressWarnings("unchecked")
    public FixedSizedGarage(int size) {

        // Нельзя создать массив типа T.
        // Зато можно привести любой другой массив к типу (T[]), но это небезопасно.
        // Тем не менее, в данном случае всё будет работать.

        // vehicles = new T[size];
        vehicles = (T[]) new Vehicle[size];
    }

    public T get(int index) {
        return vehicles[index];
    }

    public void set(int index, T vehicle) {
        this.vehicles[index] = vehicle;
    }
}
