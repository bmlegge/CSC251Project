/*
 * Main class to call methods / Driver Class 
 */
package groupproject;

import java.util.Scanner;
import java.util.*;

public class Main 
{
      public static void main(String[] args)
      {
          String input = "";
          boolean exit = false;
          int userMenuSelection = 0;
          Scanner keyboard = new Scanner(System.in);
               
          do
          {
            userMenuSelection = Menu.DisplayMenu(userMenuSelection, keyboard, input);
         
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
                        System.out.println(" Error ");
                        break;
                }            
            }               
            catch(InputMismatchException e)
            {
            }    
          }while(exit == false);      
      }
}
