package pl.sdacademy.springconfig;

import org.springframework.stereotype.Service;

@Service
 class CarService {

private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
    this.carRepository=carRepository;
    }
    public String get(int id) {
        return carRepository.findById(id);  // dopiero service wie ze jak ma pobrac cos musi sie skomunikowac z repozytorium
    }
}
