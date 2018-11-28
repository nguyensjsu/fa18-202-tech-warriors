/**
 * Abstract Factory Pattern
 * factory of enemies and jewels
 * 
 * @jainsupriya
 * @V1.0
 */
public abstract class AbstractFactory {
	   abstract IEnemy getEnemy(String enemyType, int pos);
	   abstract IJewel getJewel(String jewelType, int level) ;
}
