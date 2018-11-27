
public class EnemyFactory extends AbstractFactory {

	@Override
	IEnemy getEnemy(String enemyType) {
		if(enemyType== null)
			return null;
		if(enemyType.equalsIgnoreCase("ENEMY1"))
			return new Enemy1();
		else if(enemyType.equalsIgnoreCase("ENEMY2"))
			return new Enemy2();
		return null;
		
		
	}

	@Override
	IJewel getJewel(String jewelType) {
		return null;
	}
	

}
