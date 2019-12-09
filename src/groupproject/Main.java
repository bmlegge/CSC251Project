/*
 * Main class to call methods 
 */

package groupproject;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main 
{
    public static void main(String[] args) throws FileNotFoundException,IOException
    {
        Brick.ReadFile();       //loads brick CSV file.
        Mortar.ReadFile();      //loads mortar CSV file.
        Concrete.ReadFile();    //loads concrete CSV file.
        
        //Displays welcome prompt when program starts.
        System.out.println("Welcome.  This program will calculate the total number of bricks"
                   +"\nneeded to build three structures.  The first structure is a walkway wall" 
                   +"\nthat extends down the back side of the Horace Sisk building. The second"
                   +"\nstructure is a wall that hides the machinery for safety purposes.  The final"
                   +"\nstructure is a handicap ramp to lead into the side of Horace Sisk. In addition"
                   +"\nthis program will calculate the total cost of brick and mortar to build these"
                   +"\nstructures");
        //Calls the menu to display to the user 
        Menu.selectOption();
    }
}