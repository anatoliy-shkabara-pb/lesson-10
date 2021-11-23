package s05manyparam;

import s02nogenerics.Vehicle;

public class TripleGarage<T extends Vehicle, U extends Vehicle, V extends Vehicle> {

    private T vehicle1;
    private U vehicle2;
    private V vehicle3;

    public T get1() {
        return vehicle1;
    }

    public void set1(T vehicle1) {
        this.vehicle1 = vehicle1;
    }

    public U get2() {
        return vehicle2;
    }

    public void set2(U vehicle2) {
        this.vehicle2 = vehicle2;
    }

    public V get3() {
        return vehicle3;
    }

    public void set3(V vehicle3) {
        this.vehicle3 = vehicle3;
    }
}
