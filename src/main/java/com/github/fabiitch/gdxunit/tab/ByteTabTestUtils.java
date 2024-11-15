package com.github.fabiitch.gdxunit.tab;

import lombok.experimental.UtilityClass;
import org.junit.jupiter.api.Assertions;

@UtilityClass
public class ByteTabTestUtils {

    public static int countContains(byte[] tab1, byte[] tab2) {
        int containsFound = 0;
        for (byte value : tab2)
            if (contains(tab1, value))
                containsFound++;
        return containsFound;
    }

    public static boolean contains(byte[] tab, byte value) {
        int i = tab.length - 1;
        while (i >= 0)
            if (tab[i--] == value) return true;
        return false;
    }

    public static boolean containsAll(byte[] tab, byte... values) {
        for (byte value : values) {
            if (!contains(tab, value))
                return false;
        }
        return true;
    }

    public static boolean containsAny(byte[] tab, byte... values) {
        for (byte value : values) {
            if (contains(tab, value))
                return true;
        }
        return false;
    }

    public static void lengthEquals(byte[] tab1, byte[] tab2) {
        Assertions.assertEquals(tab1.length, tab2.length, "length not equals");
    }

    public static void assertEquals(byte[] tab1, byte[] tab2) {
        Assertions.assertEquals(tab1.length, tab2.length, "length not equals");
        for (int i = 0; i < tab1.length; i++) {
            Assertions.assertEquals(tab1[i], tab2[i], "fail at index:" + i);
        }
    }

    public static void containsXValue(byte[] tab1, byte[] tab2, int expectedValueContains) {
        int countContains = countContains(tab1, tab2);
        if (countContains != expectedValueContains)
            Assertions.fail("Expected tab contains " + expectedValueContains + " but found " + countContains);
    }

}
