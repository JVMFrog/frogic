package com.jvmfrog.frogic.render;

import com.badlogic.gdx.graphics.Texture;
import com.jvmfrog.frogic.Resource;
import com.jvmfrog.frogic.circuit.Circuit;

import static com.jvmfrog.frogic.Main.batch;
import static com.jvmfrog.frogic.Main.mainCamera;

public class CircuitRenderer {
    Texture part = Resource.getTexture("part.png");

    public void render(Circuit circuit){
        batch.setProjectionMatrix(mainCamera.combined);
        for(int x = 0; x < circuit.width; x++){
            for (int y = 0; y < circuit.height; y++) {
                batch.draw(part, x, y, 1, 1);
            }
        }
    }
}
