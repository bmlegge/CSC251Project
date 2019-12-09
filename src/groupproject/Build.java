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
        //Header
        System.out.println("   Name\t\tLength\t\tHeight\t\tWidth\t\tCost");
        System.out.println("----------------------------------------------------------------------");
        
        //Reads the properties of each brick from the list.
        for(int i = 0; i < Lists.newBricks.size(); i++)
        {
            System.out.println(i+1 + ": " + Lists.newBricks.get(i).getName() +
                       "\t" + Lists.newBricks.get(i).getLength() +
                       "\t\t" + Lists.newBricks.get(i).getHeight() +
                       "\t\t" + Lists.newBricks.get(i).getWidth() +
                       "\t\t$" + Lists.newBricks.get(i).getCost());
        }
        //Asks user for input.
        System.out.print("\nPlease choose which brick you will use:\n");
        System.out.print("> ");
        int userInput = keyboard.nextInt();
        
        switch(userInput)
        {
            //Passes the properties of the first brick in the list to mortarSelection method.
            case 1:
                mortarSelection(Lists.newBricks.get(0).getLength(), 
                               Lists.newBricks.get(0).getHeight(), 
                               Lists.newBricks.get(0).getWidth(),
                               Lists.newBricks.get(0).getCost());
                break;
            //Passes the properties of the second brick in the list to mortarSelection method.
            case 2:
                mortarSelection(Lists.newBricks.get(1).getLength(),
                               Lists.newBricks.get(1).getHeight(),
                               Lists.newBricks.get(1).getWidth(),
                               Lists.newBricks.get(1).getCost());
                break;
            //Passes the properties of the third brick in the list to mortarSelection method.
            case 3:
                mortarSelection(Lists.newBricks.get(2).getLength(),
                               Lists.newBricks.get(2).getHeight(),
                               Lists.newBricks.get(2).getWidth(),
                               Lists.newBricks.get(2).getCost());
                break;
            //Passes the properties of the fourth brick in the list to mortarSelection method.
            case 4:
                mortarSelection(Lists.newBricks.get(3).getLength(),
                               Lists.newBricks.get(3).getHeight(),
                               Lists.newBricks.get(3).getWidth(),
                               Lists.newBricks.get(3).getCost());
                break;
            //Passes the properties of the fifth brick in the list to mortarSelection method.
            case 5:
                mortarSelection(Lists.newBricks.get(4).getLength(),
                               Lists.newBricks.get(4).getHeight(),
                               Lists.newBricks.get(4).getWidth(),
                               Lists.newBricks.get(4).getCost());
                break;
            //Passes the properties of the sixth brick in the list to mortarSelection method.
            case 6:
                mortarSelection(Lists.newBricks.get(5).getLength(),
                               Lists.newBricks.get(5).getHeight(),
                               Lists.newBricks.get(5).getWidth(),
                               Lists.newBricks.get(5).getCost());
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
    
    public static void mortarSelection(double l, double h, double w, double cost)
    {
        //Header
        System.out.println("   Name\t\tPounds\t\tCost");
        System.out.println("---------------------------------------------------");
        
        //Reads the properties of each mortar from the list.
        for(int i = 0; i < Lists.newMortar.size(); i++)
        {

            System.out.println(i+1 + ": " + Lists.newMortar.get(i).getName() +
                               "\t" + Lists.newMortar.get(i).getPounds() +
                               "\t\t$" + Lists.newMortar.get(i).getCost());
        }
        //Asks user input
        System.out.print("\nPlease choose which mortar mix you will use.\n");
        System.out.print("> ");
        int userInput = keyboard.nextInt();

        switch(userInput)
        {
            //Passes the variables to the BuildWalkwayWall method in the Construction class.
            case 1:
                Construction.BuildWalkwayWall(l, h, w, cost, Lists.newMortar.get(0).getCost());
                break;
            case 2:
                Construction.BuildWalkwayWall(l, h, w, cost, Lists.newMortar.get(1).getCost());
                break;
            case 3:
                Construction.BuildWalkwayWall(l, h, w, cost, Lists.newMortar.get(2).getCost());
                break;
            case 4:
                Construction.BuildWalkwayWall(l, h, w, cost, Lists.newMortar.get(3).getCost());
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
    
    public static void concreteSelection()
    {
        //Header
        System.out.println("   Name\t\tPounds\t\tCost");
        System.out.println("---------------------------------------------------");
        
        //Reads the properties of each concrete from the list.
        for(int i = 0; i < Lists.newConcrete.size(); i++)
        {

            System.out.println(i+1 + ": " + Lists.newConcrete.get(i).getName() +
                               "\t" + Lists.newConcrete.get(i).getPounds() +
                               "\t\t$" + Lists.newConcrete.get(i).getCost());
        }
        //Asks user input.
        System.out.print("\nPlease choose which concreate you will use.\n");
        System.out.print("> ");
        int userInput = keyboard.nextInt();

        switch(userInput)
        {
            //Passes the properties of the concrete instance to the BuildConcreteRamp method.
            case 1:
                Construction.BuildConcreteRamp(Lists.newConcrete.get(0).getPounds(), 
                                               Lists.newConcrete.get(0).getCost());
                break;
            case 2:
                Construction.BuildConcreteRamp(Lists.newConcrete.get(1).getPounds(), 
                                               Lists.newConcrete.get(1).getCost());
                break;
            case 3:
                Construction.BuildConcreteRamp(Lists.newConcrete.get(2).getPounds(), 
                                               Lists.newConcrete.get(2).getCost());
                break;
            case 4:
                Construction.BuildConcreteRamp(Lists.newConcrete.get(3).getPounds(), 
                                               Lists.newConcrete.get(3).getCost());
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
}

