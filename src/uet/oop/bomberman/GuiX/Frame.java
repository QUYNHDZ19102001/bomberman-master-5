package uet.oop.bomberman.GuiX;

import uet.oop.bomberman.Game;

import javax.swing.*;
import java.awt.*;

/**
 * chứa toàn bộ các   component lên màn hình
 */
public class Frame extends JFrame {
	
	public GamePanel _gamepane;
	private JPanel _containerpane;
	private InfoPanel _infopanel;
	
	private Game boberman;

	public Frame() {

		_containerpane = new JPanel(new BorderLayout());
		_gamepane = new GamePanel(this);
		_infopanel = new InfoPanel(_gamepane.getGame());

		_containerpane.add(_infopanel, BorderLayout.PAGE_START);
		_containerpane.add(_gamepane, BorderLayout.PAGE_END);

		boberman = _gamepane.getGame();

		add(_containerpane);

		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();

		setLocationRelativeTo(null);
		setVisible(true);

		boberman.start();
	}

	public void setTime(int time) {
		_infopanel.setTime(time);
	}

	public void setPoints(int points) {
		_infopanel.setPoints(points);
	}

}
