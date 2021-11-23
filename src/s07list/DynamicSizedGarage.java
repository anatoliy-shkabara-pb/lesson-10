package s07list;

import s02nogenerics.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class DynamicSizedGarage <T extends Vehicle> {

    private final List<T> vehicles;

    public DynamicSizedGarage() {
        vehicles = new ArrayList<>();
    }

    public void add(T t) {
        vehicles.add(t);
    }

    public T get(int index) {
        return vehicles.get(index);
    }

    public void addAll(List<T> list) {
        vehicles.addAll(list);
    }

    public void forEach(Consumer<T> consumer) {
        for (T vehicle : vehicles) {
            consumer.accept(vehicle);
        }
    }
}
