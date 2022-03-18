package ir.mkay.wiseknight;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Wise Knight", description = "API docs for Wise Knight app.", version = "v0.0.1"))
public class WiseKnightApplication {

    public static void main(String[] args) {
        SpringApplication.run(WiseKnightApplication.class, args);
    }

}
