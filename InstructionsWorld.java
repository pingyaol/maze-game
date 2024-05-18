import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class InstructionsWorld extends World
{

    /**
     * Constructor for objects of class InstructionsWorld.
     * 
     */
    public InstructionsWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(new Label("WELCOME", 50), 300, 60); 
        
        addObject(new LevelOneButton(), 150, 310);  
        
        LevelTwoButton levelTwoButton = new LevelTwoButton(); 
        addObject(levelTwoButton, 300, 310); 
        
        LevelThreeButton levelThreeButton = new LevelThreeButton(); 
        addObject(levelThreeButton, 450, 310); 
        
        Label instructionsLabel = new Label("In order to finish the game, \n navigate around the maze and collect \n all the right binary and decimal conversions. \n If you collect an incorrect conversion, \n you will lose a life. \n Have fun playing and learning! ", 25); 
        addObject(instructionsLabel, 300, 160); 
        instructionsLabel.setLineColor(Color.WHITE); 
    }
}
