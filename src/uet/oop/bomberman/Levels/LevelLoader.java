package uet.oop.bomberman.Levels;

import uet.oop.bomberman.Board;
import uet.oop.bomberman.Excepitions.LoadLevelException;

/**
 *  lưu trữ màn chơi
 * @
 *
 */
public abstract class LevelLoader {

	protected int _width = 20, _height = 20;
	protected int _level;
	protected Board _board;

	public LevelLoader(Board board, int level) throws LoadLevelException {
		_board = board;
		loadLevel(level);
	}

	public abstract void loadLevel(int level) throws LoadLevelException;

	public abstract void createEntities();

	public int getWidth() {
		return _width;
	}

	public int getHeight() {
		return _height;
	}

	public int getLevel() {
		return _level;
	}

}
