package com.github.fabiitch.gdxunit.tab;

import org.junit.jupiter.api.Assertions;

public class TabTestUtils {
    public static <T> boolean containsAll(T[] tab, boolean identity, T... values) {
        for (T value : values) {
            if (!contains(tab, value, identity))
                return false;
        }
        return true;
    }

    public static <T> boolean contains(T[] tab, T value, boolean identity) {
        int i = tab.length - 1;
        if (identity || value == null) {
            while (i >= 0)
                if (tab[i--] == value) return true;
        } else {
            while (i >= 0)
                if (value.equals(tab[i--])) return true;
        }
        return false;
    }

    public static <T> void assertLength(int lengthExpected, T[] tab) {
        Assertions.assertEquals(lengthExpected, tab.length);
    }

    public static <T> void assertEmpty(T[] tab) {
        Assertions.assertTrue(tab.length == 0, "Expected empty tab but length=" + tab.length);
    }


    @SafeVarargs
    public static <T> void assertContainsAll(boolean identity, T[] tab, T... values) {
        for (int i = 0; i < values.length; i++) {
            if (!contains(tab, values[i], identity))
                Assertions.fail("tab not contains value at pos " + i);
        }
    }

    @SafeVarargs
    public static <T> void assertContainsAll(T[] tab, T... values) {
        for (int i = 0; i < values.length; i++) {
            if (!contains(tab, values[i], true))
                Assertions.fail("tab not contains value at pos " + i);
        }
    }

    @SafeVarargs
    public static <T> void assertContainsOnly(T[] tab, T... values) {
        for (int i = 0; i < values.length; i++) {
            if (!contains(tab, values[i], true))
                Assertions.fail("tab not contains value at pos " + i);
        }
    }

    public static <T> void assertEquals(T[] tab1, T[] tab2, boolean identity) {
        Assertions.assertEquals(tab1.length, tab2.length, "length not equals");
        for (int i = 0; i < tab1.length; i++) {
            if (identity)
                Assertions.assertSame(tab1[i], tab2[i], "fail at index:" + i);
            else
                Assertions.assertEquals(tab1[i], tab2[i], "fail at index:" + i);
        }
    }

    public static <T> void assertEquals(int[] tab1, int[] tab2) {
        Assertions.assertEquals(tab1.length, tab2.length, "length not equals");
        for (int i = 0; i < tab1.length; i++) {
            Assertions.assertEquals(tab1[i], tab2[i], "fail at index:" + i);
        }
    }

    public static <T> void assertEquals(short[] tab1, short[] tab2) {
        Assertions.assertEquals(tab1.length, tab2.length, "length not equals");
        for (int i = 0; i < tab1.length; i++) {
            Assertions.assertEquals(tab1[i], tab2[i], "fail at index:" + i);
        }
    }

    public static <T> void assertEquals(long[] tab1, long[] tab2) {
        Assertions.assertEquals(tab1.length, tab2.length, "length not equals");
        for (int i = 0; i < tab1.length; i++) {
            Assertions.assertEquals(tab1[i], tab2[i], "fail at index:" + i);
        }
    }

    public static <T> void assertEquals(float[] tab1, float[] tab2) {
        Assertions.assertEquals(tab1.length, tab2.length, "length not equals");
        for (int i = 0; i < tab1.length; i++) {
            Assertions.assertEquals(tab1[i], tab2[i], "fail at index:" + i);
        }
    }

    public static <T> void assertEquals(double[] tab1, double[] tab2) {
        Assertions.assertEquals(tab1.length, tab2.length, "length not equals");
        for (int i = 0; i < tab1.length; i++) {
            Assertions.assertEquals(tab1[i], tab2[i], "fail at index:" + i);
        }
    }

    public static <T> void assertEquals(byte[] tab1, byte[] tab2) {
        Assertions.assertEquals(tab1.length, tab2.length, "length not equals");
        for (int i = 0; i < tab1.length; i++) {
            Assertions.assertEquals(tab1[i], tab2[i], "fail at index:" + i);
        }
    }

    public static <T> void assertEquals(boolean[] tab1, boolean[] tab2) {
        Assertions.assertEquals(tab1.length, tab2.length, "length not equals");
        for (int i = 0; i < tab1.length; i++) {
            Assertions.assertEquals(tab1[i], tab2[i], "fail at index:" + i);
        }
    }

    public static <T> void assertEquals(char[] tab1, char[] tab2) {
        Assertions.assertEquals(tab1.length, tab2.length, "length not equals");
        for (int i = 0; i < tab1.length; i++) {
            Assertions.assertEquals(tab1[i], tab2[i], "fail at index:" + i);
        }
    }
}
