package north_p1;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Application {
   public static void main(String[] args) throws IOException {
	   FileInputStream dataFile = null;
	   FileOutputStream outputFile = null;
	   
	   dataFile = new FileInputStream("problem1.txt");
	   outputFile = new FileOutputStream("unique_words.txt");
	   System.out.println("New file made");
	   
	   new DuplicateRemover().remove(dataFile);
	   new DuplicateRemover().write(outputFile);
	   
	   
	   
	   }
	}
