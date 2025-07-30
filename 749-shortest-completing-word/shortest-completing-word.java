import java.util.*;

class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
       /*  //Step 1: Count frequency of letters in licensePlate (ignoring digits and spaces)
        int[] targetFreq = new int[26];
        for(char ch: licensePlate.toCharArray()) { 
            if(Character.isLetter(ch)) { //searches for a-z range
                targetFreq[Character.toLowerCase(ch) - 'a']++; //When we do char - a actually we are insertin values at the index for each letter to count them
            }
        }

        String result = null;

        //Step 2: Check each word
        for(String word: words) {
            int[] wordFreq = new int[26];
            for(char ch : word.toCharArray()) {
                wordFreq[ch - 'a']++;
            }

            boolean isValid = true;
            for(int i=0; i<26; i++) {
                if(wordFreq[i] < targetFreq[i]) {
                    isValid = false;
                    break;
                }
            }

            //Step 3: Update result if valid and shorter
            if(isValid && (result == null || word.length() < result.length())) {
                result = word;
            }
        }

        return result; */
        int[] targetFreq = new int[26];
        for(char ch: licensePlate.toCharArray()) {
            if(Character.isLetter(ch)) {
                targetFreq[Character.toLowerCase(ch)-'a']++;
            }
        }

        String result = null;
        for(String word: words) {

            int[] wordFreq = new int[26];
            for(char ch: word.toCharArray()) {
                wordFreq[ch-'a']++;
            }
        
        boolean isValid = true;
        for(int i=0; i<26; i++) {
            if(wordFreq[i] < targetFreq[i]) {
                isValid = false;
                break;
            }
        }

        if(isValid && (result == null || word.length() < result.length())) {
            result = word;
        }             
        }        

        return result;   
        //Steps
        //We are given a String licensePlate and an array of Strings words
        //We need to find the shortest word from words[] that contains all characters from licensePlates
        //to do this we will first create an array targetFre such that it will be of size 26 for each small letter and then we will increment value at each index for its count
        //then we will traverse through each of word from words and then compare it with targetFreq and if we find any inappropriate case then we will just break the loop and will go for next iteration
        //But if the word is better than previous result content then we will assign it to result
        //return result
    }
}