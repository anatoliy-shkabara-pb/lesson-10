package s08extendsuper;

import s02nogenerics.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class DynamicSizedGarage<T extends Vehicle> {

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

    // Верхняя граница подстановки
    public void addAll(List<? extends T> list) {
        vehicles.addAll(list);
    }


    // Нижняя граница подстановки
    public void forEach(Consumer<? super T> consumer) {
        for (T vehicle : vehicles) {
            consumer.accept(vehicle);
        }
    }
}
