/*
* Menu for user to select options from. 
*/
package groupproject;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner; 

public class Menu 
{
    public static void selectOption()throws FileNotFoundException,IOException
    {   
        String input = "";
        boolean exit = false;
        int userMenuSelection = 0;
        Scanner keyboard = new Scanner(System.in);
               
          do
          {
            userMenuSelection = Menu.displayMenu(userMenuSelection, keyboard, 
                    input);       
            try
            {
                //Decision Structure
                switch(userMenuSelection)
                {
                    case 1:
                        Build.brickSelection(); 
                        break;
                    case 2:
                        Build.concreteSelection();
                        break;
                    case 3:
                        Build.displayCost(); 
                        break;
                    case 4:
                        System.exit(0);
                        break;      
                    default: 
                        System.out.println("");
                        System.out.println("Please Make A Selection"
                                         + " From The Menu! ");
                        break;
                }            
            }               
            catch(InputMismatchException e) //catches errors 
            {
            }    
          }while(exit == false);  // keeps the menu in a loop     
    }
    public static int displayMenu(int userMenuSelection, Scanner keyboard,
            String input)
    {
        try
        {
            // Displays menu to the user 
            System.out.println(
                    "\n                      Menu                      "
                   +"\n------------------------------------------------"
                   +"\n1. Brick    "          // Brick Class
                   +"\n2. Concrete "          // Concrete Class 
                   +"\n3. Cost     "          // Cost Class
                   +"\n4. Exit Program "      // Exits the program
                   +"\n------------------------------------------------"
                   +"\n\nEnter a number from the menu: "); 
            System.out.print(">> "); 
            input = keyboard.nextLine(); //stores the user input 
            userMenuSelection = Integer.parseInt(input); //Convert str to int  
        }
        catch(NumberFormatException e) 
        {           
            // Catches errors or incorrect input
        }       
        return userMenuSelection;      
    }
}
