package com.adarsh.java.lib.commons.lang;

import com.google.common.collect.ImmutableSet;
import org.apache.commons.lang3.StringUtils;

import java.util.Set;

public class TryStringUtilsJoin {
    public static void main(String[] args) {
        // create immutable set of strings
        final Set<String> immutableSet = ImmutableSet.of("apollo", "ceat", "mrf", "michellin");

        // try to join them by using commons lang StringUtils.join
        final String finalString = StringUtils.join(immutableSet, ",");
        System.out.println("finalString: " + finalString);

        // you could also join using character instead of string based separator
        final String finalString2 = StringUtils.join(immutableSet, ',');
        System.out.println("finalString: " + finalString2);
    }
}
