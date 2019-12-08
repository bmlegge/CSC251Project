/*
 * 
*/
package groupproject;
import java.util.Scanner;


public class Construction 
{
    public static Scanner keyboard = new Scanner(System.in);
    public static final double MORTAR=0.375;
    
    public static void BuildPlanterWall(double l, double h, double w)
    {
        double height = h+MORTAR;//4
        double length = l+MORTAR; //8.375
        double width= w+MORTAR;//2.625   
        double wall_length= 1200;
        double wall_height= 24;  
        
        double numOfRows= wall_height/height;
        double bricksAcrossRow= (wall_length/length)+1;
        double totalBricks= (numOfRows*bricksAcrossRow) * 2;
        double amountOfMortar = totalBricks/30;
        
        System.out.println("The total number of bricks needed to build"
                + "\nthe planter wall is: " + totalBricks);
        System.out.println("The total bags of mortar mix needed to build"
                + "\nthe planter wall is: " + amountOfMortar);
        
//        System.out.println("Rows:" +numOfRows +
//                "\nBricks Across: " +bricksAcrossRow +
//                "\nTotal Bricks: " + totalBricks);
        
        BuildBrickWall(height,length, width);
    }
    
    public static void BuildBrickWall(double l, double h, double w)
    {
        double height = h+MORTAR;//4
        double length = l+MORTAR; //8.375
        double width= w+MORTAR;//2.625
        double wall_length= 720;//60 feet
        double wall_height= 84;//7 feet
        
        double numOfRows= wall_height/height;
        double bricksAcrossRow= (wall_length/length)+1;
        double totalBricks= (numOfRows*bricksAcrossRow) * 2; 
        double amountOfMortar = totalBricks/30;

        System.out.println("The total number of bricks needed to build"
                + "\ndesign wall: " + totalBricks);
        System.out.println("The total bags of mortar mix needed to build"
                + "\nthe desing wall is: " + amountOfMortar);
        
//      System.out.println("Rows:" +numOfRows +
//                "\nBricks Across: " +bricksAcrossRow +
//                "\nTotal Bricks: " + totalBricks);
    }
    
    public static void AmountOfMortar(double totalBricks)
    {
        //Don't need?????
    }
    
    public static void BuildConcretePart(double pounds)
    {
        //Used to calculate how much concrete needed for the
        //construction of handicap ramp
        System.out.println("pounds: " +pounds);
    }
}
