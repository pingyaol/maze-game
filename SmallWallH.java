import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SmallWallH here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SmallWallH extends wall
{
    /**
     * Act - do whatever the SmallWallH wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public SmallWallH()
    {
       getImage().scale(getImage().getWidth() *2 , getImage().getHeight());
    }
   
    public void act() 
    {
        // Add your action code here.
    }    
}
