package com.github.fabiitch.gdxunit.app;

import com.badlogic.gdx.ApplicationListener;
import lombok.Getter;

import java.util.Objects;

@Getter
public abstract class ApplicationListenerWrapper implements ApplicationListener {

    private final ApplicationListener wrappedListener;

    protected ApplicationListenerWrapper(ApplicationListener wrappedListener) {
        this.wrappedListener = Objects.requireNonNull(wrappedListener, "wrappedListener must not be null");
    }

    @Override
    public void create() {
        wrappedListener.create();
    }

    @Override
    public void resize(int width, int height) {
        wrappedListener.resize(width, height);
    }

    @Override
    public void render() {
        wrappedListener.render();
    }

    @Override
    public void pause() {
        wrappedListener.pause();
    }

    @Override
    public void resume() {
        wrappedListener.resume();
    }

    @Override
    public void dispose() {
        wrappedListener.dispose();
    }

    public ApplicationListener getWrappedListener() {
        return wrappedListener;
    }
}
