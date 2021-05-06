package edu.handong.csee.java.hw2.converters;
import edu.handong.csee.java.hw2.converters.Convertible;
/**
  This is TonToGConverter class which recieves Ton variable and returns G variable*/
  public class TONToGConverter implements Convertible{
    
    private double tonFrom;
    private double gTo;
/**setFromValue is a  method implemeted from interface Convertible. Here it modifies private variable tonFrom*/
    public void setFromValue(double fromValue)
    {
        tonFrom = fromValue;
    }
/**getConvertedValue is a  method implemeted from interface Convertible. Here it accesses private variable gTo*/
    public double getConvertedValue()
    {
               
            return gTo;
          
    }
     /**convert is a  method implemeted from interface Convertible. Here it converts ton to gram*/
    public void convert()
    {
        
            gTo = tonFrom*1000000;
        
    }
}
