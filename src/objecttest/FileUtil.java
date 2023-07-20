package objecttest;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class FileUtil {

	public void fileWriter(String filePath, List<String> texts) {
		try {
			FileWriter file = new FileWriter(filePath);
			PrintWriter pw = new PrintWriter(new BufferedWriter(file));

			for (String s : texts) {
				pw.println(s);
			}

			pw.close();

		} catch (IOException e) {
			e.printStackTrace();

		}

	}
}
