// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class GameLostWorld extends World
{

    /**
     * Constructor for objects of class GameLostWorld.
     */
    public GameLostWorld()
    {
        super(560, 560, 1);
        showTextWithBigGreenFont("You Lose!", 180, 200);
    }

    /**
     * 
     */
    final public void showTextWithBigGreenFont(String message, int x, int y)
    {
        GreenfootImage bg = getBackground();
        Font font =  new  Font(50);
        bg.setFont(font);
        bg.setColor(Color.GREEN);
        bg.drawString(message, x, y);
    }
}
