package com.company.section_2_13_test_interfaces_and_default_methods.part_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public interface EqualsContract<T> extends Testable<T> {
    T createNotEqualValue();

    @Test
    default void valueEqualsItself() {
        T value = createValue();
        assertEquals(value, value);
    }

    @Test
    default void valueDoesNotEqualNull() {
        T value = createValue();
        assertNotNull(value);
    }

    @Test
    default void valueDoesNotEqualDifferentValue() {
        T value = createValue();
        T differentValue = createNotEqualValue();
        assertNotEquals(value, differentValue);
        assertNotEquals(differentValue, value);
    }
}
