package com.company;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class Section_2_3_1_Display_Name_Generators extends MainClass {

    @Nested
    class TheYearIsNotSupported {

        @Test
        void ifYearIsZero() { }

        @DisplayName(value = "A negative value for year is not supported by the leap year computation.")
        @ParameterizedTest(name = "For example, {0} is not supported")
        @ValueSource(ints = {-1, -4})
        void ifITIsNegative(int year) { }
    }

    @Nested
    @IndicativeSentencesGeneration(generator = DisplayNameGenerator.ReplaceUnderscores.class, separator = "->")
    class TheYearIsLeapYear {

        @Test
        void ifTheYearIsDivisibleBy4AndNotBy100() { }

        @ParameterizedTest(name = "Year {0} is a leap year.")
        @ValueSource(ints = {2016, 2020, 2048})
        void ifItIsNotOneOfTheFollowingYears(int year) {}
    }
}
