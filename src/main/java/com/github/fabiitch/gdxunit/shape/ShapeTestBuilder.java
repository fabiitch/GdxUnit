package com.github.fabiitch.gdxunit.shape;

import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import lombok.experimental.UtilityClass;

@UtilityClass
public class ShapeTestBuilder {

    public static Circle c(float radius) {
        return new Circle(0, 0, radius);
    }

    public static Circle c(float x, float y, float radius) {
        return new Circle(x, y, radius);
    }

    public static Rectangle r(float x, float y, float width, float height) {
        return new Rectangle(x, y, width, height);
    }

    public static Rectangle rCenter(float x, float y, float width, float height) {
        return new Rectangle(x - width / 2, y - height / 2, width, height);
    }


    public static Rectangle r(Vector2 pos, float width, float height) {
        return new Rectangle(pos.x, pos.y, width, height);
    }

    public static Rectangle rCenter(Vector2 center, float width, float height) {
        return rCenter(center.x, center.y, width, height);
    }

    public static Rectangle r(float width, float height) {
        return r(0, 0, width, height);
    }

    public static Rectangle r() {
        return r(0, 0, 0, 0);
    }

    public static Vector2 v2() {
        return new Vector2();
    }

    public static Vector2 v2(float a, float b) {
        return new Vector2(a, b);
    }
}
