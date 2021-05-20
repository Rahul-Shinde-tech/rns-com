import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;

public class TestResource {
	public static void main(String[] args) {
		String dataToWrite = "Hello world Im Champ for Development:";
		char[] data = dataToWrite.toCharArray();
		try {
			Writer output = new FileWriter("outputReader.txt");

			BufferedWriter brw = new BufferedWriter(output);
			// brw.write(data);
			brw.write(dataToWrite);
			brw.close();
			output.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}