package pl.sdacademy.springconfigexternal;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;


public class CarInMemoryRepository implements CarRepository {

    private static final Map<Integer,String> cars = new HashMap<>();

    static {
        cars.put(0, "Porsche");
        cars.put(1, "Ford");
        cars.put(2, "Mazda");
        cars.put(3, "Volvo");
        cars.put(4, "Audi");
    }
    @Override
    public String findById(int id) {
        return cars.get(id);
    }
}
