package file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) throws Exception {
		File path = new File("D:\\핀테크 평일반 나호영\\java\\test/test.txt");
		FileOutputStream fos = new FileOutputStream(path);

		Scanner input = new Scanner(System.in);
		String msg = null;

		System.out.print("문자열 입력 : ");
		msg = input.next();

		fos.write(msg.getBytes());
		System.out.println("저장되었습니다.");
		fos.close();

	}
}