package com.m2p;

import org.junit.jupiter.api.Test;

import static com.m2p.Centimeter.*;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class CentimeterTest {


    @Test
    void toReturnEqualityWhenOneCentimeterIsComparedWithAnotherOneCentimeter()
    {
        Centimeter oneCentimeter = new Centimeter(1);
        Centimeter anotherCentimeter = new Centimeter(1);

        assertThat(oneCentimeter,is(equalTo(anotherCentimeter)));
    }

    @Test
    void toReturnEqualityWhenOneMeterIsComparedWithHundredCentimeters()
    {
        Centimeter oneMeter = meterToCentiMeter(1);
        Centimeter hundredCentimeters = new Centimeter(100);

        assertThat(oneMeter,is(equalTo(hundredCentimeters)));
    }

    // toReturnEqualityWhenOneMeterIsComparedWithHundredCentimeters
    @Test
    void toReturnInEqualityWhenHundredCentimetersIsComparedWith0Point1Kilometers()
    {
        Centimeter zeroPointOneKilometer = kilometerToCentiMeter(0.1);
        Centimeter hundredCentimeters = new Centimeter(100);

        assertThat(zeroPointOneKilometer, is(not(equalTo(hundredCentimeters))));
    }
}
