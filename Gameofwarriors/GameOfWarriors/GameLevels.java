import greenfoot.*; 
import java.awt.Color;

public class GameLevels extends Actor implements IMenuInvoker
{
    private String level;
    private IMenuCommand cmd;
    
    /**
     * Constructor
     */
    public GameLevels(String level)
    {
        this.level = level;
        imageLabel();
    }
    
    private void imageLabel()
    {
        GreenfootImage bgImage = new GreenfootImage(getImage());
        GreenfootImage text = new GreenfootImage(level, 150, greenfoot.Color.BLACK, new greenfoot.Color(0,0,0,0));
        int x = (int)(bgImage.getWidth() -text.getWidth() ) /2;
        int y = (int)(bgImage.getHeight() -text.getHeight() ) /2;
        if (text.getWidth() > bgImage.getWidth() - 20) {
            bgImage.scale(text.getWidth() + 20, bgImage.getHeight());
        }
        bgImage.drawImage(text, x, y);
        setImage(bgImage);
    }

    public void act() 
    {
       if(Greenfoot.mouseClicked(this)){
           invoke();
        }
     
    }
    
    public void setCommand(IMenuCommand cmd) {
        this.cmd = cmd;
    }
    
    public void invoke() {
        cmd.execute();
    }

    public String getOption()
    {
        return level;
    }
    

}