package com.m2p;

import org.junit.jupiter.api.Test;

import static com.m2p.LengthUnits.*;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class LengthUnitsTest {


    @Test
    void toReturnEqualityWhenOneCentimeterIsComparedWithAnotherOneCentimeter()
    {
        LengthUnits oneCentimeter = centimeter(1);
        LengthUnits anotherCentimeter = centimeter(1);

        assertThat(oneCentimeter,is(equalTo(anotherCentimeter)));
    }

    @Test
    void toReturnEqualityWhenOneMeterIsComparedWithHundredCentimeters()
    {
        LengthUnits oneMeter = meter(1);
        LengthUnits hundredCentimeters = centimeter(100);

        assertThat(oneMeter,is(equalTo(hundredCentimeters)));
    }


    @Test
    void toReturnInEqualityWhenHundredCentimetersIsComparedWithZeroPointZeroZeroOneKilometers()
    {
        LengthUnits zeroPointOneKilometer = kilometer(0.001);
        LengthUnits hundredCentimeters = centimeter(100);

        assertThat(zeroPointOneKilometer, is(equalTo(hundredCentimeters)));
    }
}
