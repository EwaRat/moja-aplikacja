package pl.sdacademy.springconfigexternal;

import org.springframework.stereotype.Service;


// tu nie ma zadnej adnotacji Springowej - po lewej na pasku zielony znaczek - to znaczy ze spring
public class CarService {

private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
    this.carRepository=carRepository;
    }
    public String get(int id) {
        return carRepository.findById(id);  // dopiero service wie ze jak ma pobrac cos musi sie skomunikowac z repozytorium
    }
}
