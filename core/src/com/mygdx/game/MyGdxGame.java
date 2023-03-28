package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class MyGdxGame extends ApplicationAdapter {

	RainParticles[] rains;

	
	@Override
	public void create () {

			rains = new RainParticles[500];
			Sound sound = Gdx.audio.newSound(Gdx.files.internal("rainsound.mp3"));
			sound.play();

			for(int i = 0 ; i < rains.length ; i++){
				rains[i] = new RainParticles();
			}



	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(135.0f/ 255.0f, 206.0f / 255.0f, 235.0f / 255.0f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);


		for(int i = 0 ; i < 500 ; i++){
			rains[i].generateShape();
			rains[i].moveRain();
		}

	}
	
	@Override
	public void dispose () {

	}
}
