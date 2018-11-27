import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy1 here.
 * 
 * @author jainsupriya
 * @version (a version number or a date)
 */
public class Enemy1 extends Enemies implements IEnemy
{
    private int turnSpeed = 2;
    private boolean moveRight = false;
    public Enemy1()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/15;
        int myNewWidth = (int)myImage.getWidth()/15;
        myImage.scale(myNewWidth,myNewHeight);
    }
      
    /**
     * Act - do whatever the Enemy1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (!moveRight)
        {
            setImage("enemyLeft1.png");
            move(-1);
        }
        else
        {
            setImage("enemyRight.png");
            move(1);
        }
        if(this.getX() <= 240)
        {
            move(1);
            moveRight = true;
            setImage("enemyRight.png");
        }
        if(this.getX() >= 365)
        {
            move(-1);
            moveRight = false;
            setImage("enemyLeft1.png");
        }

    }    
    
    @Override
    public void killAlladin() {
    	// TODO Auto-generated method stub
    	
    }
}
