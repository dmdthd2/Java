package chap12;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Scanner;

public class 파일2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File f = new File("WE.txt");
		try {
			if (!f.exists()) {
				f.createNewFile();

				FileWriter fw = new FileWriter(f);
				Scanner sc = new Scanner(System.in);
				boolean t = true;
				while (t) {
					System.out.print("아이디: ");
					String s1 = sc.next();
					fw.write("아이디: " + s1 + " ");

					System.out.print("이름: ");
					String s2 = sc.next();
					fw.write("이름: " + s2 + "\n");

					System.out.println("계속 진행할래? Y|N");
					String s3 = sc.next();

					if (s3.toUpperCase().equals("Y")) {
						t = true;
					}

					else if (s3.toUpperCase().equals("N")) {
						t = false;
						System.out.println("종료");
					}

				}

			}
			
		} catch (Exception e) {
			e.getMessage();
		}
	}

}
