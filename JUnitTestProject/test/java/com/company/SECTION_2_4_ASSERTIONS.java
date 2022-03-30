package com.company;

import org.junit.jupiter.api.Test;

import static java.time.Duration.ofMillis;
import static java.time.Duration.ofMinutes;
import static org.junit.jupiter.api.Assertions.*;

final class SECTION_2_4_ASSERTIONS extends Calculator {
    private final Calculator calculator = new Calculator();
    private final Person person = new Person("chris", "lowerd");

    @Test
    void standardAssertions() {
        assertEquals(15, calculator.sum(8, 7));
        assertEquals(4, calculator.multiply(4, 1),
                "Optional failure message here!");

        assertTrue('a' < 'b', () -> "Assertion methods can be lazily evaluated -- " +
                "to avoid constructing complex messages unnecessarily.");
    }

    @Test
    void groupedAssertions() {
        // In a grouped assertions, all assertions are executed,
        // and all failures will be reported.
        assertAll("person",
                () -> assertEquals("chris", person.getFirstName()),
                () -> assertEquals("lowerd", person.getLastName())
        );
    }

    @Test
    void dependentAssertions() {
        // Within a code block, if an assertion fails,
        // the subsequent code in the same block will be skipped.
        assertAll("properties",
                () -> {
            String firstName = person.getFirstName();
            assertNotNull(firstName);

            // Executed ONLY if the previous assertion is valid.
            assertAll("first name",
                    () -> assertTrue(firstName.startsWith("ch")),
                    () -> assertTrue(firstName.endsWith("ris"))
            );
                },

                () -> {
            // Grouped assertion, so processed independently
            // of results of first assertion.
            String lastName = person.getLastName();
            assertNotNull(lastName);

            assertAll("last name",
                    () -> assertTrue(lastName.startsWith("lo")),
                    () -> assertTrue(lastName.endsWith("werd"))
            );
                });
    }

    @Test
    void exceptionTesting() {
        Exception exception = assertThrows(ArithmeticException.class, () -> calculator.divide(15, 0));
        assertEquals("/ by zero", exception.getMessage());
    }

    @Test
    void timeoutNotExceeded() {
        // The following assertion succeeds.
        assertTimeout(ofMinutes(1), () -> {
            // Perform task than takes less than 1 minute.
        });
    }

    @Test
    void timeoutNotExceededWithResult() {
        // The following assertion succeeds, and returns the supplied object.
        String actualResult = assertTimeout(ofMinutes(1), () -> {
            return "a result";
        });

        assertEquals("a result", actualResult);
    }

    @Test
    void timeoutExceeded() {
        // The following assertion fails with an error message similar to:
        // execution exceeded timeout of 10 ms by 90 ms.
        assertTimeout(ofMillis(10), () -> {
            // Simulate task that takes more than 10 ms.
            Thread.sleep(100);
        });
    }

    @Test
    void timeoutExceededWithPreemptiveTermination() {
        // The following assertion failes with an error message similar to:
        // execution timed out after 10 ms.
        assertTimeoutPreemptively(ofMillis(10), () -> {
            // Simulate task that takes more than 10 ms.
            Thread.sleep(100);
        });
    }
}
