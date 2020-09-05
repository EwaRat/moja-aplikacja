package pl.sdacademy.springconfigexternal;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CarsConfiguration {
    @Bean
    public CarService carServiceExternal(CarRepository inMemoryCarRepositoryExternal) {
        return new CarService(inMemoryCarRepositoryExternal);
    }

    @Bean // wez to co jest w tej metodzie i stworz beana z tego
    public CarRepository inMemoryCarRepositoryExternal() {
        return new CarInMemoryRepository();
    }
}
