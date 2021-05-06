package edu.handong.csee.java.hw2.converters;
import edu.handong.csee.java.hw2.converters.Convertible;
/**
  This is MileToKmConverter class which recieves Mile variable and returns km variable*/
  public class MILEToKMConverter implements Convertible{
    
    private double mileFrom;
    private double kmTo;
/**setFromValue is a  method implemeted from interface Convertible. Here it modifies private variable mileFrom*/
    public void setFromValue(double fromValue)
    {
        mileFrom = fromValue;
    }
/**getConvertedValue is a  method implemeted from interface Convertible. Here it accesses private variable kmTo*/
    public double getConvertedValue()
    {
               
            return kmTo;
          
    }
     /**convert is a  method implemeted from interface Convertible. Here it converts miles to km*/
    public void convert()
    {
        
            kmTo = mileFrom*1.6;
        
    }

}
