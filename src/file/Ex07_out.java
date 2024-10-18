package file;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Ex07_out {
	public static void main(String[] args) throws Exception {
		TestDTO dto = new TestDTO();
		dto.setName("홍길동");
		dto.setAge(20);

		FileOutputStream fos = new FileOutputStream(CommonPath.PATH + "test.txt");

		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(dto);
		oos.close();
		fos.close();

	}
}