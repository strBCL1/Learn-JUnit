package java.company;

import org.junit.jupiter.api.*;

import java.company.Main;

import static org.junit.jupiter.api.Assertions.*;

class MainTest_v1_3 extends Main {
    private Main mainObject = new Main();

    @Test
    @DisplayName(value = "Sum test")
    void givenTwoNumbers_whenSum_thenReturnSum() {
        assertEquals(20, mainObject.sum(12, 8));
    }

    @Test
    @DisplayName(value = "Multiply test!")
    void givenTwoNumbers_whenMultiply_thenReturnMultiplication() {
        assertEquals(15, mainObject.multiply(3, 5));
    }

    @RepeatedTest(5)
    @DisplayName(value = "Ensure current handling of zero")
    void givenOneZeroElement_whenMultiply_thenReturnMultiplication() {
        for (int i = 1; i < 3; ++i) {
            assertEquals(0, mainObject.multiply(0, i));
            System.out.println("Current i: " + i);
        }

    }
}