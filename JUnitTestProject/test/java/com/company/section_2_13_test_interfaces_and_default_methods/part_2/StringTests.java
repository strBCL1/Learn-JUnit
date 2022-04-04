package com.company.section_2_13_test_interfaces_and_default_methods.part_2;

public class StringTests implements ComparableContract<String>, EqualsContract<String> {
    @Override
    public String createSmallerValue() {
        return "apple"; // 'a' < 'b' in "banana"
    }

    @Override
    public String createNotEqualValue() {
        return "cherry";
    }

    @Override
    public String createValue() {
        return "banana";
    }
}
