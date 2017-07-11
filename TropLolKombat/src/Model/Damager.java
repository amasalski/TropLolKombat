package Model;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Damager extends Character{
	public Damager(int px, int py) throws IOException { // damager position
	x=px;
	y=py;
	img = ImageIO.read(new File("src/Image/Jinx.png")); // import image
	lifePoints = 3;
	}
	public void attack(Character ch){
		ch.setLifePoints(ch.getLifePoints()-2);
			
	}
	public void bloc(Character ch){
		this.setLifePoints(this.getLifePoints()+1);
	}
	public void speAttack(Character ch , int deg){
		ch.setLifePoints(ch.getLifePoints()-deg);
	}
	}