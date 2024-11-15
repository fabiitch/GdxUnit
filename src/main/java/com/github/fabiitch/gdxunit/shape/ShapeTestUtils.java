package com.github.fabiitch.gdxunit.shape;

import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Polygon;
import com.badlogic.gdx.math.Rectangle;
import com.github.fabiitch.gdxunit.vectors.VTestUtils;
import lombok.experimental.UtilityClass;
import org.junit.jupiter.api.Assertions;
@UtilityClass
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

    public static void assertEquals(Polygon p1, Polygon p2) {
        assertEquals(p1, p2, TOLERANCE, null);
    }

    public static void assertEquals(Polygon p1, Polygon p2, float tolerance) {
        assertEquals(p1, p2, tolerance, null);
    }

    public static void assertEquals(Polygon p1, Polygon p2, float tolerance, String msgError) {
        float[] p1Vertices = p1.getTransformedVertices();
        float[] p2Vertices = p2.getTransformedVertices();
        Assertions.assertEquals(p1Vertices.length, p2Vertices.length, msgError == null ? msgError + " Not same vertex count" : msgError + ": Not same vertex count");

        int i = 0;
        while (i <= p1Vertices.length / 2) {
            float x1 = p1Vertices[i];
            float y1 = p1Vertices[i];
            float x2 = p2Vertices[i];
            float y2 = p2Vertices[i];
            VTestUtils.assertEquals(x1, y1, x2, y2, tolerance, msgError);
            i += 2;
        }
    }
}
