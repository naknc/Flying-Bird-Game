package com.n.ucankus;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class UcanKus extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("back.png");
	}

	@Override
	public void render () {
		batch.begin();
		batch.draw(img,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());

		batch.end();
	}
	
	@Override
	public void dispose () {

	}
}
