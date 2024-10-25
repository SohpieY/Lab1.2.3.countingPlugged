//records each unique word and how many times it appears in the text

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Counter {
    public static ArrayList<Integer> countWords(ArrayList<String> cleanWordList){
        //create an arrayList that is the cleanWordList
        ArrayList<String> countedWords = new ArrayList<>();
        //create another arrayList that stores the count
        ArrayList<Integer> count = new ArrayList();

        for(String word : cleanWordList){
            //checking the index of the word in the countedWords list (no duplicate)
            int index  = countedWords.indexOf(word);
            if(index == -1){
                //if the countedWord arrayList doesn't contain the word, then
                countedWords.add(word); // we make sure it is added, as each word needs to make appearence
                count.add(1);
                //When you add a new word to countedWords, you also add an initial count of 1 to counts at the same index
                //When you find an existing word, you use its index to access the corresponding count in counts and increment it
            } else{ //word is found
                count.set(index, count.get(index) + 1);
                //count(index, element)
                //index: The index of the element you want to replace
                //element: The new value that you want to set at the specified index.
            }

        }
        return count;



    }

    public static String findMostFrequentWord(ArrayList<String> countedWords, ArrayList<Integer> count){
        int max = 0; //we need to store the maximum count
        String  mostFrequentWord = ""; //store the most frequent word

        for(int i = 0; i < count.size(); i++){
            if(count.get(i) > max){ //if current word has more counts than the pre-existing max
                max = count.get(i); //set the new max to the current word
                mostFrequentWord = countedWords.get(i); //the most frequent word is the current word
            }
        }
        return mostFrequentWord;
        //print the result
    }

    public static int frequentWordCount(ArrayList<String> countedWords, ArrayList<Integer> count){
        int max = 0; //we need to store the maximum count

        for(int i = 0; i < count.size(); i++){
            if(count.get(i) > max){ //if current word has more counts than the pre-existing max
                max = count.get(i); //set the new max to the current word
            }
        }
        return max;
        //print the result
    }






}
