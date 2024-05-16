package com.github.fabiitch.gdxunit;

import com.badlogic.gdx.utils.Json;

import java.io.File;
import java.io.FileReader;
import java.net.URL;

public class TestUtils {
    public static File getFileFromRessource(String path) {
        try {
            URL url = ClassLoader.getSystemResource(path);
            return new File(url.toURI());
        } catch (Exception e) {
            throw new RuntimeException("Cant find file " + path, e);
        }
    }

    public static <T> T getJsonFromRessource(Class<T> tClass, String path) {
        Json json = new Json();
        File file = getFileFromRessource(path);
        try {
            return json.fromJson(tClass, new FileReader(file));
        } catch (Exception e) {
            throw new RuntimeException("Cant parse json at " + path, e);
        }
    }
}
