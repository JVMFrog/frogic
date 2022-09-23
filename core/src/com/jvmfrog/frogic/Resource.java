package com.jvmfrog.frogic;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

import java.util.HashMap;

public class Resource {
    private static final HashMap<String, Texture> textures = new HashMap<>();

    public static Texture getTexture(String path) {
        Texture texture = textures.get(path);
        if(texture == null){
            texture = new Texture(Gdx.files.internal(path));
            textures.put(path, texture);
        }
        return texture;
    }

    public static void dispose() {
        for (Texture texture : textures.values()) texture.dispose();
    }
}