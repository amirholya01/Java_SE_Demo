package dk.customerSystem;

import dk.customerSystem.service.CustomerSystem;

public class ApplicationRunner {
    public static void main(String[] args) {
        try (CustomerSystem customerSystem = new CustomerSystem()) {
            customerSystem.run();
        }
    }
}
