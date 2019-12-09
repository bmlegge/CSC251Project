/*
 * Brick Class
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

public class Brick 
{
    //field variables
    private String _name;
    private double _length;
    private double _height;
    private double _width;
    private double _cost;
    
    //Constructor
    public Brick(String name, double l, double h, double w, double cost)
    {
        _name = name;
        _length = l;
        _height = h;
        _width  = w;
        _cost   = cost;
    }
    
    //Setters
    public void setName(String name)
    {
        _name = name;
    }
    
    public void setLength(double l)
    {
        _length = l;
    }
    
    public void setHeight(double h)
    {
        _height = h;
    }
    
    public void setWidth(double w)
    {
        _width = w;
    }
    
    public void setCost(double cost)
    {
        _cost = cost;
    }
    
    //Getters
    public String getName()
    {
        return _name;
    }
    
    public double getLength()
    {
        return _length;
    }
    
    public double getHeight()
    {
        return _height;
    }
    
    public double getWidth()
    {
        return _width;
    }
    
    public double getCost()
    {
        return _cost;
    }
   
    public static void ReadFile() throws FileNotFoundException, IOException
    {
        BufferedReader br = new BufferedReader(new FileReader("brick.csv"));
        
        String line = br.readLine(); // Reading file
        
        try
        {
            while((line = br.readLine()) != null && !line.isEmpty())//Skips header in the .csv           
            {
                String[] fields = line.split(",");  //splits the csv

                //stores an instance of a brick into a list.
                Lists.newBricks.add(new Brick
                         (fields[0],
                          Double.parseDouble(fields[1]), 
                          Double.parseDouble(fields[2]), 
                          Double.parseDouble(fields[3]), 
                          Double.parseDouble(fields[4])));
            }
            br.close(); //close the file 
       }
        
        catch(FileNotFoundException e)
        {
            System.out.println("File not found.");                                  
        }
    }    
}   

