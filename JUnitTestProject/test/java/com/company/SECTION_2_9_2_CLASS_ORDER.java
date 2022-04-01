package com.company;

import org.junit.jupiter.api.*;

@TestClassOrder(ClassOrderer.OrderAnnotation.class)
final class SECTION_2_9_2_CLASS_ORDER {

    @Nested
    @Order(1)
    class PrimaryTests {

        @Test
        void test1() {

        }
    }

    @Nested
    @Order(2)
    class SecondaryTests {

        @Test
        void test2() {

        }
    }
}
