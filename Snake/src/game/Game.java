package game;

import javax.swing.JFrame;

import backend.KeyboardListener;
import data.Direction;
import graphics.GameGraphics;

public class Game {

	public static JFrame window;
	private static GameGraphics graphics;
	
	public static void main(String[] args) {
		graphics = new GameGraphics();
		
		window = new JFrame();
		window.setSize(500, 500);
		window.setVisible(true);
		window.addKeyListener(new KeyboardListener());
		window.add(graphics);
	}
	
}
