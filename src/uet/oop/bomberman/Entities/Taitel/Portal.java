package uet.oop.bomberman.Entities.Taitel;

import uet.oop.bomberman.Board;
import uet.oop.bomberman.Entities.Entity;
import uet.oop.bomberman.Entities.Charecter.Bomber;
import uet.oop.bomberman.Graphich.Sprite;

public class Portal extends Tile {
	private Board _board;
	public Portal(int x, int y, Sprite sprite,Board board) {
		super(x, y, sprite);
		_board = board;
	}
	
	@Override
	public boolean collide(Entity e) {
		// TODO: xử lý khi Bomber đi vào

		if (e instanceof Bomber) // instanceof xem xem e co  phải là instance của một class Bomb
		{
			if (_board.detectNoEnemies()==false) return false;
			if (_board.detectNoEnemies() && e.getXTile() == getX() && e.getYTile() == getY())
			{
				_board.nextLevel();

			}
			return true;
		}
		return false;
	}

}
