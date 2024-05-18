import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SideWallV here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SideWallV extends wall
{
    /**
     * Act - do whatever the SideWallV wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public SideWallV()
    { 
        getImage().scale(getImage().getWidth() /2 , getImage().getHeight() * 38);
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
