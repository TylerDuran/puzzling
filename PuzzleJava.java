import java.util.ArrayList;
import java.util.Random;
import java.util.*;

public class PuzzleJava {

    // Get the random 10 rolls 
    public void getTenRolls(ArrayList<Integer> tenRolls) {
        Random randomRoll = new Random();
        for(int i = 1; i <= 10; i++) {
            tenRolls.add(randomRoll.nextInt(20) + 1);
        }
        System.out.println(tenRolls);
    }

    // Get the random letter from the alphabet
    // Neded some help from solution video after Struggling for  40 min
    public String getRandomLetter() {
        Random randomLetter = new Random();
        String RandomAlphabetLetter = "abcdefghijklmnopqrstuvwxyz";
        String [] alphabetLetters = new String[26];
        for(int i = 0; i < 26; i++) {
            alphabetLetters[i] = String.valueOf(RandomAlphabetLetter.charAt(i));
        }
        return alphabetLetters[randomLetter.nextInt(26)];
    }

    // Generate a Password  that incorporates the previous method as well
    // Neded some help from solution video after Struggling for  40 min, i couldnt figure out how to use the method above bassed pn how i set up in my test file
    public String generatePassword() {
        String randomlyGeneratedPassword = "";
        for(int i = 0; i < 8; i++) {
            randomlyGeneratedPassword = randomlyGeneratedPassword + getRandomLetter();
        }
        return randomlyGeneratedPassword;
    }

    // Set password length // Needed alot of help on this, the video was super helpfull to follow along with
    public ArrayList<String> getNewPasswordSet(int passwordLength) {
        ArrayList<String> passwordLengthSet = new ArrayList<String>();
        for(int i = 0; i < passwordLength; i++) {
            passwordLengthSet.add(generatePassword());
        }
        return passwordLengthSet;
    }





}