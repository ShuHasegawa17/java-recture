package shukudai.file;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class FileOperation {

	public static void main(String[] args) {
		Scanner sc = null;
		Scanner sc2 = null;
		try {

			while (true) {
				System.out.println("以下を入力してください。");
				System.out.println("1:書き込み、2:表示、左記以外：終了");

				int num;
				sc = new Scanner(System.in);
				try {
					num = sc.nextInt();
				} catch (Exception e) {
					System.out.println(e.getMessage());
					break;
				}

				if (num > 2) {
					break;
				}
				FileUtil fileUtil = new FileUtil();

				if (num == 1) {
					System.out.println("書き込む文字列を入力してください");
					String message;
					sc2 = new Scanner(System.in);
					try {
						message = sc.next();
						fileUtil.write(message);
						System.out.println("書き込みました");
					} catch (Exception e) {
						System.out.println(e.getMessage());
						break;
					}

				} else {
					List<String> messages;
					try {
						messages = fileUtil.read();
						for (String msg : messages) {
							System.out.println(msg);
						}
					} catch (IOException e) {
						System.out.println(e.getMessage());

						break;
					}

				}
			}
		} finally {
			if (sc != null) {
				sc.close();
			}
			if (sc2 != null) {
				sc2.close();
			}
		}

		System.out.println("終了しました");

	}

}
