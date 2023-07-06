package fileinput;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileInput {

	public static void main(String[] args) {
		File f = new File("/Users/hasegawashuu/git/java-recture/src/fileinput/data.txt");
		try (BufferedReader br = new BufferedReader(new FileReader(f))) {
			String str = null;
			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
