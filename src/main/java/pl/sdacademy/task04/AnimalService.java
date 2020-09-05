package pl.sdacademy.task04;


import org.springframework.stereotype.Service;
import pl.sdacademy.task02.Animal;

@Service
public class AnimalService {
    public Animal getAnimal() {
        Animal animal = new Animal("Mój Pies", 19);
        return animal;
    }

}
