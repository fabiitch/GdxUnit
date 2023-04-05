package com.fabiitch.gdxunit;

import com.badlogic.gdx.utils.Array;
import com.fabiitch.nz.java.data.collections.utils.ArrayUtils;
import org.junit.jupiter.api.Assertions;

public class ArrayTestUtils {
    public static <T> void assertHasSize(int sizeExpected, Array<T> array) {
        Assertions.assertEquals(sizeExpected, array.size);
    }

    public static <T> void assertEmpty(Array<T> array) {
        Assertions.assertTrue(array.isEmpty(), "Expected empty array but size=" + array.size);
    }

    public static <T> void assertContainsAll(boolean identity, Array<T> array, T... values) {
        Assertions.assertTrue(ArrayUtils.containsAll(array, identity, values));
    }

    public static <T> void assertContainsAll(Array<T> array, T... values) {
        Assertions.assertTrue(ArrayUtils.containsAll(array, values));
    }

    public static <T> void assertContainsOnly(Array<T> array, T... values) {
        Assertions.assertTrue(ArrayUtils.containsOnly(array, values));
    }

    public static <T> void assertEquals(Array<T> array1, Array<T> array2, boolean identity) {
        Assertions.assertEquals(array1.size, array2.size, "size not equals");
        for (int i = 0; i < array1.size; i++) {
            if (identity)
                Assertions.assertTrue(array1.get(i) == array2.get(i), "fail at index:" + i);
            else
                Assertions.assertEquals(array1.get(i), array2.get(i), "fail at index:" + i);
        }
    }

}
