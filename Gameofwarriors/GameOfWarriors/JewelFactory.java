
public class JewelFactory extends AbstractFactory{

	@Override
	IEnemy getEnemy(String enemyType, int pos) {

		return null;
	}

	@Override
	IJewel getJewel(String jewelType, int level) {
		if(jewelType== null)
			return null;
		if(jewelType.equalsIgnoreCase("BLUE"))
			return new BlueJewel(level);
		else if(jewelType.equalsIgnoreCase("GREEN"))
			return new GreenJewel();
		else if(jewelType.equalsIgnoreCase("PINK"))
			return new PinkJewel(level);
		
		return null;
	}

}
