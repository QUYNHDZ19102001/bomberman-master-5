package uet.oop.bomberman.Entities.Charecter.enemy.AiEnemy;

public class AILow extends AI {

	@Override
	public int calculateDirection() {
		int i;
		i = random.nextInt(4);
		return i;
	}

}
