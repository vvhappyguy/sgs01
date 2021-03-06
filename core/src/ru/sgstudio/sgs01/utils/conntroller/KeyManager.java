package ru.sgstudio.sgs01.utils.conntroller;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;

/**
 * ���������� �������
 * @author Yarik
 * @version 1.0
 */

public class KeyManager {
	/** @return boolean */
	public boolean getPressedLeft(){
		if(Gdx.input.isKeyPressed(Keys.A) || Gdx.input.isKeyPressed(Keys.LEFT)) return true;
		else return false;
	}
	/** @return boolean */
	public boolean getPressedRight(){
		if(Gdx.input.isKeyPressed(Keys.D) || Gdx.input.isKeyPressed(Keys.RIGHT)) return true;
		else return false;
	}
	/** @return boolean */
	public boolean getPressedUp(){
		if(Gdx.input.isKeyPressed(Keys.W) || Gdx.input.isKeyPressed(Keys.UP)) return true;
		else return false;
	}
	/** @return boolean */
	public boolean getPressedDown(){
		if(Gdx.input.isKeyPressed(Keys.S) || Gdx.input.isKeyPressed(Keys.DOWN)) return true;
		else return false;
	}
	/** @return boolean */
	public boolean getPressedEscape(){
		if(Gdx.input.isKeyPressed(Keys.ESCAPE)) return true;
		else return false;
	}
	/** @return boolean */
	public boolean getPressedI(){
		if(Gdx.input.isKeyPressed(Keys.I)) return true;
		else return false;
	}
	/** @return boolean */
	public boolean getPressedSpace(){
		if(Gdx.input.isKeyPressed(Keys.SPACE)) return true;
		else return false;
	}
	/** @return boolean */
	public boolean getPressedE() {
		if(Gdx.input.isKeyPressed(Keys.E)) return true;
		else return false;
	}
	/** @return boolean */
	public boolean getPressedEnter() {
		if(Gdx.input.isKeyPressed(Keys.ENTER)) return true;
		else return false;
	}
	/** @return boolean */
	public boolean getPressedZ() {
		if(Gdx.input.isKeyPressed(Keys.Z)) return true;
		else return false;
	}
	/** @return boolean */
	public boolean getPressedX() {
		if(Gdx.input.isKeyPressed(Keys.X)) return true;
		else return false;
	}
}
