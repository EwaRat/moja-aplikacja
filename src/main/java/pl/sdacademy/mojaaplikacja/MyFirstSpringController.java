package pl.sdacademy.mojaaplikacja;

import org.springframework.util.StringUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Size;

@Validated // dodac ta adnotacje
@RestController

public class MyFirstSpringController {

    @GetMapping (path= "/hello") // localhost:8080/hello
    public String hello(@RequestParam(value="name") String name) {

        if(name.isBlank()) {
            throw new IllegalArgumentException("Invalid parameter 'name' ");
        }
        return "Hello " + name;
    }

    @GetMapping("/favourite/{number}") //localhost:8080/favourite/8?name=Ewa
//    public String favourite (@PathVariable("number") String number,    // i tu trzeba dodac w pom dependency hibernate
//        @Size(min=2, max=20) @RequestParam(value="name")String name) {
//        String prefix =" ";
//        if(!name.isEmpty()) {
//            prefix = "Hello " + name;
//        }else {
//            prefix = "Hello";
//        }
//        return prefix + "your favourite number is: " + number;
//        }


    public String hello(@PathVariable("number") int number, @RequestParam(value = "name", required = false) String name) {
        StringBuilder sb = new StringBuilder("Hello");
        if (!StringUtils.isEmpty(name)) {
            sb.append(" ").append(name);
        }
        sb.append(", your favourite number is: ");
        sb.append(String.valueOf(number).matches("\\d+") ? number : "NaN");
        return sb.toString();
    }
}

