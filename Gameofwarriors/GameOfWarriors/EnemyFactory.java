
public class EnemyFactory extends AbstractFactory {

	@Override
	IEnemy getEnemy(String enemyType , int pos) {
		if(enemyType== null)
			return null;
		if(enemyType.equalsIgnoreCase("ENEMY1"))
			return new Enemy1(pos);
		else if(enemyType.equalsIgnoreCase("ENEMY2"))
			return new Enemy2(pos);
		return null;
		
		
	}

	@Override
	IJewel getJewel(String jewelType) {
		return null;
	}
	

}
