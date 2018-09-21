package graphics;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JComponent;

import snake.Square;

public class GameGraphics extends JComponent{

	public void paint(Graphics g) {
		paintSquares(g);
	}
	
	public static void paintSquares(Graphics g) {
		Square[] squares = getSquares();
		
		for(Square square : squares) {
			
		}
	}
}
