package nagikh.dev;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class OperationContext {
    public OperationContext() {
        System.out.println("[OperationContext] constructor");
    }

    @PostConstruct
    public void init() {
        System.out.println("[PostConstruct] init Operation");
    }

    @PreDestroy
    public void shutdown() {
        System.out.println("[PreDestroy] shutdown Operation");

    }
}
