/*
Menu for user to select options from. 
*/
package groupproject;

import java.util.Scanner; 

public class Menu 
{
    public static void DisplayMenu()
    {
       boolean exit = false; // Keeps the loop going    
       Scanner keyboard = new Scanner(System.in);//Object for keyboard input
       
       try
       {
           do
           {
               System.out.println("Please make a selection from the menu"
                                + " below: ");
               
               System.out.println("-----MENU-----"
                       + "1. Choose brick type: "
                       + "2. Choose ");
               
               break;//Prevents an infinite loop
               
           }while(exit == false);
           
       }
       catch(Exception ex)
       {
           System.out.println(ex); //print any errors;(for testing)
       }
 
    }
}
