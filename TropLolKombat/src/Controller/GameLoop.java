package Controller;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import Model.Healer;
import Model.Damager;
import Model.Tank;
import View.Window;

public class GameLoop {
	@SuppressWarnings("unused")
	private Window win = new Window();
	private Damager P1;
	private Damager P2;
	public GameLoop(){
		this.loop();
	}
	public void loop(){
		try {
			setP1(new Damager(200,200));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			setP2(new Damager(500,500));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}		
		while (true){
			Event ev = new Event(win.getDetKey().getKey(), win, P1, P2);
			if (P1.getLifePoints()<=0 && P2.getLifePoints()>0){
				System.out.println("You loose");
				System.exit(0);
			}
			if (P2.getLifePoints()<=0 && P1.getLifePoints()>0){
				System.out.println("You win");
				System.exit(0);
			}
			if (P2.getLifePoints()<=0 && P1.getLifePoints()<=0){
				System.out.println("Tie");
				System.exit(0);
			}
			try {
				TimeUnit.MILLISECONDS.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}
	public Damager getP1() {
		return P1;
	}
	public void setP1(Damager p1) {
		P1 = p1;
	}
	public Damager getP2() {
		return P2;
	}
	public void setP2(Damager p2) {
		P2 = p2;
	}
	public Window getwin() {
		return win;
	}
	public void setwin(Window WIN) {
		win = WIN;
	}
	
}