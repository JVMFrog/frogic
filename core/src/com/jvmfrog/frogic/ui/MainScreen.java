package com.jvmfrog.frogic.ui;

import com.badlogic.gdx.Screen;
import com.jvmfrog.frogic.circuit.Circuit;
import com.jvmfrog.frogic.render.CircuitRenderer;

public class MainScreen implements Screen {
    private CircuitRenderer circuitRenderer;
    Circuit test = new Circuit();

    public MainScreen(){
        circuitRenderer = new CircuitRenderer();
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        circuitRenderer.render(test);
    }

    @Override
    public void resize(int width, int height) {
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
