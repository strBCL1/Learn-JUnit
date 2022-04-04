package com.company;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("TestInfo Demo")
final class SECTION_2_12_DEPENDENCY_INJECTION_USING_TEST_INFO {

    SECTION_2_12_DEPENDENCY_INJECTION_USING_TEST_INFO(TestInfo testInfo) {
        System.out.println("constructor");
        assertEquals("TestInfo Demo",
                testInfo.getDisplayName());
    }

    @BeforeEach
    void init(TestInfo testInfo) {
        System.out.println("init");
        String displayName = testInfo.getDisplayName();
        assertTrue(displayName.equals("TEST 1") || displayName.equals("test2()"));
    }

    @Test
    @DisplayName("TEST 1")
    @Tag("my-tag")
    void test1(TestInfo testInfo) {
        System.out.println("test1");
        assertEquals("TEST 1", testInfo.getDisplayName());
    }

    @Test
    void test2() {
        System.out.println("test2");
    }
}
