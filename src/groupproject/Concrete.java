/*
 * 
 */
package groupproject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Concrete 
{
    //fields
    private String _name;
    private double _cost;
    private double _pounds;
    
    //Constructor
    public Concrete(String name, double pounds, double cost )
    {
        _name = name;
        _cost = cost;
        _pounds = pounds; 
    }
    
    //Setters
    public void setName(String name)
    {
        _name = name;
    }
   
    public void setCost(double cost)
    {
        _cost = cost;
    }
    
    public void setPounds(double pounds)
    {
        _pounds = pounds;
    }
    
    //Getters
    public String getName()
    {
        return _name;
    }
  
    public double getCost()
    {
        return _cost;
    }

    public double getPounds()
    {
        return _pounds;
    }
   
    public static void ReadFile() throws FileNotFoundException, IOException
    {
        BufferedReader br = new BufferedReader(new FileReader("Concrete.csv"));
        
        String line = br.readLine(); // Reading file
        
        try
        {
            while((line = br.readLine()) != null && !line.isEmpty())//Skips header in the .csv           
            {
                String[] fields = line.split(",");
                
                //stores an instance of concrete into a list.
                Lists.newConcrete.add(new Concrete 
               (fields[0], 
                Double.parseDouble(fields[1]),
                Double.parseDouble(fields[2])));
            }
            br.close(); //close the file 
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found.");                                  
        }
    }    
}
