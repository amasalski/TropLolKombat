package Controller;

import java.util.Random;

import Model.Damager;
import View.Window;

public class Event {
	private int Key;
	private Window win;
	private Damager p1;
	private Damager p2;

	private boolean p2DidSpe=false;
	private boolean p1DidSpe=false;

	/*
	 * A == 65
	 * Z == 90
	 * E == 69
	 */
	public Event(int keyNum, Window wind, Damager p, Damager pp) { 
		Key = keyNum;
		win = wind;
		p1 = p;
		p2 = pp;
			if (Key==65){//depending on the keystroke, it chooses the action
			this.attackAction();
		}
		if (Key==90){
			this.blocAction();
		}
		if (Key==69){
			this.spePowAction();
		}
		
		
	}

	private void spePowAction() {
		// TODO Auto-generated method stub
		p1.speAttack(p2, 0);
		Random rand = new Random();
		int n = rand.nextInt(3)+1;
		if (n == 1){
			p2.attack(p1);
			System.out.println("Il vous attaque !");

		}
		if (n == 2){
			p2.bloc(p1);
			System.out.println("Il Block votre attaque !");

		}
		if (n == 3){
			p2.speAttack(p1,0);
			System.out.println("Il prépare sa super attaque !");

		}
		System.out.println("Vous avez utilisé votre speAttack");
		System.out.println("Vos points de vie: ");
		System.out.println(p1.getLifePoints());
		System.out.println("Les points de vie adverse: ");
		System.out.println(p2.getLifePoints());
	}

	private void blocAction() {
		// TODO Auto-generated method stub
		p1.bloc(p2);
		Random rand = new Random();
		int n = rand.nextInt(3)+1;
		if (n == 1){
			p2.attack(p1);
			System.out.println("Il vous attaque !");

		}
		if (n == 2){
			p2.bloc(p1);
			System.out.println("Il Block votre attaque !");

		}
		if (n == 3){
			p2.speAttack(p1,0);
			System.out.println("Il prépare sa super attaque !");

		}
		System.out.println("Vous avez Bloqué");
		System.out.println("Vos points de vie: ");
		System.out.println(p1.getLifePoints());
		System.out.println("Les points de vie adverse: ");
		System.out.println(p2.getLifePoints());
		
	}

	private void attackAction() {
		// TODO Auto-generated method stub
		p1.attack(p2);
		Random rand = new Random();
		int n = rand.nextInt(3)+1;
		if (n == 1){
			p2.attack(p1);
			System.out.println("Il vous attaque !");

		}
		if (n == 2){
			p2.bloc(p1);
			System.out.println("Il Block votre attaque !");

		}
		if (n == 3){
			p2.speAttack(p1,0);
			System.out.println("Il prépare sa super attaque !");

		}
		System.out.println("Vous avez attaqué");
		System.out.println("Vos points de vie: ");
		System.out.println(p1.getLifePoints());
		System.out.println("Les points de vie adverse: ");
		System.out.println(p2.getLifePoints());
		
	}
}
