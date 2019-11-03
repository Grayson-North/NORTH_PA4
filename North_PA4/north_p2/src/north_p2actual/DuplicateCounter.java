package north_p2actual;
import java.util.*;
import java.io.*;


public class DuplicateCounter {
	HashMap<String, Integer> wordCounter = new HashMap<String, Integer>();
	public void count(FileInputStream dataFile) throws IOException {
		Scanner reader = null;
		String word;
		Integer wordNum = 1;
		
		reader = new Scanner(dataFile);
		
		while(reader.hasNext()) {
			word = reader.next();
			if(!(wordCounter.containsKey(word))){
				wordCounter.put(word, wordNum);	
			}
			else {
				wordCounter.put(word, wordNum + 1);
			}
			
		}
		
		dataFile.close();
	}
	
	public void write(FileOutputStream outputFile) throws IOException {
		PrintWriter writer = null;
		writer = new PrintWriter(outputFile);
		
		writer.println(wordCounter);
		writer.flush();
		
		outputFile.close();
	}

}
