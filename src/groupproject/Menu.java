/*
Menu for user to select options from. 
*/
package groupproject;

import java.util.Scanner; 
import java.util.*;

public class Menu 
{
    public static void DisplayMenu()
    {
        boolean exit = false;
        int userMenuSelection = 0;
        Scanner keyboard = new Scanner(System.in);
        
        do
        {
            try
            {
                //Decision Structure
                switch(userMenuSelection)
                {
                    case 1:
                        Brick.BrickMenu();
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        System.exit(0);
                        break;      
                    default:
                        System.out.println("errora");
                }
                System.out.println(
                        "                      Menu                        "
                       +"\n------------------------------------------------"
                       +"\n1. Brick Selection"// 
                       +"\n2."//
                       +"\n3."//
                       +"\n4."// 
                       +"\n5. Exit "//Exit program
                       +"\n------------------------------------------------"
                       +"\n\nEnter a number from the menu: "); 
                System.out.print(">> ");
                userMenuSelection = keyboard.nextInt(); 
            }
            catch(InputMismatchException e)
            {
                System.out.println(e);
                break;
            }
        }while(exit == false);
    }
}
