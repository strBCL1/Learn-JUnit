package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.*;

final class SECTION_2_5_ASSUMPTIONS extends Calculator {
    private final Calculator calculator = new Calculator();

    @Test
    void testOnlyOnCiServer() {
        assumeTrue("CI".equals(System.getenv("ENV")));
        // Remainder of the test.
    }

    @Test
    void testOnlyOnDeveloperWorkstation() {
        assumeTrue("DEV".equals(System.getenv("ENV")),
                () -> "Aborting test: not on developer workstation");
    }

    @Test
    void testInAllEnvironments() {
        assumingThat("CI".equals(System.getenv("ENV")),
                () -> {
            // Perform this assertion only on the CI server.
            assertEquals(0, calculator.subtract(1, 1));
                });

        // Perform this assertion on all environments.
        assertEquals(42, calculator.multiply(21, 2));
    }
}
