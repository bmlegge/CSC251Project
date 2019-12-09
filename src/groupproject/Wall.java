/*
 * 
*/
package groupproject;
import java.util.Scanner;


public class Wall 
{
    public static Scanner keyboard = new Scanner(System.in);
    public static final double MORTAR=0.375;
    //change to build_planter_wall
    
    public static void BuildBrickWall(double l, double h, double w)
    {
        /*
        * Possibly use a default number for the wall to build or have user enter in
          a number. 
        * Then users selects brick type at whatever cost
        * Then users selects concrete type at whatever cost 
        * Display overall cost back to user based on wall dimensions
          - how much brick will be needed to build wall
          - how many pounds of concrete 
        */
        
        
        
        double height = h+MORTAR;//4
        double length = l+MORTAR; //8.375
        double width  = w+MORTAR;//2.625
       
//        System.out.println("Enter the length of the wall");
//        double wall_length=keyboard.nextDouble();
//        
//        System.out.println("Enter the height of the wall");
//        double wall_height=keyboard.nextDouble();
//       
//        double wall_length= 1200;
//        double wall_height= 24;
       
        //TODO need to convert wall_height/wall_length into inches (*12)
//        double design1= wall_length/width;           
//        double design2= 2*(wall_length/height);
//        
//        double midSection= (2*height)+length;
//        double remainingWall= wall_height - midSection;    //43.625    
//        double numOfRows= wall_height/height;       //17
//        double bricksAcrossRow= (wall_length/length)+1;   //8
//        double totalBricks= (numOfRows*bricksAcrossRow) * 2;       
//    
//        System.out.println("Rows:" +numOfRows +
//                "\nBricks Across: " +bricksAcrossRow +
//                "\nTotal Bricks: " + totalBricks);
//        
        BuildBrickWall2( height,length, width);
        
    }
    
    public static void BuildBrickWall2(double l, double h, double w)
    {
        double height = h +MORTAR;//4
        double length = l +MORTAR; //8.375
        double width  = w +MORTAR;//2.625
       
//        System.out.println("Enter the length of the wall");
//        double wall_length=keyboard.nextDouble();
//        
//        System.out.println("Enter the height of the wall");
//        double wall_height=keyboard.nextDouble();
        
        double wall_length= 720;//60 feet
        double wall_height= 84;//7 feet
        double numOfRows= wall_height/height;       //17
        double bricksAcrossRow= (wall_length/length)+1;   //8
        double totalBricks= (numOfRows*bricksAcrossRow) * 2;       
        
         
        
        System.out.println("Rows: " + numOfRows +
                "\nBricks Across: " + bricksAcrossRow +
                "\nTotal Brick  : " + totalBricks);
        
        
    }
    
    public static void BuildConcretePart(double pounds)
    {

    }
}
