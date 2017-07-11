package View;

import javax.swing.JFrame;

import Controller.keylistener;

@SuppressWarnings("serial")
public class Window extends JFrame {


private keylistener detKey = new keylistener();
private WinPan wp= new WinPan();
public Window() { 
    this.setTitle("TropLolKombat");
    this.setSize(1080, 500);
    this.setResizable(false); 
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);
    this.addKeyListener(detKey);
    this.setFocusable(true);
    this.setVisible(true);
    this.add(wp);
    wp.repaint();
}

public keylistener getDetKey(){
	return detKey;
}

public WinPan getWP(){
	return wp;
}

}