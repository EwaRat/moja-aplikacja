package pl.sdacademy.task04;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.sdacademy.task02.Animal;

@RestController
public class Task04Controller {
    private final AnimalService animalService;
    @GetMapping(path = "/task04", produces = {MediaType.APPLICATION_JSON_VALUE})
    public Animal getAnimal() {
        return animalService.getAnimal();
    }
    public Task04Controller(AnimalService animalService) {
        this.animalService = animalService;
    }
}