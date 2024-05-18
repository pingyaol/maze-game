import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class LevelOne extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public LevelOne()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(850,700, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        
        correct correct = new correct();
        addObject(correct,Greenfoot.getRandomNumber(450) + 90,Greenfoot.getRandomNumber(600) + 20); 
        correct correct2 = new correct();
        addObject(correct2,Greenfoot.getRandomNumber(450) + 90,Greenfoot.getRandomNumber(600) + 20); 
        correct correct3 = new correct();
        addObject(correct3,Greenfoot.getRandomNumber(450) + 90,Greenfoot.getRandomNumber(600) + 20); 
        correct correct4= new correct();
        addObject(correct4,Greenfoot.getRandomNumber(450) + 90,Greenfoot.getRandomNumber(600) + 20); 
        
        wrong wrong = new wrong();
        addObject(wrong,Greenfoot.getRandomNumber(450) + 90,Greenfoot.getRandomNumber(600) + 20);
        wrong wrong2 = new wrong();
        addObject(wrong2,Greenfoot.getRandomNumber(450) + 90,Greenfoot.getRandomNumber(600) + 20);
        wrong wrong3 = new wrong();
        addObject(wrong3,Greenfoot.getRandomNumber(450) + 90,Greenfoot.getRandomNumber(600) + 20);
        wrong wrong4= new wrong();
        addObject(wrong4,Greenfoot.getRandomNumber(450) + 90,Greenfoot.getRandomNumber(600) + 20);
        
        // horizontal small walls
        SmallWallH smallWallH1 = new SmallWallH();
        addObject(smallWallH1, 1, 1);
        smallWallH1.setLocation(800, 400); // rightmost corner, slightly bottom
        
        SmallWallH smallWallH2 = new SmallWallH();
        addObject(smallWallH2, 1, 1);
        smallWallH2.setLocation(740, 400); // right corner, slightly bottom, attached to smallWallH1
        
        // vertical small walls
        SmallWallV smallWallV1 = new SmallWallV();
        addObject(smallWallV1, 1, 1);
        smallWallV1.setLocation(130, 300); // top left, attached to genericWallH1
        
        SmallWallV smallWallV2 = new SmallWallV();
        addObject(smallWallV2, 1, 1);
        smallWallV2.setLocation(130, 390); // middle left, attached to smallWallV1
        
        SmallWallV smallWallV3 = new SmallWallV();
        addObject(smallWallV3, 1, 1);
        smallWallV3.setLocation(130, 480); // middle left, attached to smallWallV2
        
        SmallWallV smallWallV4 = new SmallWallV();
        addObject(smallWallV4, 1, 1);
        smallWallV4.setLocation(130, 550); // bottom left, attached to smallWallV3
        
        SmallWallV smallWallV5 = new SmallWallV();
        addObject(smallWallV5, 1, 1);
        smallWallV5.setLocation(717, 450); // bottom left, attached to smallWallH2
        
        SmallWallV smallWallV6 = new SmallWallV();
        addObject(smallWallV6, 1, 1);
        smallWallV6.setLocation(717, 540); // bottom left, attached to smallWallV5
        
        SmallWallV smallWallV7 = new SmallWallV();
        addObject(smallWallV7, 1, 1);
        smallWallV7.setLocation(417, 630); // bottom left, attached to sideWallH1
        
        SmallWallV smallWallV8 = new SmallWallV();
        addObject(smallWallV8, 1, 1);
        smallWallV8.setLocation(417, 540); // bottom left, attached to smallWall7
        
        SmallWallV smallWallV9 = new SmallWallV();
        addObject(smallWallV9, 1, 1);
        smallWallV9.setLocation(417, 460); // bottom left, attached to smallWall8
        
        SmallWallV smallWallV10 = new SmallWallV();
        addObject(smallWallV10, 1, 1);
        smallWallV10.setLocation(388, 140); // bottom left, attached to genericWallH6
        
        SmallWallV smallWallV11 = new SmallWallV();
        addObject(smallWallV11, 1, 1);
        smallWallV11.setLocation(520, 460); // top right, attached to sideWallH2
        
        SmallWallV smallWallV12 = new SmallWallV();
        addObject(smallWallV12, 1, 1);
        smallWallV11.setLocation(580, 220); // middle right, attached to sideWallH2
        
        SmallWallV smallWallV13 = new SmallWallV();
        addObject(smallWallV13, 1, 1);
        smallWallV13.setLocation(590, 630); // bottom right, attached to sideWallH1
        
        SmallWallV smallWallV14 = new SmallWallV();
        addObject(smallWallV14, 1, 1);
        smallWallV14.setLocation(590, 540); // bottom right, attached to smallWallV13
        
        // horizontal side walls
        SideWallH sideWallH1 = new SideWallH();
        addObject(sideWallH1, 1, 1);
        sideWallH1.setLocation(425, 680); // bottommost of screen
        
        SideWallH sideWallH2 = new SideWallH();
        addObject(sideWallH2, 1, 1);
        sideWallH2.setLocation(800, 180); // top right of screen
        
        // vertical side walls
        SideWallV sideWallV1= new SideWallV();
        addObject(sideWallV1, 1, 1);
        sideWallV1.setLocation(10, 400); // leftmost of screen
        
        SideWallV sideWallV2= new SideWallV();
        addObject(sideWallV2, 1, 1);
        sideWallV2.setLocation(265, 340); // left-middle of screen
        
        
        // horizontal generic walls
        GenericWallH genericWallH1 = new GenericWallH();
        addObject(genericWallH1, 1, 1);
        genericWallH1.setLocation(78, 150); // top left right under castle
        
        GenericWallH genericWallH2 = new GenericWallH();
        addObject(genericWallH2, 1, 1);
        genericWallH2.setLocation(78, 250); // top left under genericWallH1
        
        GenericWallH genericWallH3 = new GenericWallH();
        addObject(genericWallH3, 1, 1);
        genericWallH3.setLocation(198, 150); // top left, attached to genericWallH1
        
        GenericWallH genericWallH4 = new GenericWallH();
        addObject(genericWallH4, 1, 1);
        genericWallH4.setLocation(330, 300); // top middle, attached to sideWallV2
        
        GenericWallH genericWallH5 = new GenericWallH();
        addObject(genericWallH5, 1, 1);
        genericWallH5.setLocation(390, 300); // top middle, attached to genericWallH4
        
        GenericWallH genericWallH6 = new GenericWallH();
        addObject(genericWallH6, 1, 1);
        genericWallH6.setLocation(470, 410); // bottom middle-left, attached to smallWallV8
        
        
        Hero hero = new Hero();
        addObject(hero,541,497);
        
        hero.setLocation(800,650);
}
}
