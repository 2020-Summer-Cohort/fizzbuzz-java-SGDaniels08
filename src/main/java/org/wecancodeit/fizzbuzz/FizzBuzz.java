package org.wecancodeit.fizzbuzz;


import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {
        FizzBuzz testObject = new FizzBuzz();

        System.out.println(testObject.sayWordsInRange(1,10));
    }

    public String say(int numberToTranslate) {

        if (numberToTranslate<0) {
            return "Please enter a positive number";
        }
        if (numberToTranslate%3==0 && numberToTranslate%5==0) {
            return "FizzBuzz";
        }
        if (numberToTranslate%3 == 0) {
            return "Fizz";
        }
        if (numberToTranslate%5 == 0) {
            return "Buzz";
        }
        if (numberToTranslate%11 == 0) {
            return "Bang";
        }

        return "" + numberToTranslate;
    }

    public String sayWordsInRange(int lowerBound, int upperBound) {
        String wordList = "";
        for (int i = lowerBound; i <= upperBound; i++) {
            if (say(i).equals("Fizz") || say(i).equals("Buzz") || say(i).equals("FizzBuzz")) {
                wordList += say(i);
            }
        }
        System.out.println(wordList);
        return wordList;
    }
}
