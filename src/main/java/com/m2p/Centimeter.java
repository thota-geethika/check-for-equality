package com.m2p;

public class Centimeter {

    private final double magnitude;

    public  Centimeter(double magnitude)
    {
        this.magnitude = magnitude;
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
