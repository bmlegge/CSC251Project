/*
 * Concrete Class
 */
package groupproject;

import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.io.BufferedReader; 
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Concrete
{
    private String _name;
    private double _cost;
    private String _features;
    private double _pounds;
    
    public Concrete(String name, double cost, String features, double pounds )
    {
        _name = name;
        _cost = cost;
        _features = features;
        _pounds = pounds; 
    }
    
    public void setName(String name)
    {
        _name = name;
    }
   
    public void setCost(double cost)
    {
        _cost = cost;
    }
    
    public String getName()
    {
        return _name;
    }
  
    public double getCost()
    {
        return _cost;
    }
    
    public static void ReadFile() throws FileNotFoundException, IOException
    {
        List bricks = new ArrayList<>();    
        BufferedReader br = new BufferedReader(new FileReader("Concrete.csv"));
        
        String line = br.readLine(); // Reading file
        
        try
        {
            while((line = br.readLine()) != null && !line.isEmpty())//Skips header in the .csv           
            {
                String[] fields = line.split(",");

                bricks.add(new Concrete 
               (fields[0], 
                Double.parseDouble(fields[1]),
                fields[2],
                Double.parseDouble(fields[3])));
            }
            br.close(); //close the file 
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found.");                                  
        }
    }    
}   

