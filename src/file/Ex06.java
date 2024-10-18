package file;

import java.io.*;

public class Ex06 {
	public static void main(String[] args) throws Exception {
		File path = new File(CommonPath.PATH + "test.txt");

		FileOutputStream fos = new FileOutputStream(path);
		DataOutputStream dos = new DataOutputStream(fos);

		FileInputStream fis = new FileInputStream(path);
		DataInputStream dis = new DataInputStream(fis);

		String msg = "내용 저장합니다.";
		dos.writeUTF(msg);
		dos.close();
		fos.close();
		String result = dis.readUTF();
		System.out.println("가져온 내용 : " + result);
		dis.close();
		fis.close();
	}
}