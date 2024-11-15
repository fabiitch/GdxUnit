package com.github.fabiitch.gdxunit.tab;

import lombok.experimental.UtilityClass;
import org.junit.jupiter.api.Assertions;

@UtilityClass
public class BooleanTabTestUtils {

    public static int countContains(boolean[] tab1, boolean[] tab2) {
        int containsFound = 0;
        for (boolean value : tab2)
            if (contains(tab1, value))
                containsFound++;
        return containsFound;
    }

    public static boolean contains(boolean[] tab, boolean value) {
        int i = tab.length - 1;
        while (i >= 0)
            if (tab[i--] == value) return true;
        return false;
    }

    public static boolean containsAll(boolean[] tab, boolean... values) {
        for (boolean value : values) {
            if (!contains(tab, value))
                return false;
        }
        return true;
    }

    public static boolean containsAny(boolean[] tab, boolean... values) {
        for (boolean value : values) {
            if (contains(tab, value))
                return true;
        }
        return false;
    }

    public static void lengthEquals(boolean[] tab1, boolean[] tab2) {
        Assertions.assertEquals(tab1.length, tab2.length, "length not equals");
    }

    public static void assertEquals(boolean[] tab1, boolean[] tab2) {
        Assertions.assertEquals(tab1.length, tab2.length, "length not equals");
        for (int i = 0; i < tab1.length; i++) {
            Assertions.assertEquals(tab1[i], tab2[i], "fail at index:" + i);
        }
    }

    public static void containsXValue(boolean[] tab1, boolean[] tab2, int expectedValueContains) {
        int countContains = countContains(tab1, tab2);
        if (countContains != expectedValueContains)
            Assertions.fail("Expected tab contains " + expectedValueContains + " but found " + countContains);
    }

}
