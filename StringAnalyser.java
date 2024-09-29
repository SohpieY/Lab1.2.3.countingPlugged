//cleans and filters the dirty word list, creating a new list of words (clean word list)

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class StringAnalyser {

    public static ArrayList<String> stringAnalyser (ArrayList<String> rawStrings, String commonWordsFilePath) throws FileNotFoundException {
        // Create an ArrayList to hold common words
        ArrayList<String> commonWords = new ArrayList<>();
        File commonWordsFile = new File(commonWordsFilePath);
        Scanner scanner = new Scanner(commonWordsFile);

        while(scanner.hasNextLine()){
            String common = scanner.nextLine().trim();
            if(!common.isEmpty()){
                commonWords.add(common.toLowerCase());
                // Store in lowercase for case-insensitive comparison

            }
        }

        scanner.close();

        ArrayList<String> cleanWordList = new ArrayList<>();

        for(String dirtyWord:rawStrings){
            if(!commonWords.contains(dirtyWord.toLowerCase())){
                cleanWordList.add(dirtyWord);
            }
        }

        //if common words are found in the dirtyList, then remove
        //nested for loop, outside loop for dirtyList, inside is common words
        //comparing the word in dirtyList to the comomn word
        //If found, .remove from dirtLIst

        return cleanWordList;



    }
}
