import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy1 here.
 * 
 * @author jainsupriya
 * @version (a version number or a date)
 */
public class Enemy1 extends Enemies implements IEnemy
{

    private boolean moveRight = false;
    private int jumpbarWidth = 260;
    int startPos =0;
   
    public Enemy1(int pos)
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
            setImage("enemyLeft1.png");
            move(-1);
        }
        else
        {
            setImage("enemyRight.png");
            move(1);
        }
        if(this.getX() <= startPos-jumpbarWidth/2)
        {
            move(1);
            moveRight = true;
            setImage("enemyRight.png");
        }
        if(this.getX() >= startPos)
        {
            move(-1);
            moveRight = false;
            setImage("enemyLeft1.png");
        }

        //control multiple actors w/o reliance on coordinates
        //includes random turning behavior
        /*Actor actor = getOneIntersectingObject(JumpBar.class);
        int flip = Greenfoot.getRandomNumber (100);
        if(actor != null)
        {
            if (!moveRight) {
               if(flip < 98)
                  setLeft(-1);
               else{
                  setRight(1);
                  moveRight = true;
               }
            }
            else {
               if(flip < 98)
                  setRight(1);
               else{
                  setLeft(-1);
                  moveRight = false;    
               }
            }   
        }
        else
        {
           if(!moveRight){
               moveRight = true;
               setRight(1);
           }
           else {
              moveRight = false;
              setLeft(-1);
           }
        } */

    }

    public void setLeft(int x) {
       setImage("enemyLeft1.png");
       move(x);       
    }

    public void setRight(int x) {
       setImage("enemyRight.png");
       move(x);       
    }    
    
    @Override
    public void killAlladin() {	
    }
}
