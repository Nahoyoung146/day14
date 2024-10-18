package file;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Ex05 {
	public static void main(String[] args) throws Exception {
		File path = new File(CommonPath.PATH + "test.txt");
		FileOutputStream fos = new FileOutputStream(path);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		for (char ch = '0'; ch <= '9'; ch++) {
			Thread.sleep(1000);
			bos.write(ch);
		}
		bos.close();
		fos.close();
	}
}