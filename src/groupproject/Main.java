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
        Brick.ReadFile();
        Concrete.ReadFile();
        //Calls the menu to display to the user 
        Menu.selectOption(); 
    }
}
