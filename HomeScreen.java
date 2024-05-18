import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class HomeScreen extends World
{

    /**
     * Constructor for objects of class HomeScreen.
     * 
     */
    public HomeScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        LevelOneButton levelOneButton = new LevelOneButton(); 
        addObject(levelOneButton, 150, 200); 
        
        LevelTwoButton levelTwoButton = new LevelTwoButton(); 
        addObject(levelTwoButton, 300, 200); 
        
        LevelThreeButton levelThreeButton = new LevelThreeButton(); 
        addObject(levelThreeButton, 450, 200); 
        
        InstructionsButton instructionsButton = new InstructionsButton(); 
        addObject(instructionsButton, 300, 300); 
        
        addObject(new Label("BINARY-DECIMAL MAZE GAME", 40), 300, 60); 
    }
}
