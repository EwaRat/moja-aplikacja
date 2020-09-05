package pl.sdacademy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "pl.sdacademy")  // przeskanuj pakiet wewnatrz - wiec caly pl.sdacademy wezmie pod uwage:)
public class MojaAplikacjaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MojaAplikacjaApplication.class, args);
	}

}
