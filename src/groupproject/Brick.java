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
    private double _length;
    private double _height;
    private double _width;
    private String _color;
    private double _cost;
    
    public Brick(double l, double h, double w, String color, double cost)
    {
        _length = l;
        _height = h;
        _width = w;
        _color = color;
        _cost = cost;
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
                         (Double.parseDouble(values[0]), 
                          Double.parseDouble(values[1]), 
                          Double.parseDouble(values[2]), 
                          values[3], 
                          Double.parseDouble(values[4])));

                System.out.println("Brick length is " + values[0] + 
                        " Brick height is " + values[1] +
                        " Brick width is " + values[2] +
                        " Brick color is " + values[3] +
                        " Brick costs is $" + values[4] + ".");
            }
            inputFile.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not fount.");
        }
    }    
}   
