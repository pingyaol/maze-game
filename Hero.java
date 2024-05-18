import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    /**
     * Act - do whatever the Hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int lives = 3;
    private String livesText = "Lives left: ";
    private int correctAnswers = 0;
    public void act()
    { 
        moveAround(); 
    }
    public void moveAround()
        {
            getWorld().showText(livesText+ Integer.toString(lives), 700,600);
       if (Greenfoot.isKeyDown("right"))
       {
           setLocation(getX() + 3, getY());
           if  (hitWall() == true)
           {
               setLocation(getX() - 3, getY());
            }
           
        } 
         if (Greenfoot.isKeyDown("left"))
       {
           setLocation(getX() - 3, getY());
           
           if  ( hitWall() == true)
           {
               setLocation(getX() + 3, getY());
            }
        }
        if (Greenfoot.isKeyDown("up"))
       {
           setLocation(getX() , getY()- 3);
            if  ( hitWall() == true)
           {
               setLocation(getX() , getY()+ 3);
            }
        }
         if (Greenfoot.isKeyDown("down"))
       {
           setLocation(getX(), getY() + 3); 
            if  ( hitWall() == true)
           {
               setLocation(getX(), getY()- 3);
            }
            
        } 
        youLose(); 
        youWin();
        endGame();
    }
    public boolean hitWall()
    {
        if (isTouching(wall.class))
        {
            return true; 
        }
        else 
        return false;
    } 
    public boolean hitCorrect()
    {
        // credit for idea: https://www.greenfoot.org/topics/59114/0
        correct conversion = (correct)getOneIntersectingObject(correct.class);
        
        // if is touching the conversion (same as isTouching)
        if (conversion != null) {
            conversion.touchedHero();
            getWorld().removeObject(conversion); 
            correctAnswers++;
            endGame(); 
            return true;
        } else {
            return false;
        }
    }
    public void youWin()
    {
     if (hitCorrect())
     {
        Greenfoot.playSound("correct.wav");
        }
    }
    public void youLose()
    {
       if (isTouching(wrong.class))
       {
           Greenfoot.playSound("wrong.mp3");
           if (lives > 1) {
               lives -= 1;
               getWorld().showText(livesText+ Integer.toString(lives),700,600);
	   setLocation(640,640);
            } else {
                lives -= 1;
                getWorld().showText(livesText+ Integer.toString(lives),700,600);
                Greenfoot.stop();
                getWorld().addObject(new YouLose() , 400, 355);
            }
           
        }
    }
    public void endGame()
    { 
        if (correctAnswers == 4)
        {
            getWorld().addObject(new YouWin(), 400, 355);
            Greenfoot.stop();
        }
     }       
    }

