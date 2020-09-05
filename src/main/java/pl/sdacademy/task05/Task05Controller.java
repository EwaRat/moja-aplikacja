package pl.sdacademy.task05;

import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Task05Controller {

    private final ApplicationContext applicationContext;

    public Task05Controller(ApplicationContext applicationContext, NotManagedBySpring notManagedBySpring) {
        this.applicationContext = applicationContext;

        this.notManagedBySpring = notManagedBySpring;
    }

    @GetMapping(path = "/context") //, produces = {MediaType.APPLICATION_JSON_VALUE})
    public String[] getContext() {  // lub List<String>
        return applicationContext.getBeanDefinitionNames();

    }

    private final NotManagedBySpring notManagedBySpring;


}

