//records each unique word and how many times it appears in the text

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Counter {

    public static List<String> getTopFiveWords(ArrayList<String> words){
        ArrayList<String> uniqueWords = new ArrayList<>();
        for(String word:words){
            if(!uniqueWords.contains(word)){
                uniqueWords.add(word);
            }
        }

        //array to hold frequencies
        int[] frequencies = new int[uniqueWords.size()];


        // Count frequencies
        for (int i = 0; i < uniqueWords.size(); i++) {
            String currentWord = uniqueWords.get(i);
            for (String word : words) {
                if (word.equals(currentWord)) {
                    frequencies[i]++;
                }
            }
        }

        // Find the top five words
        List<String> topWords = new ArrayList<>();
        for (int count = 0; count < 5; count++) {
            int maxIndex = -1;
            int maxFrequency = 0;

            for (int i = 0; i < frequencies.length; i++) {
                if (frequencies[i] > maxFrequency) {
                    maxFrequency = frequencies[i];
                    maxIndex = i;
                }
            }

            // Add the word with the highest frequency to the list
            if (maxIndex != -1) {
                topWords.add(uniqueWords.get(maxIndex));
                frequencies[maxIndex] = -1; // Mark as counted
            }
        }

        return topWords; // Return the list of top five words

    }
}
