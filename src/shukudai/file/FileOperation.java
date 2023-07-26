package shukudai.file;

import java.util.List;
import java.util.Scanner;

public class FileOperation {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			while (true) {
				System.out.println("以下を入力してください。");
				System.out.println("1:書き込み、2:表示、左記以外：終了");

				int num = sc.nextInt();

				if (num > 2) {
					break;
				}
				FileUtil fileUtil = new FileUtil();

				if (num == 1) {
					System.out.println("書き込む文字列を入力してください");
					
					String message = sc.next();
					fileUtil.write(message);
					System.out.println("書き込みました");

				} else {
					List<String>  messages = fileUtil.read();
					for (String msg : messages) {
						System.out.println(msg);
					}
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println("終了しました");

	}

}
