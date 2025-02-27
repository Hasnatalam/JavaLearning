package com.hasnat.multithreading2;

@SuppressWarnings("serial")
public class SeatBookedExcepton extends Exception 
{
     public SeatBookedExcepton(String errorMessage)
     {
    	 super(errorMessage);
     }
}
