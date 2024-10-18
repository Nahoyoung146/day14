package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Ex01 {
	public static void main(String[] args) throws Exception {
		File path = new File("D:\\핀테크 평일반 나호영\\java\\test/test.txt");
		String sPath = "D:/핀테크 평일반 나호영/java/test"; // \\는 /으로 혼용가능

		FileOutputStream fos = new FileOutputStream(path);
		fos.write(97);
		fos.write('A');
		fos.write("test".getBytes());

		fos.close();
	}
}