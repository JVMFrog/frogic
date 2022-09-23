package com.jvmfrog.frogic;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputMultiplexer;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.jvmfrog.frogic.ui.MainScreen;

public class Main extends Game {
    public static OrthographicCamera mainCamera;
    //Какое гуи, пока чисто шиза
    public static OrthographicCamera uiCamera;
    public static SpriteBatch batch;

    public static MainScreen mainScreen;

    public static InputMultiplexer INPUT_MULTIPLEXER;

    private CameraController cameraController;

    @Override
    public void create() {
        INPUT_MULTIPLEXER = new InputMultiplexer();
        Gdx.input.setInputProcessor(INPUT_MULTIPLEXER);

        batch = new SpriteBatch();
        mainCamera = new OrthographicCamera();

        mainScreen = new MainScreen();

        cameraController = new CameraController(mainCamera);
        INPUT_MULTIPLEXER.addProcessor(cameraController);

        setScreen(mainScreen);
    }

    @Override
    public void resize(int width, int height) {
        mainCamera.setToOrtho(false, 20, 20f * Gdx.graphics.getHeight() / Gdx.graphics.getWidth());
        super.resize(width, height);
    }

    @Override
    public void render() {
        ScreenUtils.clear(0, 0, 0, 1);
        batch.begin();
        super.render();
        batch.end();
    }
}
