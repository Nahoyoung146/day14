package file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class Ex07_in {
	public static void main(String[] args) throws Exception {
		TestDTO dto = null;
		System.out.println("전 dto : " + dto);

		FileInputStream fis = new FileInputStream(CommonPath.PATH + "test.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
//		Object obj = ois.readObject();
//		dto = (TestDTO) obj;
		dto = (TestDTO) ois.readObject();
		System.out.println("후 : " + dto);
		System.out.println("이름 : " + dto.getName());
		System.out.println("나이 : " + dto.getAge());

		ois.close();
		fis.close();
	}
}