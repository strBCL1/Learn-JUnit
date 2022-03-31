package com.company;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.DisabledIfSystemProperty;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;

final class SECTION_2_7_4_ENVIRONMENT_VARIABLE_CONDITIONS {

    @Test
    @EnabledIfEnvironmentVariable(named = "ENV", matches = "staging-server")
    void onlyOnStagingServer() {

    }

    @Test
    @DisabledIfEnvironmentVariable(named = "ENV", matches = "*development*")
    void notOnDeveloperWorkstation() {

    }
}
