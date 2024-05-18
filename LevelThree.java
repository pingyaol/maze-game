import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class LevelThree extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public LevelThree()
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
        smallWallH1.setLocation(475, 200); // top middle, attached to genericWallH9
        
        
        // vertical side walls
        SideWallV sideWallV1 = new SideWallV();
        addObject(sideWallV1, 1, 1);
        sideWallV1.setLocation(222, 100); // top left, right next to castle
        
        // horizontal side walls
        SideWallH sideWallH1 = new SideWallH();
        addObject(sideWallH1, 1, 1);
        sideWallH1.setLocation(200, 97); // top right, attached to castle
        
        // generic horizontal walls
        GenericWallH genericWallH1 = new GenericWallH();
        addObject(genericWallH1, 1, 1);
        genericWallH1.setLocation(50, 200); // top left, right below castle
        
        GenericWallH genericWallH2 = new GenericWallH();
        addObject(genericWallH2, 1, 1);
        genericWallH2.setLocation(170, 460); // bottom left, attached to smallWallV3
        
        GenericWallH genericWallH3 = new GenericWallH();
        addObject(genericWallH3, 1, 1);
        genericWallH3.setLocation(290, 460); // bottom left, attached to genericWallH2
        
        GenericWallH genericWallH4 = new GenericWallH();
        addObject(genericWallH4, 1, 1);
        genericWallH4.setLocation(169, 550); // bottom left, attached to smallWallV7
        
        GenericWallH genericWallH5 = new GenericWallH();
        addObject(genericWallH5, 1, 1);
        genericWallH5.setLocation(169, 640); // bottom left, attached to genericWallH6
        
        GenericWallH genericWallH6 = new GenericWallH();
        addObject(genericWallH6, 1, 1);
        genericWallH6.setLocation(289, 640); // bottom left, attached to genericWallH5
        
        GenericWallH genericWallH7 = new GenericWallH();
        addObject(genericWallH7, 1, 1);
        genericWallH7.setLocation(790, 100); // top rightmost
        
        GenericWallH genericWallH8 = new GenericWallH();
        addObject(genericWallH8, 1, 1);
        genericWallH8.setLocation(685, 200); // top right, attached to smallWallV8
        
        GenericWallH genericWallH9 = new GenericWallH();
        addObject(genericWallH9, 1, 1);
        genericWallH9.setLocation(565, 200); // top right, attached to genericWallH8
        
        GenericWallH genericWallH10 = new GenericWallH();
        addObject(genericWallH10, 1, 1);
        genericWallH10.setLocation(600, 460); // bottom middle, attached to smallWallV14
        
        GenericWallH genericWallH11 = new GenericWallH();
        addObject(genericWallH11, 1, 1);
        genericWallH11.setLocation(700, 550); // bottom right, attached to smallWallV17
        
        GenericWallH genericWallH12 = new GenericWallH();
        addObject(genericWallH12, 1, 1);
        genericWallH12.setLocation(600, 550); // bottom right, attached to genericWallH11
        
        // small vertical walls
        SmallWallV smallWallV1 = new SmallWallV();
        addObject(smallWallV1, 1, 1);
        smallWallV1.setLocation(115, 240); // top left, attached to genericWallH1
        
        SmallWallV smallWallV2 = new SmallWallV();
        addObject(smallWallV2, 1, 1);
        smallWallV2.setLocation(115, 330); // middle left, attached to smallWallV1
        
        SmallWallV smallWallV3 = new SmallWallV();
        addObject(smallWallV3, 1, 1);
        smallWallV3.setLocation(115, 420); // middle left, attached to smallWallV2
        
        SmallWallV smallWallV4 = new SmallWallV();
        addObject(smallWallV4, 1, 1);
        smallWallV4.setLocation(342, 420); // top middle, attached to genericaWallH3
        
        SmallWallV smallWallV5 = new SmallWallV();
        addObject(smallWallV5, 1, 1);
        smallWallV5.setLocation(342, 330); // top middle, attached to smallWallV4
        
        SmallWallV smallWallV6 = new SmallWallV();
        addObject(smallWallV6, 1, 1);
        smallWallV6.setLocation(342, 240); // top middle, attached to smallWallV5
        
        SmallWallV smallWallV7 = new SmallWallV();
        addObject(smallWallV7, 1, 1);
        smallWallV7.setLocation(115, 590); // bottom left, attached to genericWallH5
        
        SmallWallV smallWallV8 = new SmallWallV();
        addObject(smallWallV8, 1, 1);
        smallWallV8.setLocation(737, 150); // top right, attached to genericWallH7
        
        SmallWallV smallWallV9 = new SmallWallV();
        addObject(smallWallV9, 1, 1);
        smallWallV9.setLocation(452, 250); // top middle, attached to smallWallH1
        
        SmallWallV smallWallV10 = new SmallWallV();
        addObject(smallWallV10, 1, 1);
        smallWallV10.setLocation(452, 340); // center, attached to smallWallV9
        
        SmallWallV smallWallV11 = new SmallWallV();
        addObject(smallWallV11, 1, 1);
        smallWallV11.setLocation(452, 430); // bottom middle, attached to smallWallV10
        
        SmallWallV smallWallV12 = new SmallWallV();
        addObject(smallWallV12, 1, 1);
        smallWallV12.setLocation(452, 520); // bottom middle, attached to smallWallV11
        
        SmallWallV smallWallV13 = new SmallWallV();
        addObject(smallWallV13, 1, 1);
        smallWallV13.setLocation(652, 330); // bottom right, next to smallWallV9
        
        SmallWallV smallWallV14 = new SmallWallV();
        addObject(smallWallV14, 1, 1);
        smallWallV14.setLocation(652, 420); // bottom right, next to smallWallV9
        
        SmallWallV smallWallV15 = new SmallWallV();
        addObject(smallWallV15, 1, 1);
        smallWallV15.setLocation(752, 330); // bottom right, next to smallWallV13
        
        SmallWallV smallWallV16 = new SmallWallV();
        addObject(smallWallV16, 1, 1);
        smallWallV16.setLocation(752, 420); // bottom right, attached to smallWallV15
        
        SmallWallV smallWallV17 = new SmallWallV();
        addObject(smallWallV17, 1, 1);
        smallWallV17.setLocation(752, 510); // bottom right, attached to smallWallV16
        
        SmallWallV smallWallV18 = new SmallWallV();
        addObject(smallWallV18, 1, 1);
        smallWallV18.setLocation(545, 585); // bottom right, attached to genericWallH12
        
        Hero hero = new Hero();
        addObject(hero,541,497);
        
        hero.setLocation(800,650);
        

        
    }
}

