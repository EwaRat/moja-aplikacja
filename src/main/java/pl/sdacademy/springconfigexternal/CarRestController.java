package pl.sdacademy.springconfigexternal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController("carRestControllerExternal") // w nawiasie - nazwa bina

public class CarRestController {

    private final CarService carService;

    public CarRestController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars2/{id}")   // http://localhost:8080/cars/2

    public String getCar(@PathVariable int id) {
        return carService.get(id);  // get czyli daj mi to
    }
}
