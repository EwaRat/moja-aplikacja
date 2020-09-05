package pl.sdacademy;

import org.junit.jupiter.api.Test;
import pl.sdacademy.task02.Animal;
import pl.sdacademy.task04.AnimalService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class AnimalServiceTest {
    @Test
    void getAnimal() {
        AnimalService as = new AnimalService();
        Animal result = as.getAnimal();
        assertNotNull(result);
        assertEquals("Cortes", result.getName());
        assertEquals(5, result.getAge());
    }
}