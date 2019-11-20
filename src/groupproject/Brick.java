/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupproject;

import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class Brick 
{
    private String _name;
    private double _length;
    private double _height;
    private double _width;
    private String _color;
    private double _cost;
    
    public Brick(String name, double l, double h, double w, String color, double cost)
    {
        _name = name;
        _length = l;
        _height = h;
        _width = w;
        _color = color;
        _cost = cost;
    }
    
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
    
    public void setColor(String color)
    {
        _color = color;
    }
    
    public void setCost(double cost)
    {
        _cost = cost;
    }
    
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
    
    public String getColor()
    {
        return _color;
    }
    
    public double getCost()
    {
        return _cost;
    }
    
    public static void ReadFile()
    {
        ArrayList<Brick> bricks = new ArrayList<Brick>();
        
        try
        {
            File file = new File("brick.csv");
            Scanner inputFile = new Scanner(file);

            while(inputFile.hasNext())
            {
                String line = inputFile.nextLine();
                String[] values = line.split(",");

                bricks.add(new Brick
                         (values[0],
                          Double.parseDouble(values[1]), 
                          Double.parseDouble(values[2]), 
                          Double.parseDouble(values[3]), 
                          values[4], 
                          Double.parseDouble(values[5])));

                System.out.println("Brick name is " + values[0] +
                        " Brick length is " + values[1] + 
                        " Brick height is " + values[2] +
                        " Brick width is " + values[3] +
                        " Brick color is " + values[4] +
                        " Brick costs is $" + values[5] + ".");
            }
            inputFile.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found.");
        }
    }    
}   
