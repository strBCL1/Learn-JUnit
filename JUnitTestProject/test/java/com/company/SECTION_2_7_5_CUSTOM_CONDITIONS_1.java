package com.company;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIf;
import org.junit.jupiter.api.condition.EnabledIf;

final class SECTION_2_7_5_CUSTOM_CONDITIONS_1 {

    @Test
    @EnabledIf("customCondition")
    void enabledIf() {

    }

    @Test
    @DisabledIf("customCondition")
    void disabledIf() {

    }

    boolean customCondition() {
        return true;
    }
}
