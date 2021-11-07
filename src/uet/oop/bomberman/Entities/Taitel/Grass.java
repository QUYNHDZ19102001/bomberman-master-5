package uet.oop.bomberman.Entities.Taitel;


import uet.oop.bomberman.Entities.Entity;
import uet.oop.bomberman.Graphich.Sprite;

public class Grass extends Tile {

	/**
	 * Grass Cho bất kì đối tượng khác đi qua
	 * @param
	 * @return*/
	public Grass(int x, int y, Sprite sprite) {
		super(x, y, sprite);
	}


	@Override
	public boolean collide(Entity e) {
		return true;
	}
}
