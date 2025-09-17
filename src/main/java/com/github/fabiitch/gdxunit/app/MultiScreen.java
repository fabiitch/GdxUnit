package com.github.fabiitch.gdxunit.app;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.utils.Array;

public class MultiScreen implements Screen {
    private final Array<Screen> screens = new Array<>();

    public void addScreen(Screen screen) {
        screens.add(screen);
    }

    public void removeScreen(Screen screen) {
        screens.removeValue(screen, true);
    }

    @Override
    public void show() {
        for (Screen screen : screens) {
            screen.show();
        }
    }

    public void clearScreen() {
        //do nothing base
    }

    @Override
    public void render(float delta) {
        clearScreen();
        for (Screen screen : screens) {
            screen.render(delta);
        }
    }

    @Override
    public void resize(int width, int height) {
        for (Screen screen : screens) {
            screen.resize(width, height);
        }
    }

    @Override
    public void pause() {
        for (Screen screen : screens) {
            screen.pause();
        }
    }

    @Override
    public void resume() {
        for (Screen screen : screens) {
            screen.resume();
        }
    }

    @Override
    public void hide() {
        for (Screen screen : screens) {
            screen.hide();
        }
    }

    @Override
    public void dispose() {
        for (Screen screen : screens) {
            screen.dispose();
        }
    }
}
