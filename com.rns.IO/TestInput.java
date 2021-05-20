import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestInput
{
	public static void main(String args[]) {
			char[] data = new char[200];
			try {
				Reader input = new FileReader("D:\\rns-com\\com.rns.IO\\outputReader.txt");
				BufferedReader reader = new BufferedReader(input);

				String line;
				int countWord = 0;
				int sentenceCount = 0;
				int characterCount = 0;
				int paragraphCount = 1;
				int whitespaceCount = 0;

				// Reading line by line from the
				// file until a null is returned
				while ((line = reader.readLine()) != null) {
					if (line.equals("")) {
						paragraphCount++;
					} else {
						characterCount += line.length();

						// \\s+ is the space delimiter in java
						String[] wordList = line.split("\\s+");

						countWord += wordList.length;
						whitespaceCount += countWord - 1;

						// [!?.:]+ is the sentence delimiter in java
						String[] sentenceList = line.split("[!?.:]+");
						sentenceCount += sentenceList.length;

					}
				}

				System.out.println("Total word count = " + countWord);
				System.out.println("Total number of sentences = " + sentenceCount);
				System.out.println("Total number of characters = " + characterCount);
				System.out.println("Number of paragraphs = " + paragraphCount);
				System.out.println("Total number of whitespaces = " + whitespaceCount);

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}

		
	}
}


/* OUTPUT 

D:\rns-com\com.rns.IO>javac TestInput.java

D:\rns-com\com.rns.IO>java TestInput
Total word count = 6
Total number of sentences = 1
Total number of characters = 37
Number of paragraphs = 1
Total number of whitespaces = 5

D:\rns-com\com.rns.IO>




*/