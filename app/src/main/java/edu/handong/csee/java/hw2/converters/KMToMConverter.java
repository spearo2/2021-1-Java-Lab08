package edu.handong.csee.java.hw2.converters;
import edu.handong.csee.java.hw2.converters.Convertible;
/**
  This is KMToMConverter class which recieves Km variable and returns m variable*/
public class KMToMConverter implements Convertible
{
    private double kmFrom;
    private double mTo;
/**setFromValue is a  method implemeted from interface Convertible. Here it modifies private variable kmFrom */
    public void setFromValue(double fromValue)
    {
        kmFrom = fromValue;
    }
/**getConvertedValue is a  method implemeted from interface Convertible. Here it accesses private variable mTo */
    public double getConvertedValue()
    {
               
            return mTo;
          
    }
    /**convert is a  method implemeted from interface Convertible. Here it converts km to meter */
    public void convert()
    {
        
            mTo = kmFrom*1000;
        
    }

    





} 