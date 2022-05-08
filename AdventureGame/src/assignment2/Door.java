/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

/**
 *
 * @author Rahul Patalia
 */
public class Door 
{
    private String from; 
    private String to;

    public Door(String from, String to) 
    {
        this.from = from;
        this.to = to;
    }
    
    public String getTo()
    {
        return to;
    }

    @Override
    public String toString() 
    {
        String accessDoors = "<door from " + from + " to " + to + ">"; 
        return accessDoors;
    }
}
