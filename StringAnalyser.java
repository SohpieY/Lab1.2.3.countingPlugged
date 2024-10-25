//cleans and filters the dirty word list, creating a new list of words (clean word list)

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class StringAnalyser {

    public static ArrayList<String> stringAnalyser (ArrayList<String> dirtyList, String commonWordsFilePath) throws FileNotFoundException {
        //the dirtyword list is passed into the rawStrings as a file
        // Create an ArrayList to hold common words
        ArrayList<String> commonWords = new ArrayList<>();
        //creating new array list to store the common words
        File commonWordsFile = new File("/Users/apple/IdeaProjects/countingPlugged/commonWords.txt");
        //turning the common words txt into a file in IDE
        Scanner scanner = new Scanner(commonWordsFile);
        //creatign a scanner to read that commonWords file

        while(scanner.hasNext()){
            //while the scanner has a next line
            String common = scanner.next();
            //change into string
            commonWords.add(common);
            //add the string into the commonWords array list
        }

        scanner.close(); //close the scanning

        ArrayList<String> cleanWordList = new ArrayList<>(); //create a new array list to store the clean words

        for(String currentWord : dirtyList){
            if(!commonWords.contains(currentWord)){
                //if my currentWord appears in the commonWord file, then we have to remove
                cleanWordList.add(currentWord);
            }
        }

        //if common words are found in the dirtyList, then remove
        //nested for loop, outside loop for dirtyList, inside is common words
        //comparing the word in dirtyList to the comomn word
        //If found, .remove from dirtLIst

        return cleanWordList;



    }
}
