package nagikh.dev;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public AppLogger appLogger() {
        return new AppLogger();
    }

    @Bean
   // @Scope("prototype") // шаг 4: потом убери эту строку и сравни поведение
    public OperationContext operationContext() {
        return new OperationContext();
    }
}
