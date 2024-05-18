import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SmallWallV here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SmallWallV extends wall
{
    /**
     * Act - do whatever the SmallWallV wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public SmallWallV()
    {
         getImage().scale(getImage().getWidth() /2 , getImage().getHeight() * 6);
        }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
