/**
 * Lists the action events
 * 
 * @priyanka.singhal 
 * @v1.0
 */
enum ActionEnum  
{
   JUMP("jump"), FALL("fall"), HITENEMY("hitenemy"), COLLECTCOINS("collectcoins"),  
   GAMEOVER("gameover"), WON("won");
   
   private String action; 
  
    // getter method 
    public String getAction() 
    { 
        return this.action; 
    } 
    
   // enum constructor 
    private ActionEnum(String action) 
    { 
        this.action = action; 
    } 
}
