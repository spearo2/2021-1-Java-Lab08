package edu.handong.csee.java.hw2.converters;

/**
 This is interface Convertible that is implemented in different converter classes*/
public interface Convertible {


    /** setFromValue is method which is implemented in different converter classes to modify various private variables */
    public void setFromValue(double fromValue);
     /** getConvertedValue is method which is implemented in different converter classes to access various private variables */
    public double getConvertedValue();
     /** convert is method which is implemented in different converter classes to convert various input variables */
    public void convert();

}