package com.company;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfSystemProperty;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;

final class SECTION_2_7_3_SYSTEM_PROPERTY_CONDITIONS {

    @Test
    @EnabledIfSystemProperty(named = "os.arch", matches = "*64*")
    void onlyOn64BitArchitectures() {

    }

    @Test
    @DisabledIfSystemProperty(named = "ci-server", matches = "true")
    void notOnCiServer() {
        
    }
}
