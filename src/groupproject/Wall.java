/*
 * 
*/
package groupproject;
import java.util.Scanner;


public class Wall 
{
    public static Scanner keyboard = new Scanner(System.in);
    public static final double MORTAR=0.375;
    
    public static void BuildBrickWall(double l, double h, double w)
    {
        double height = h+MORTAR;//4
        double length = l+MORTAR; //8.375
        double width= w+MORTAR;//2.625
       
//        System.out.println("Enter the length of the wall");
//        double wall_length=keyboard.nextDouble();
//        
//        System.out.println("Enter the height of the wall");
//        double wall_height=keyboard.nextDouble();
        
        double wall_length= 1200;
        double wall_height= 60;
        
        //TODO need to convert wall_height/wall_length into inches (*12)
        double design1= wall_length/width;           
        double design2= 2*(wall_length/height);
        
        double midSection= (2*height)+length;
        double remainingWall= wall_height - midSection;    //43.625    
        double numOfRows= remainingWall/height;       //17
        double bricksAcrossRow= wall_length/length;   //8
        double design3= numOfRows*bricksAcrossRow;       
        
        double totalBricks= design1+design2+design3;
        
        System.out.println("Long brick amount: " + design1 +
                "\nDouble brick amount: " + design2 + 
                "\nMiddle section: " + midSection + 
                "\nRemaining wall: " + remainingWall + 
                "\nNumber of rows: " + numOfRows +
                "\nBricks across a row: " + bricksAcrossRow +
                "\nRemaining brick amount: " + design3 +
                "\nTotal bricks needed: " + totalBricks);
    }
    
    public static void BuildConcretePart(double pounds)
    {
        System.out.println("pounds: " +pounds);
    }
}
