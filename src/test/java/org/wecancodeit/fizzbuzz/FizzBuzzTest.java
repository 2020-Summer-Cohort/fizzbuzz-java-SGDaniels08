package org.wecancodeit.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    public void shouldInstantiate() {
        FizzBuzz underTest = new FizzBuzz();
    }

    // 1 prints "1"
    @Test
    public void input1PrintsString1() {
        // arrangement
        FizzBuzz underTest = new FizzBuzz();
        // action
        String result = underTest.say(1);
        // assertion
        assertEquals("1", result);
    }

    // 2 prints "2"
    @Test
    public void input2PrintsString2() {
        // arrangement
        FizzBuzz underTest = new FizzBuzz();
        // action
        String result = underTest.say(2);
        // assertion
        assertEquals("2", result);

    }

    // 3 prints "Fizz"
    @Test
    public void input3PrintsFizz() {
        // arrangement
        FizzBuzz underTest = new FizzBuzz();
        // action
        String result = underTest.say(3);
        // assertion
        assertEquals("Fizz", result);
    }

    @Test
    public void input4PrintsString4() {
        // arrangement
        FizzBuzz underTest = new FizzBuzz();
        // action
        String result = underTest.say(4);
        // assertion
        assertEquals("4", result);
    }

    @Test
    public void input5PrintsBuzz() {
        // arrangement
        FizzBuzz underTest = new FizzBuzz();
        // action
        String result = underTest.say(5);
        // assertion
        assertEquals("Buzz", result);
    }

    @Test
    public void input6PrintsFizz() {
        // arrangement
        FizzBuzz underTest = new FizzBuzz();
        // action
        String result = underTest.say(6);
        // assertion
        assertEquals("Fizz", result);
    }
}
