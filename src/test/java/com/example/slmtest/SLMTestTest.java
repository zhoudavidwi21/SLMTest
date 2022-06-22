package com.example.slmtest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SLMTestTest {

    SLMTest slmTest = new SLMTest();

    @Test
    void ozToGTest(){
        //Arrange
        double a = 1.;

        double expected = 28.35;

        //Act
        double result = slmTest.ounceToGram(1);

        //Assert
        //is expected == result
        assertEquals(expected, result);
    }
}
