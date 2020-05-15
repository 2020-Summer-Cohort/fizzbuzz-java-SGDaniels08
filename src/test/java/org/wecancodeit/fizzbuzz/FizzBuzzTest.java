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

    @Test
    public void input7Prints7() {
        // arrangement
        FizzBuzz underTest = new FizzBuzz();
        // action
        String result = underTest.say(7);
        // assertion
        assertEquals("7", result);
    }

    @Test
    public void input8Prints8() {
        // arrangement
        FizzBuzz underTest = new FizzBuzz();
        // action
        String result = underTest.say(8);
        // assertion
        assertEquals("8", result);
    }

    @Test
    public void input9PrintsFizz() {
        // arrangement
        FizzBuzz underTest = new FizzBuzz();
        // action
        String result = underTest.say(9);
        // assertion
        assertEquals("Fizz", result);
    }

    @Test
    public void input10PrintsBuzz() {
        // arrangement
        FizzBuzz underTest = new FizzBuzz();
        // action
        String result = underTest.say(10);
        // assertion
        assertEquals("Buzz", result);
    }

    @Test
    public void input11PrintsBang() {
        // arrangement
        FizzBuzz underTest = new FizzBuzz();
        // action
        String result = underTest.say(11);
        // assertion
        assertEquals("Bang", result);
    }

    @Test
    public void input12PrintsFizz() {
        // arrangement
        FizzBuzz underTest = new FizzBuzz();
        // action
        String result = underTest.say(12);
        // assertion
        assertEquals("Fizz", result);
    }

    @Test
    public void input15PrintsFizzBuzz() {
        // arrangement
        FizzBuzz underTest = new FizzBuzz();
        // action
        String result = underTest.say(15);
        // assertion
        assertEquals("FizzBuzz", result);
    }

    @Test
    public void input18PrintsFizz() {
        // arrangement
        FizzBuzz underTest = new FizzBuzz();
        // action
        String result = underTest.say(18);
        // assertion
        assertEquals("Fizz", result);
    }

    @Test
    public void input20PrintsBuzz() {
        // arrangement
        FizzBuzz underTest = new FizzBuzz();
        // action
        String result = underTest.say(20);
        // assertion
        assertEquals("Buzz", result);
    }

    @Test
    public void input21PrintsFizz() {
        // arrangement
        FizzBuzz underTest = new FizzBuzz();
        // action
        String result = underTest.say(21);
        // assertion
        assertEquals("Fizz", result);
    }

    @Test
    public void input90PrintsFizzBuzz() {
        // arrangement
        FizzBuzz underTest = new FizzBuzz();
        // action
        String result = underTest.say(90);
        // assertion
        assertEquals("FizzBuzz", result);
    }
    @Test
    public void check1Through10GivesFizzBuzzFizzFizzBuzz() {
        // arrangement
        FizzBuzz underTest = new FizzBuzz();
        // action
        String resultList = underTest.sayWordsInRange(1, 10);
        // assertion
        assertEquals("FizzBuzzFizzFizzBuzz", resultList);
    }

    @Test
    public void check15Through30GivesFizzBuzzFizzBuzzFizzFizzBuzzFizzFizzBuzz () {
        // arrangement
        FizzBuzz underTest = new FizzBuzz();
        // action
        String resultList = underTest.sayWordsInRange(15, 30);
        // assertion
        assertEquals("FizzBuzzFizzBuzzFizzFizzBuzzFizzFizzBuzz", resultList);
    }

    @Test
    public void inputNeg1GivesMessageNeedPositive() {
        // arrangement
        FizzBuzz testObject = new FizzBuzz();
        // action
        String result = testObject.say(-1);
        // assertion
        assertEquals("Please enter a positive number", result);
    }
}