package north_p2actual;
import java.util.*;
import java.io.*;

public class Application {
	public static void main(String[] args) throws IOException {
		FileInputStream dataFile = null;
		FileOutputStream outputFile = null;
		
		dataFile = new FileInputStream("problem2.txt");
		outputFile = new FileOutputStream("unique_word_counts.txt");
		
		new DuplicateCounter().count(dataFile);
		new DuplicateCounter().write(outputFile);
		
	}

}
