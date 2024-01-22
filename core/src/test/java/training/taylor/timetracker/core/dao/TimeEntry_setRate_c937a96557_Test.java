/*
Test generated by RoostGPT for test roost-test using AI Type Open AI and AI Model gpt-4

1. Scenario: Set Rate with Positive Value
   Test to check if the rate gets correctly set when a positive float value is passed to the setRate function.

2. Scenario: Set Rate with Zero Value
   Test to check if the rate gets correctly set when zero is passed to the setRate function. 

3. Scenario: Set Rate with Negative Value
   Test to check how the setRate function responds when a negative value is passed. The rate should ideally not be negative.

4. Scenario: Set Rate with Null Value
   Test to check the response of the setRate function when null is passed. The function should ideally throw a NullPointerException or handle the null input gracefully.

5. Scenario: Set Rate with Non-numeric String Value
   Test to check the response of the setRate function when a non-numeric string is passed. The function should ideally throw a ClassCastException or handle the error gracefully.

6. Scenario: Set Rate with Large Float Value
   Test to check if the setRate function can handle large float values. This will test if the function can handle values larger than what can be stored in a float variable.

7. Scenario: Set Rate with Decimal Value
   Test to check if the setRate function correctly sets the value when a decimal number is passed.

8. Scenario: Set Rate with Maximum Float Value
   Test to check the response of the setRate function when the maximum float value is passed. This will test the upper limit of the function.

9. Scenario: Set Rate with Minimum Float Value
   Test to check the response of the setRate function when the minimum float value is passed. This will test the lower limit of the function.

10. Scenario: Set Rate with Float Value having Many Decimal Points
    Test to check if the setRate function correctly sets the value when a float value with many decimal points is passed. This will test the precision of the function.

11. Scenario: Set Rate Multiple Times
    Test to check if the setRate function correctly updates the rate when called multiple times. This will test the state management of the function.
*/
package training.taylor.timetracker.core.dao;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TimeEntry {

    private String description;
    private float rate;
    private int time;

    public String getDescription() {
        return description;
    }

    public void setDescription(String value) {
        this.description = value;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float value) {
        this.rate = value;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int value) {
        this.time = value;
    }

    @Override
    public String toString() {
        return "TimeEntry{" + "description='" + description + '\'' + ", rate=" + rate + ", time=" + time + '}';
    }
}

class TimeEntry_setRate_c937a96557_Test {

    private TimeEntry timeEntry;

    @Before
    public void setUp() throws Exception {
        timeEntry = new TimeEntry();
    }

    @Test
    public void testSetRatePositive() {
        float rate = 10.0f;
        timeEntry.setRate(rate);
        assertEquals(rate, timeEntry.getRate(), 0.01);
    }

    @Test
    public void testSetRateZero() {
        float rate = 0.0f;
        timeEntry.setRate(rate);
        assertEquals(rate, timeEntry.getRate(), 0.01);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRateNegative() {
        float rate = -10.0f;
        timeEntry.setRate(rate);
    }

    @Test
    public void testSetRateLargeFloat() {
        float rate = Float.MAX_VALUE;
        timeEntry.setRate(rate);
        assertEquals(rate, timeEntry.getRate(), 0.01);
    }

    @Test
    public void testSetRateDecimal() {
        float rate = 10.5f;
        timeEntry.setRate(rate);
        assertEquals(rate, timeEntry.getRate(), 0.01);
    }

    @Test
    public void testSetRateMaxFloat() {
        float rate = Float.MAX_VALUE;
        timeEntry.setRate(rate);
        assertEquals(rate, timeEntry.getRate(), 0.01);
    }

    @Test
    public void testSetRateMinFloat() {
        float rate = Float.MIN_VALUE;
        timeEntry.setRate(rate);
        assertEquals(rate, timeEntry.getRate(), 0.01);
    }

    @Test
    public void testSetRateManyDecimalPoints() {
        float rate = 10.123456789f;
        timeEntry.setRate(rate);
        assertEquals(rate, timeEntry.getRate(), 0.01);
    }

    @Test
    public void testSetRateMultipleTimes() {
        float rate1 = 10.0f;
        float rate2 = 20.0f;
        timeEntry.setRate(rate1);
        timeEntry.setRate(rate2);
        assertEquals(rate2, timeEntry.getRate(), 0.01);
    }
}
