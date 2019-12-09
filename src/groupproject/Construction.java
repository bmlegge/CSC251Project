/*
 * 
*/
package groupproject;
import java.util.Scanner;


public class Construction 
{
    public static Scanner keyboard = new Scanner(System.in);
    public static final double MORTAR=0.375;
    
    public static void BuildWalkwayWall(double l, double h, double w, double brickCost, double mortarCost)
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
        
        double totalCost = (brickCost*totalBricks) + (mortarCost*amountOfMortar);
       
        System.out.println("\nThe total number of bricks needed to build"
                + " the walkway wall is: " + String.format("%.0f", totalBricks));
        System.out.println("The total bags of mortar mix needed to build"
                + " the walkway wall is: " + String.format("%.0f", amountOfMortar));
        System.out.println("The total cost to build this wall is: $" + String.format("%.2f", totalCost));

        BuildBrickWall(height, length, width, brickCost, mortarCost);
    }
    
    public static void BuildBrickWall(double l, double h, double w, double brickCost, double mortarCost)
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
        
        double totalCost = (brickCost*totalBricks) + (mortarCost*amountOfMortar);

        System.out.println("\nThe total number of bricks needed to build"
                + " the divider wall: " + String.format("%.0f", totalBricks));
        System.out.println("The total bags of mortar mix needed to build"
                + " the divider wall is: " + String.format("%.0f", amountOfMortar));
        System.out.println("The total cost to build this wall is: $" + String.format("%.2f", totalCost));
    }
    
    public static void BuildConcreteRamp(double pounds, double cost)
    {
        double rampWidth = 10;
        double rampLength = 12;
        double rampHeight = 16;
        double volume = ((rampLength*rampHeight)/6)*((2*rampWidth)+rampWidth);
        double totalBags = 0;
        
        if(pounds >= 20 && pounds < 40)
        {
            totalBags = volume/.15;
        }
        else if(pounds >=40 && pounds < 60)
        {
            totalBags = volume/.30;
        }
        else if(pounds >=60 && pounds < 80)
        {
            totalBags = volume/.45;
        }
        else if(pounds >=80)
        {
            totalBags = volume/.60;
        }
        else
        {
            System.out.println("Error");
        }
        
        double totalCost = totalBags * cost;
        
        System.out.println("The total number of bags of concrete needed to build"
                + " the ramp is: " +String.format("%.0f", totalBags));
        System.out.println("The total cost to build the ramp is: $" +String.format("%.2f", totalCost));
    }
}
