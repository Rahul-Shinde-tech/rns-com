
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FileInput {
	public static void main(String args[]) {

        byte[] array = new byte[100];

        try {
            //File file = new File();
            InputStream input = new FileInputStream("D:\\rns-com\\com.rns.IO\\outputreader.txt");
            System.out.println("Available bytes in the file: " + input.available());
            // Read byte from the input stream
            input.read(array);
            System.out.println("Data read from the file: ");

            // Convert byte array into string
            String data = new String(array);
            System.out.println(data);

            String[] words = data.split("\\s+");
            System.out.println("Total words :"+ words.length);

            int numOfChars = 0;
            for (String s : words)
                numOfChars += s.length();

            System.out.println("Total characters :"+ numOfChars);

            char[] chars = data.toCharArray();
            int noOfLine = 0;
            for (char c : chars) {
                if (c == '\n')
                    noOfLine++;
            }
            System.out.println("Total lines :"+noOfLine);

            System.out.println("Occurance of Java : "+getOccurance(words, "Java"));
            System.out.println(isWordPresent(words, "heritage"));
            // Close the input stream
            input.close();

//            OutputStream out = new FileOutputStream("output.txt");
//
//            String dataToWrite = "Hi java developers";
//            out.write(dataToWrite.getBytes(StandardCharsets.UTF_8));
//            out.close();
        }
        catch (Exception e) {
            e.getStackTrace();
        }
    }

    public static int getOccurance(String[] words, String word)
    {
        int res = 0;
        for (String wrd : words)
            wrd.trim();
        List<String> listOfWords = Arrays.asList(words);
        System.out.println(listOfWords);
        res = Collections.frequency(listOfWords, word);
        return res;
    }

    public static boolean isWordPresent(String[] words, String word)
    {
        List<String> listOfWords = Arrays.asList(words);
        return listOfWords.contains(word);
    }


}

/*Output 

D:\rns-com\com.rns.IO>javac FileInput.java

D:\rns-com\com.rns.IO>java FileInput
Available bytes in the file: 37
Data read from the file:
Hello world Im Champ for Development:
Total words :6
Total characters :95
Total lines :0
[Hello, world, Im, Champ, for, Development:                                                               ]
Occurance of Java : 0
false


*/
