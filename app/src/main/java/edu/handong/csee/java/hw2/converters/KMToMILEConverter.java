package edu.handong.csee.java.hw2.converters;
import edu.handong.csee.java.hw2.converters.Convertible;
/**
  This is KMToMILEConverter class which recieves Km variable and returns mile variable*/
  public class KMToMILEConverter implements Convertible 
{
    private double kmFrom;
    private double mileTo;
    /**setFromValue is a  method implemeted from interface Convertible. Here it modifies private variable kmFrom*/
    public void setFromValue(double fromValue)
    {
        kmFrom = fromValue;
    }
    /**getConvertedValue is a  method implemeted from interface Convertible. Here it accesses private variable mileTo*/
    public double getConvertedValue()
    {
               
            return mileTo;
          
    }
    /**convert is a  method implemeted from interface Convertible. Here it converts km to miles*/
    public void convert()
    {
        
            mileTo = kmFrom/1.6;
        
    }

}
