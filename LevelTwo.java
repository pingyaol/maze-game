import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class LevelTwo extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public LevelTwo()
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
        addObject(correct,Greenfoot.getRandomNumber(450) + 90,Greenfoot.getRandomNumber(350) + 20); 
        correct correct2 = new correct();
        addObject(correct2,Greenfoot.getRandomNumber(450) + 90,Greenfoot.getRandomNumber(350) + 20); 
        correct correct3 = new correct();
        addObject(correct3,Greenfoot.getRandomNumber(450) + 90,Greenfoot.getRandomNumber(350) + 20); 
        correct correct4= new correct();
        addObject(correct4,Greenfoot.getRandomNumber(450) + 90,Greenfoot.getRandomNumber(350) + 20); 
        
        wrong wrong = new wrong();
        addObject(wrong,Greenfoot.getRandomNumber(450) + 90,Greenfoot.getRandomNumber(350) + 20);
        wrong wrong2 = new wrong();
        addObject(wrong2,Greenfoot.getRandomNumber(450) + 90,Greenfoot.getRandomNumber(350) + 20);
        wrong wrong3 = new wrong();
        addObject(wrong3,Greenfoot.getRandomNumber(450) + 90,Greenfoot.getRandomNumber(350) + 20);
        wrong wrong4= new wrong();
        addObject(wrong4,Greenfoot.getRandomNumber(450) + 90,Greenfoot.getRandomNumber(350) + 20);
        
        // small horizontal walls
        SmallWallH smallWallH1 = new SmallWallH();
        addObject(smallWallH1, 1, 1);
        smallWallH1.setLocation(207, 140); // top left, attached to smallWallV5
        
        
        // vertical side walls
        SideWallV sideWallV1 = new SideWallV();
        addObject(sideWallV1, 1, 1);
        sideWallV1.setLocation(750, 285); // rightmost corner
        
        SideWallV sideWallV2 = new SideWallV();
        addObject(sideWallV2, 1, 1);
        sideWallV2.setLocation(650, 350); // directly left of sideWallV1
        
        SideWallV sideWallV3 = new SideWallV();
        addObject(sideWallV3, 1, 1);
        sideWallV3.setLocation(420, 53); // top center, attached to genericWallH2
        
        SideWallV sideWallV4 = new SideWallV();
        addObject(sideWallV4, 1, 1);
        sideWallV4.setLocation(90, 600); // leftmost corner
         
        
        // generic horizontal walls
        GenericWallH genericWallH1 = new GenericWallH();
        addObject(genericWallH1, 1, 1);
        genericWallH1.setLocation(590, 72); // top right, attached to sideWallV2
        
        GenericWallH genericWallH2 = new GenericWallH();
        addObject(genericWallH2, 1, 1);
        genericWallH2.setLocation(478, 330); // middle right, attached to smallWallV3
        
        GenericWallH genericWallH4 = new GenericWallH();
        addObject(genericWallH4, 1, 1);
        genericWallH4.setLocation(170, 220); // top left, attached to genericWallH3
        
        GenericWallH genericWallH5 = new GenericWallH();
        addObject(genericWallH5, 1, 1);
        genericWallH5.setLocation(260, 438); // middle left, attached to smallWallV10
        
        GenericWallH genericWallH6 = new GenericWallH();
        addObject(genericWallH6, 1, 1);
        genericWallH6.setLocation(487, 522); // attached to smallWallV16
        
        GenericWallH genericWallH7 = new GenericWallH();
        addObject(genericWallH7, 1, 1);
        genericWallH7.setLocation(370, 522); // attached to genericWallH6
        
        GenericWallH genericWallH8 = new GenericWallH();
        addObject(genericWallH8, 1, 1);
        genericWallH8.setLocation(370, 620); // bottom middle, attached to smallWallV17
        
        GenericWallH genericWallH9 = new GenericWallH();
        addObject(genericWallH9, 1, 1);
        genericWallH9.setLocation(478, 420); // center
        
        // small vertical walls
        SmallWallV smallWallV1 = new SmallWallV();
        addObject(smallWallV1, 1, 1);
        smallWallV1.setLocation(530, 110); // top right, attached to genericWallH1
        
        SmallWallV smallWallV2 = new SmallWallV();
        addObject(smallWallV2, 1, 1);
        smallWallV2.setLocation(530, 200); // top right, attached to smallWallV1
        
        SmallWallV smallWallV3 = new SmallWallV();
        addObject(smallWallV3, 1, 1);
        smallWallV3.setLocation(530, 280); // middle right, attached to smallWallV2
        
        SmallWallV smallWallV4 = new SmallWallV();
        addObject(smallWallV4, 1, 1);
        smallWallV4.setLocation(750, 590); // bottom right, attached to sideWallV1
        
        SmallWallV smallWallV5 = new SmallWallV();
        addObject(smallWallV5, 1, 1);
        smallWallV5.setLocation(230, 182); // top left, attached to genericWallH4
        
        SmallWallV smallWallV6 = new SmallWallV();
        addObject(smallWallV6, 1, 1);
        smallWallV6.setLocation(320, 45); // top leftmost, next to castle
        
        SmallWallV smallWallV7 = new SmallWallV();
        addObject(smallWallV7, 1, 1);
        smallWallV7.setLocation(320, 135); // top left, attached to smallWallV6
        
        SmallWallV smallWallV8 = new SmallWallV();
        addObject(smallWallV8, 1, 1);
        smallWallV8.setLocation(320, 220); // top left, attached to smallWallV7
        
        SmallWallV smallWallV9 = new SmallWallV();
        addObject(smallWallV9, 1, 1);
        smallWallV9.setLocation(320, 310); // top left, attached to smallWallV8
        
        SmallWallV smallWallV10 = new SmallWallV();
        addObject(smallWallV10, 1, 1);
        smallWallV10.setLocation(320, 400); // middle left, attached to smallWallV9
        
        SmallWallV smallWallV11 = new SmallWallV();
        addObject(smallWallV11, 1, 1);
        smallWallV11.setLocation(208, 386); // middle left, attached to genericWallH4
        
        SmallWallV smallWallV12 = new SmallWallV();
        addObject(smallWallV12, 1, 1);
        smallWallV12.setLocation(180, 103); // top left, attached to smallWallH1
        
        SmallWallV smallWallV13 = new SmallWallV();
        addObject(smallWallV13, 1, 1);
        smallWallV13.setLocation(180, 45); // top left, attached to smallWallV12
        
        SmallWallV smallWallV14 = new SmallWallV();
        addObject(smallWallV14, 1, 1);
        smallWallV14.setLocation(200, 655); // bottom left
        
        SmallWallV smallWallV15 = new SmallWallV();
        addObject(smallWallV15, 1, 1);
        smallWallV15.setLocation(540, 655); // bottom middle
        
        SmallWallV smallWallV16 = new SmallWallV();
        addObject(smallWallV16, 1, 1);
        smallWallV16.setLocation(540, 575); // bottom middle, attached to smallWallV15
        
        SmallWallV smallWallV17 = new SmallWallV();
        addObject(smallWallV17, 1, 1);
        smallWallV17.setLocation(316, 575); // bottom left, attached to genericWallH7
        
        
        Hero hero = new Hero();
        addObject(hero,541,497);
        
        hero.setLocation(800,650);
        
}
}
