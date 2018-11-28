
public class JewelFactory extends AbstractFactory{

	@Override
	IEnemy getEnemy(String enemyType, int pos) {

		return null;
	}

	@Override
	IJewel getJewel(String jewelType) {
		if(jewelType== null)
			return null;
		if(jewelType.equalsIgnoreCase("BLUE"))
			return new BlueJewel();
		else if(jewelType.equalsIgnoreCase("GREEN"))
			return new GreenJewel();
		else if(jewelType.equalsIgnoreCase("PINK"))
			return new PinkJewel();
		
		return null;
	}

}
