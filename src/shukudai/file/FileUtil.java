package shukudai.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {
	
	public static final String FILE_PATH = "src/shukudai/file/data.txt";
	
	public List<String> read() throws IOException {
		File file = new File(FILE_PATH);
		List<String> messages = new ArrayList<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(file))) {
			String msg = null;
			while((msg = br.readLine()) != null) {
				messages.add(msg);
			}
			
		} catch(IOException e) {
			System.out.println(e.getMessage());
			throw e;
		}
		
		return messages;
	}
	
	public void write(String message) throws IOException {
		File file = new File(FILE_PATH);
		try(PrintWriter pw = new PrintWriter(new FileWriter(file, true))) {
			pw.println(message);
			
		} catch(IOException e) {
			System.out.println(e.getMessage());
			throw e;
		}
	}

}
