package uet.oop.bomberman.GuiX;

import uet.oop.bomberman.Game;

import javax.swing.*;
import java.awt.*;

/**
 * màn hình chứa backgroud và các compronent
 */
public class GamePanel extends JPanel {

	private Game bomberman;
	
	public GamePanel(Frame frame) {
		setLayout(new BorderLayout());
		setPreferredSize(new Dimension(Game.WIDTH * Game.SCALE, Game.HEIGHT * Game.SCALE));

		bomberman = new Game(frame);

		add(bomberman);

		bomberman.setVisible(true); // hiện lên màn hình

		setVisible(true);
		setFocusable(true);
		
	}

	public Game getGame() {
		return bomberman;
	}
	
}
