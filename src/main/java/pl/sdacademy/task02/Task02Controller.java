package pl.sdacademy.task02;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Map;

@RestController
public class Task02Controller {
    @GetMapping("/animal")
    public Animal animalResponser() {
        Animal animal = new Animal("Burek", 6);
        return animal;
    }

    @GetMapping (path="/task.02.1", produces={MediaType.APPLICATION_XML_VALUE}) // to sprawia ze animal tez wyswietli xml, do pom trzeba dodac tez zaleznosc!!
    public Animal displayAnimalXml() {                                          //gybysmy chcieli json to wpisujemy application_json_value
        return new Animal ("Puszek", 3);
    }


    @GetMapping(path = "/task.02.3")
    public Animal AnimalAcceptHeader(@RequestHeader("Accept") String acceptHeader,
                                     @RequestHeader Map<String,String> headers) {
        System.out.println("Accept header value: " + acceptHeader);
        System.out.println("All headers:");
        headers.forEach((key, value) ->
                System.out.println(key + ": " + value));
        return new Animal("Django", 3);
    }

    @PostMapping("/task03")  // zeby reagowalo na post i bylo dostepne pod tym urlem
    @ResponseStatus(HttpStatus.CREATED)  //ustawiamy status http
    public void task03(@RequestBody Animal animal) {  // musi byc to @... jesli chcemy odp w body - inaczej ptrzymamy nulla
        System.out.println(animal.getName());
    }

    @PostMapping ("task03-extra")
    public ResponseEntity<Animal> getAnimal(@RequestBody Animal animal) {
                return ResponseEntity
                        .accepted()
                        .lastModified(Instant.now())
                        .body(animal); //to jak build

    }
}
