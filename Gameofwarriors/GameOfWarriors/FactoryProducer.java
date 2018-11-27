
public class FactoryProducer {

	public static AbstractFactory getFactory(String objChoice)
	{
		if(objChoice.equalsIgnoreCase("ENEMY"))
			return new EnemyFactory();
		else if(objChoice.equalsIgnoreCase("JEWEL"))
			return new JewelFactory();
		return null;
			
	}
}
