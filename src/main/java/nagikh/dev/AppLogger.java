package nagikh.dev;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class AppLogger {
    public AppLogger() {
        System.out.println("[AppLogger] constructor");
    }

    @PostConstruct
    public void init() {
        System.out.println("[PostConstruct] init AppLogger");
    }

    @PreDestroy
    public void shutdown() {
        System.out.println("[PreDestroy] shutdown AppLogger");

    }
}
