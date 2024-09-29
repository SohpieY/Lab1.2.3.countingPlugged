//reads the words from a text file and stores them in a list (dirty word list)

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TextReader {

    public static ArrayList<String> textReader(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file); //creates a scanner from the file, lets you read it
        ArrayList<String> DirtyList = new ArrayList<>(); //creates an array list to add
        while(scanner.hasNext()){ //while scanner has next word
            String word = scanner.next(); // create a string out of the scanner

            //Clean the word: convert to lowercase and remove non-alphabetic characters
            word = word.toLowerCase().replaceAll("[^a-zA-Z]", "");
            if(!word.isEmpty()){
                DirtyList.add(word); //add to the array list
            }

        }
        scanner.close();
        return DirtyList;
    }
}
