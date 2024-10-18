package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Ex04 implements CommonPath {
	public static void main(String[] args) throws Exception {
		System.out.println(CommonPath.PATH);
		System.out.println(PATH);
		Scanner input = new Scanner(System.in);
		String fileName = input.next(); // 홍길동

		// D:\\핀테크 평일반 나호영\\java\\test\\홍길동.txt
		File file = new File(PATH + fileName + ".txt");
		if (file.exists())
			System.out.println("존재하는 파일입니다. 수정으로 가세요");
		else {
			FileOutputStream fos = new FileOutputStream(file);
			System.out.print("출력할 내용 작성 : ");
			String msg = input.next();
			fos.write(msg.getBytes());
			System.out.println("저장되었습니다.");
			fos.close();
		}

		System.out.print("확인할 파일명 입력 : ");
		fileName = input.next();
		File inputFile = new File(PATH + fileName + ".txt");
		if (inputFile.exists()) {
			FileInputStream fis = new FileInputStream(inputFile);
			while (true) {
				int res = fis.read();
				if (res != -1)
					System.out.println("res => " + (char) res);

				else
					break;

				System.out.println("res : " + res);
			}

		} else
			System.out.println("해당 파일은 없음!!!");
	}
}