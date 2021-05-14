package com.adarsh.java;

import com.google.common.collect.ImmutableSet;

import java.util.Set;

public class ImmutableSetUsage {
    public static void main(String[] args) {
        //create an immutable set of values
        Set<String> valueInvestorSet = ImmutableSet.of(
                "Warren E. Buffett",
                "Charles T. Munger"
        );

        // use streams api to print each value in the set
        valueInvestorSet.forEach(value -> System.out.println(value));
    }
}
