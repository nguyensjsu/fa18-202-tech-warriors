import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy1 here.
 * 
 * @author jainsupriya
 * @version (a version number or a date)
 */
public class Enemy2 extends Enemies implements IEnemy
{
    private int turnSpeed = 2;
    private boolean moveRight = false;
    int startPos = 0;
    private int jumpbarWidth = 240;
    public Enemy2(int pos)
    {
        startPos = pos;
    }
    /**
     * Act - do whatever the Enemy1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (!moveRight)
        {
            setImage("enemy2left.png");
            move(-1);
        }
        else
        {
           setImage("enemy2right.png");
            move(1);
        }
        if(this.getX() <= startPos-jumpbarWidth/2)
        {
            move(1);
            moveRight = true;
            setImage("enemy2right.png");
        }
        if(this.getX() >= startPos)
        {
            move(-1);
            moveRight = false;
            setImage("enemy2left.png");
        }

    }  
    @Override
    public void killAlladin() {

    }
    
}
