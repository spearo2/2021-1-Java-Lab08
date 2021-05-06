package edu.handong.csee.java.hw2.converters;
import edu.handong.csee.java.hw2.converters.Convertible;
/**
  This is TonToKgConverter class which recieves Ton variable and returns kg variable*/
  public class TONToKGConverter implements Convertible{
    
    private double tonFrom;
    private double kgTo;
/**setFromValue is a  method implemeted from interface Convertible. Here it modifies private variable tonFrom*/
    public void setFromValue(double fromValue)
    {
        tonFrom = fromValue;
    }
/**getConvertedValue is a  method implemeted from interface Convertible. Here it accesses private variable kgTo*/
    public double getConvertedValue()
    {
               
            return kgTo;
          
    }
     /**convert is a  method implemeted from interface Convertible. Here it converts ton to kg*/
    public void convert()
    {
        
            kgTo = tonFrom*1000;
        
    }
}
