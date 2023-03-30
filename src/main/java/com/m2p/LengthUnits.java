package com.m2p;

public class LengthUnits {


    private final double magnitude;
    private final Unit unit;

    private static class Unit{
        static final Unit cm = new Unit(0.01);
        static final Unit m = new Unit(1);
        static final Unit km = new Unit(1000);
        private final double baseFactor;
        private Unit(double baseFactor) {
            this.baseFactor = baseFactor;
        }
    }

    public static LengthUnits meter(double magnitude)
    {
        return new LengthUnits(magnitude, Unit.m);
    }

    public static LengthUnits centimeter(double magnitude)
    {
        return new LengthUnits(magnitude, Unit.cm);
    }

    public static LengthUnits kilometer(double magnitude)
    {
        return new LengthUnits(magnitude, Unit.km);
    }

    public LengthUnits(double magnitude, Unit unit)
    {
        this.magnitude = magnitude;
        this.unit = unit;
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

        return convertToBaseUnit() == ((LengthUnits)otherObject).convertToBaseUnit();
    }

    private double convertToBaseUnit()
    {
        return magnitude * (unit.baseFactor);
    }
}
