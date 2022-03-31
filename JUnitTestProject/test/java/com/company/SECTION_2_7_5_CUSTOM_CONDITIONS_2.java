package com.company;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIf;

final class SECTION_2_7_5_CUSTOM_CONDITIONS_2 {

    @Test
    @EnabledIf("com.company.ExternalCondition#customCondition")
    void enabledIf() {

    }
}

class ExternalCondition {
    static boolean customCondition() {
        return true;
    }
}