package com.github.fabiitch.gdxunit;

import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Rectangle;
import org.junit.jupiter.api.Assertions;

public class ShapeTestUtils {

    private static final float TOLERANCE = MathUtils.FLOAT_ROUNDING_ERROR;

    public static void assertEquals(Rectangle r1, Rectangle r2, float tolerance, String msgError) {
        Assertions.assertEquals(r1.x, r2.x, tolerance, msgError == null ? "x not equals" : msgError + ": x not equals");
        Assertions.assertEquals(r1.y, r2.y, tolerance, msgError == null ? "y not equals" : msgError + ": y not equals");
        assertSizeEquals(r1, r2, tolerance, msgError);
    }

    public static void assertEquals(Rectangle r1, Rectangle r2) {
        assertEquals(r1, r2, TOLERANCE, null);
    }

    public static void assertSizeEquals(Rectangle r1, Rectangle r2, float tolerance, String msgError) {
        Assertions.assertEquals(r1.width, r2.height, tolerance, msgError == null ? "width not equals" : msgError + ": width not equals");
        Assertions.assertEquals(r1.width, r2.width, tolerance, msgError == null ? "height not equals" : msgError + ": height not equals");
    }

    public static void assertSizeEquals(Rectangle r1, Rectangle r2) {
        assertSizeEquals(r1, r2, TOLERANCE, null);
    }
}
