package com.m2p;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class CentimeterTest {


    @Test
    void toReturnEqualityWhenOneCentimeterIsComparedWithAnotherOneCentimeter()
    {
        Centimeter oneCentimeter = new Centimeter(1);
        Centimeter anotherCentimeter = new Centimeter(1);

        assertThat(oneCentimeter,is(equalTo(anotherCentimeter)));
    }
}
