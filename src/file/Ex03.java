package file;

import java.io.File;
import java.io.FileOutputStream;

public class Ex03 {
	public static void main(String[] args) throws Exception {
		File path = new File("D:\\핀테크 평일반 나호영\\java/abcd");

		System.out.println(path.exists());
		if (path.exists() == false) {
			path.mkdir();
		}
		FileOutputStream fos = new FileOutputStream(path + "/test.txt");

		fos.close();
		path.delete();

		String[] list = path.list();
		System.out.println(list[1]);
		for (String s : list) {
			System.out.println(s);
			if (s.equals("test.txt") == false) {
				File delete = new File(path.toString() + "/" + s);
				delete.delete();
			}
		}
	}
}