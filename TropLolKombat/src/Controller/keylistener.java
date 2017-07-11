package Controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class keylistener implements KeyListener { 
	
	private int key;
	
	public keylistener() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		key = arg0.getKeyCode(); 
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		key=0;
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		
	}
	public int getKey(){
		return key;
	}

}