import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Step 1: Read text from a file using TextReader
            File file = new File("/Users/apple/IdeaProjects/countingPlugged/textOne.txt");
            ArrayList<String> dirtyList = TextReader.textReader(file); // Read the dirty words

            // Step 2: Analyze the string for word frequency using StringAnalyser
            String commonWordsFilePath = "/Users/apple/IdeaProjects/countingPlugged/commonWords.txt"; // Path to common words file
            ArrayList<String> cleanWordList = StringAnalyser.stringAnalyser(dirtyList, commonWordsFilePath);
            //In the class StringAnalyser, in the method stringAnaluser, set cleanWordList to dirtyList and commonWordFile path

            // Step 3: Count the occurrences of each word using Counter
            ArrayList<Integer> counts = Counter.countWords(cleanWordList);
            String mostFrequentWord = Counter.findMostFrequentWord(cleanWordList, counts);
            int maxCount = Counter.frequentWordCount(cleanWordList, counts); // Get maximum count

            // Step 4: Print results
            System.out.println("The most frequent word is: " + mostFrequentWord);
            System.out.println("The most frequent word is: " + maxCount);

        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}