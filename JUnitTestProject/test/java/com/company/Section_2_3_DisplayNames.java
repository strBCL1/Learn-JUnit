package com.company;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("JUnit - section 2.3")
public class Section_2_3_DisplayNames extends MainClass {

    @Test
    @DisplayName("Custom test name containing spaces")
    void testWithDisplayNameContatiningSpaces() { }

    @Test
    @DisplayName("╯°□°）╯")
    void testDisplayNameContainingSpecialCharacters() { }

    @Test
    @DisplayName(value = "ὣ")
    void testDisplayNameContainingEmojis() { }
}
