package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

import java.util.Random;

public class RainParticles {

    public ShapeRenderer shape;
    private float shapePosX,shapePosY;
    Random rand;

    public RainParticles(){
        rand = new Random();
        shape = new ShapeRenderer();
        shape.setColor(new Color(225.0f/255.0f,246.0f/255.0f,255.0f/255.0f,1));

        shapePosX = (float) rand.nextInt(Gdx.graphics.getWidth());
        shapePosY = (float) rand.nextInt(Gdx.graphics.getHeight()) + Gdx.graphics.getHeight() * 2;
    }

    public void generateShape(){
        shape.begin(ShapeRenderer.ShapeType.Filled);
        shape.rect(shapePosX,shapePosY,2f,20f);
        shape.end();
    }

    public void moveRain(){
        shapePosY = shapePosY - 15f;
        if(shapePosY < 0f){
            shapePosY = (float) rand.nextInt(Gdx.graphics.getHeight()) + Gdx.graphics.getHeight();
        }
    }

}
