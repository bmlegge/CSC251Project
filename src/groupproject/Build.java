/*
 *
 */
package groupproject;

import java.io.IOException;
import java.util.*;
import java.util.Scanner;

public class Build 
{
    public static Scanner keyboard = new Scanner(System.in);
    public static boolean exit = false;
    
    public static void brickSelection() throws IOException
    {  
        System.out.println("\nPlease choose which brick you will use:\n");
        for(int i = 0; i < Lists.newBricks.size(); i++)
        {
            System.out.println("Brick "+(i+1)+": " + Lists.newBricks.get(i).getName());
        }
        System.out.print("> ");
        int userInput = keyboard.nextInt();
        
        switch(userInput)
        {
            case 1:
                Wall.BuildBrickWall(Lists.newBricks.get(0).getLength(), 
                               Lists.newBricks.get(0).getHeight(), 
                               Lists.newBricks.get(0).getWidth());
                break;
            case 2:
                Wall.BuildBrickWall(Lists.newBricks.get(1).getLength(),
                               Lists.newBricks.get(1).getHeight(),
                               Lists.newBricks.get(1).getWidth());
                break;
            case 3:
                Wall.BuildBrickWall(Lists.newBricks.get(2).getLength(),
                               Lists.newBricks.get(2).getHeight(),
                               Lists.newBricks.get(2).getWidth());
                break;
            case 4:
                Wall.BuildBrickWall(Lists.newBricks.get(3).getLength(),
                               Lists.newBricks.get(3).getHeight(),
                               Lists.newBricks.get(3).getWidth());
                break;
            case 5:
                Wall.BuildBrickWall(Lists.newBricks.get(4).getLength(),
                               Lists.newBricks.get(4).getHeight(),
                               Lists.newBricks.get(4).getWidth());
                break;
            case 6:
                Wall.BuildBrickWall(Lists.newBricks.get(5).getLength(),
                               Lists.newBricks.get(5).getHeight(),
                               Lists.newBricks.get(5).getWidth());
                break;
            case 7:                     //To quit program while testing.
                exit = true;
                break;
            default:
                System.out.println("");
                System.out.println("Please Make A Selection From The Menu!");
                break;            
        }
    }
    
    public static void concreteSelection()
    {
        System.out.println("\nPlease choose which concreate you will use.\n");
        for(int i = 0; i < Lists.newConcrete.size(); i++)
        {
            System.out.println("Concrete "+(i+1)+ ": " + Lists.newConcrete.get(i).getName());
        }
        System.out.print("> ");
        int userInput = keyboard.nextInt();

        switch(userInput)
        {
            case 1:
                Wall.BuildConcretePart(Lists.newConcrete.get(0).getPounds());
                break;
            case 2:
                Wall.BuildConcretePart(Lists.newConcrete.get(1).getPounds());
                break;
            case 3:
                Wall.BuildConcretePart(Lists.newConcrete.get(2).getPounds());
                break;
            case 4:
                Wall.BuildConcretePart(Lists.newConcrete.get(3).getPounds());
                break;
            case 5:                     //To quit program while testing.
                exit = true;
                break;
            default:
                System.out.println("");
                System.out.println("Please Make A Selection From The Menu!");
                break;
        }
    }
    
    public static void displayCost()
    {
        System.out.println("This is a test 3");
    }
}

