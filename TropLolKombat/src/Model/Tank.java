package Model;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Tank extends Character{
	public Tank(int px, int py) throws IOException { // Tank position
	x=px;
	y=py;
	img = ImageIO.read(new File("src/Image/Tahm_Kench.png")); // import image
	lifePoints = 5;
	}
	public void attack(Character ch){
		ch.setLifePoints(ch.getLifePoints()-1);
			
	}
	public void bloc(Character ch){
		this.setLifePoints(this.getLifePoints()+1);
	}
	public void speAttack(Character ch, int deg){ //the tank loses 1 LifePoint of substract 2 to the opponent
		//System.out.println("Tank speAttack");
		ch.setLifePoints(ch.getLifePoints()-2);	
		this.setLifePoints(getLifePoints()-1);
	}
	}