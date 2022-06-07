import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.*;

public class TestPuzzle {

    public static void main(String[] args) {

        // Creating an instance 
        PuzzleJava appTest = new PuzzleJava();

        /* ============ App Test Cases ============= */

        // Get the random 10 rolls 
        ArrayList<Integer> randomTenNumbers = new ArrayList<Integer>();
        appTest.getTenRolls(randomTenNumbers);

        // Get the random letter from the alphabet
        // String RandomAlphabetLetter = "abcdefghijklmnopqrstuvwxyz";
        // had to not use the way i was doing it above, seems like passing values was conflicting when trying to use the method in other methods 
        System.out.println(appTest.getRandomLetter());

        // Generate a Password 
        // HAd to reference walkthrough vid to understand how to get these two methods to work together
        System.out.println(appTest.generatePassword());

        // Get Password by setting the length you want  
        int randomPasswordLenght = 8;
        appTest.getNewPasswordSet(randomPasswordLenght);







    }





}