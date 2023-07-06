package fileinput;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		File f = new File("/Users/hasegawashuu/git/java-recture/src/fileinput/data.txt");
		try(FileWriter fw = new FileWriter(f, true)) {
			fw.write("こんにちは\r\n");
		} catch(IOException e) {
		System.out.println(e.getMessage());
		}
		
		System.out.println("end");

	}

}
