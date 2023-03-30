package com.m2p;

public class Centimeter {

    private final double magnitude;

    public  Centimeter(double magnitude)
    {
        this.magnitude = magnitude;
    }

    public static Centimeter meterToCentiMeter(double magnitude)
    {
        return new Centimeter(magnitude * 100);
    }

    public static Centimeter kilometerToCentiMeter(double magnitude)
    {
        return new Centimeter(magnitude * 1000_00);
    }

    @Override
    public boolean equals(Object otherObject)
    {
        if(this == otherObject)
        {
            return true;
        }
        if(getClass() != otherObject.getClass())
        {
            return false;
        }

        return magnitude == ((Centimeter) otherObject).magnitude;
    }
}
