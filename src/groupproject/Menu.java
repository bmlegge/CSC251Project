/*
Menu for user to select options from. 
*/
package groupproject;

import java.util.InputMismatchException;
import java.util.Scanner; 

public class Menu 
{
    public static int DisplayMenu(int userMenuSelection, Scanner keyboard,
            String input)
    {
        try
        {
            System.out.println(
                    "\n                      Menu                      "
                   +"\n------------------------------------------------"
                   +"\n1. Brick    "          // Brick Class
                   +"\n2. Concrete "          // Concrete Class 
                   +"\n3. Cost     "          // Cost Class
                   +"\n4. Exit Program "     //Exits the program
                   +"\n------------------------------------------------"
                   +"\n\nEnter a number from the menu: "); 
            System.out.print(">> "); 
            input = keyboard.nextLine();
            userMenuSelection = Integer.parseInt(input); //Convert str to int  
  
        }
        catch(NumberFormatException e)
        {                         
        }       
        return userMenuSelection;
    }
}
