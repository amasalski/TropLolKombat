package Model;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Character {

	protected int x;
	protected int y;
	protected int lifePoints;
	protected Image img;
	
	public Character() 
	{
	
	}
	
	public Image getImage(){ 
		return img;
	}

	public void setImage(String path){
		try {
			img = ImageIO.read(new File(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}
	public void attack(Character ch){ //all methods that will change with the inheritance polymorphism
		
	}
	public void bloc(){
		
	}
	public void speAttack(Character ch, int deg){
	 
	}
	public int getLifePoints() {
		return lifePoints;
	}
	public void setLifePoints(int lifePoints) {
		this.lifePoints = lifePoints;
	}
}