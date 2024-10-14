package com.github.fabiitch.gdxunit;

import com.badlogic.gdx.utils.Array;
import org.junit.jupiter.api.Assertions;

public class ArrayTestUtils {
    public static <T> void assertHasSize(int sizeExpected, Array<T> array) {
        Assertions.assertEquals(sizeExpected, array.size);
    }

    public static <T> void assertEmpty(Array<T> array) {
        Assertions.assertTrue(array.isEmpty(), "Expected empty array but size=" + array.size);
    }

    @SafeVarargs
    public static <T> void assertContainsAll(boolean identity, Array<T> array, T... values) {
        for (int i = 0; i < values.length; i++) {
            if (!array.contains(values[i], identity))
                Assertions.fail("array not contains value at pos " + i);
        }
    }

    @SafeVarargs
    public static <T> void assertContainsAll(Array<T> array, T... values) {
        for (int i = 0; i < values.length; i++) {
            if (!array.contains(values[i], true))
                Assertions.fail("array not contains value at pos " + i);
        }
    }

    @SafeVarargs
    public static <T> void assertContainsOnly(Array<T> array, T... values) {
        for (int i = 0; i < values.length; i++) {
            if (!array.contains(values[i], true))
                Assertions.fail("array not contains value at pos " + i);
        }
    }

    public static <T> void assertEquals(Array<T> array1, Array<T> array2, boolean identity) {
        Assertions.assertEquals(array1.size, array2.size, "size not equals");
        for (int i = 0; i < array1.size; i++) {
            if (identity)
                Assertions.assertSame(array1.get(i), array2.get(i), "fail at index:" + i);
            else
                Assertions.assertEquals(array1.get(i), array2.get(i), "fail at index:" + i);
        }
    }


    public static <T> void assertEquals(float[] array1, float[] array2) {
        Assertions.assertEquals(array1.length, array2.length, "size not equals");
        for (int i = 0; i < array1.length; i++) {
            Assertions.assertEquals(array1[i], array2[i], "fail at index:" + i);
        }
    }

}
