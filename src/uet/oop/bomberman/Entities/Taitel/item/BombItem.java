package uet.oop.bomberman.Entities.Taitel.item;

import uet.oop.bomberman.Game;
import uet.oop.bomberman.Entities.Entity;
import uet.oop.bomberman.Entities.Charecter.Bomber;
import uet.oop.bomberman.Graphich.Sprite;

public class BombItem extends Item {

	public BombItem(int x, int y, Sprite sprite) {
		super(x, y, sprite);
	}

	@Override
	public boolean collide(Entity e) {
		// TODO: xử lý Bomber ăn Item
		if (e instanceof Bomber)
		{
			if (!e.isRemoved())
			{
				Game.addBombRate(1);
				remove();
			}
		}
		return false;
	}
	


}
