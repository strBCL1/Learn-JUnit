package com.company.section_2_13_test_interfaces_and_default_methods.part_1;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

public interface TestInterfaceDynamicTestsDemo {

//    @TestFactory
//    @Disabled
//    default Stream<DynamicTest> dynamicTestsForPalindromes() {
//        return Stream.of("racecar", "radar", "mom", "dad")
//                .map(text -> dynamicTest(text, () -> assertTrue(isPalindrome(text)))); // isPalindrome() has not been implemented
//    }
}
