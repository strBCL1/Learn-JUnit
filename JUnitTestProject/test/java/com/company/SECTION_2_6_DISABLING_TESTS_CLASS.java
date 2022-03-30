package com.company;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled(value = "Disabled until the bug #99 has been fixed.")
final class SECTION_2_6_DISABLING_TESTS extends MainClass {

    @Test
    void testWillBeSkipped() {

    }
}
