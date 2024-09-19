// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Lobster extends Actor
{

    /**
     * 
     */
    public Lobster()
    {
        turn(Greenfoot.getRandomNumber(360));
    }

    /**
     * Act - do whatever the Lobster wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAround();
        eat();
        
        if (isGameLost()) {
            transitionToGameLostWorld();
        }
    }

    /**
     * 
     */
    public void moveAround()
    {
        move(4);
        if (Greenfoot.getRandomNumber(10) == 1) {
            turn(Greenfoot.getRandomNumber(90) - 45);
        }
        if (isAtEdge()) {
            turn(180);
        }
    }

    /**
     * 
     */
    public void eat()
    {
        Actor crab = getOneIntersectingObject(Crab.class);
        Actor worm = getOneIntersectingObject(Worm.class);
        if (crab != null) {
            World world = getWorld();
            world.removeObject(crab);
            Greenfoot.playSound("dead.wav");
        }
        if (worm != null) {
            World world = getWorld();
            int xLocation = worm.getX();
            int yLocation = worm.getY();
            Lobster lobster =  new Lobster();
            world.removeObject(worm);
            world.addObject(lobster, xLocation, yLocation);
            Greenfoot.playSound("dead.wav");
        }
    }

    /**
     * 
     */
    public boolean isGameLost()
    {
        World world = getWorld();
        if (world.getObjects(Crab.class).isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * 
     */
    public void transitionToGameLostWorld()
    {
        World gameLostWorld =  new GameLostWorld();
        Greenfoot.setWorld(gameLostWorld);
    }

    /**
     * 
     */
    public void Multiply()
    {
    }
}
