package com.company;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class MainClassTest extends MainClass {
    private final MainClass testObject = new MainClass();

    @BeforeAll
    static void beforeAllTest() {
        System.out.println("I run before all tests!");
    }

    @BeforeEach
    void beforeEachTest() {
        System.out.println("I run before each test!");
    }

    @Test
    void givenSevenAndEight_whenSum_thenReturnFifteen() {
        assertEquals(15, testObject.sum(7, 8));
    }

    @Test
    void alwaysFailingTest() {
        fail("I always fail!");
    }

    @Test
    @Disabled(value = "for demonstration purposes")
    void disabledTest() {
        // I won't even launch!
    }

    @AfterEach
    void afterEachTest() {
        System.out.println("I run after each test!");
    }

    @AfterAll
    static void afterAllTest() {
        System.out.println("I run after all tests!");
    }
}