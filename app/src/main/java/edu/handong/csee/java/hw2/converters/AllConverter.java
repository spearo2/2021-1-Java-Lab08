package edu.handong.csee.java.hw2.converters;

import javax.lang.model.util.ElementScanner14;

/**
  This is AllConverter class which recieves Km or Ton variables and returns both m/mile and km/g variables according to the input*/
public class AllConverter {
    
    private double localFrom;
    private double kgTo;
    private double gTo;
    private double mTo;
    private double mileTo;
    private String localMeasure;
    /**setFromValue will modify one of the local private variables according to the input. It returns the class type in order to chain method*/
    public AllConverter setFromValue(double fromValue)
    {
        
        localFrom = fromValue;

        return this;
    }
    /**setOriginalMeasure will modify private measure variables according to the input measure. It returns the class type in order to chain method*/
    public AllConverter setOriginalMeasure(String originalMeasure)
    {
        
        localMeasure = originalMeasure;

        return this;
    }
     /**convertAndPrintOut will recognize the input measure and conver into 2 measure variables to print. */
    public void convertAndPrintOut()
    {
        
        String s1 = "TON";
        String s2 = "KM";
        if(s1.equals(localMeasure))
        {
            
            kgTo = localFrom*1000;
            gTo = localFrom*1000000;
            
            System.out.println(localFrom+" "+localMeasure+" to "+kgTo+" KG");
            System.out.println(localFrom+" "+localMeasure+" to "+gTo+" G");
        }

        else if(s2.equals(localMeasure))
        {
            mTo = localFrom*1000;
            mileTo = localFrom/1.6;
            System.out.println(localFrom+" "+localMeasure+" to "+mTo+" M");
            System.out.println(localFrom+" "+localMeasure+" to "+mileTo+" MILE");
        }

        else
        {
            System.out.println("AllConverter cannot support the measure!");
        }
    }

}
