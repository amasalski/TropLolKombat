package Model;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Healer extends Character{
	public Healer(int px, int py) throws IOException { // Healer position
	x=px;
	y=py;
	img = ImageIO.read(new File("src/Image/Healer.png")); // import image
	lifePoints = 4;
	}
	public void attack(Character ch){
		ch.setLifePoints(ch.getLifePoints()-1);
			
	}
	public void bloc(Character ch){
		this.setLifePoints(this.getLifePoints()+1);
	}
	public void speAttack(Character ch, int deg){
		//System.out.println("Healer speAttack"); // add 2 lifepoints when performed
		this.lifePoints+=2;
	}
}