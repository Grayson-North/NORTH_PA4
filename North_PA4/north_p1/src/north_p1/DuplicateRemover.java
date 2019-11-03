package north_p1;
import java.util.*;
import java.io.*;


public class DuplicateRemover {
	HashSet<String> uniqueWords = new HashSet<String>();
	public void remove(FileInputStream dataFile) throws IOException {
		Scanner reader = null;
		String word;
		
		//System.out.println("Opening file: problem1.txt");
		
		reader = new Scanner(dataFile);
		
		//System.out.println("Reading and printing strings.");
		
		while(reader.hasNext())
		{
			word = reader.next();
			uniqueWords.add(word);
		}
		
		
	
		//System.out.print(uniqueWords);

		//System.out.println();
		
		//System.out.println("Closing file problem1.txt");
		
		dataFile.close();
		

	}
	
	public void write(FileOutputStream outputFile) throws IOException {
		PrintWriter writer = null;
		writer = new PrintWriter(outputFile);
		
		writer.println(uniqueWords);
		writer.flush();
		
		outputFile.close();
		
	}

}
