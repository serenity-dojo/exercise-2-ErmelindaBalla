package com.serenitydojo.datatypes;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class WhenWorkingWithFloatingPointNumbers {

    //
    // Exercise 1: Convert 27 degrees Celcius to Farenheit
    // The equation is: farenheit = (9 / 5) * celcius + 32
    //
    @Test
    public void convertToFarenheit() {
        double celcius = 27.0F;
        float fahrenheit = 0.0F;

        float finalfarenheit = (float) (((celcius * 9) / 5) + 32);

        System.out.println("finalfahrenheit= " + finalfarenheit);


        // TODO: Use a floating point calculation to calculate the fahrenheit equivalent of the celcius value.

        assertThat(finalfarenheit, equalTo(80.6F));
    }

    //
    // Exercise 2: Convert kilograms to pounds
    // There are 2.20462 pounds in a kilogram
    //
    @Test
    public void convertKilogramsToPounds() {
        int weightInKilograms = 50;
        double weightInPounds = weightInKilograms * 2.20462;

        System.out.println("weightInPounds = " + weightInPounds);


        // TODO: Use a floating point calculation to calculate the correct weight in pounds

        assertThat(weightInPounds, equalTo(110.231));

    }
}
