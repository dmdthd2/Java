package chap12;
import java.io.File;
import java.io.FileInputStream;

public class 파일읽기 {

	public static void main(String[] args) {
		File f = new File("구구단.txt");
		try {
			if(f.exists()) {
				f.createNewFile();
				
				FileInputStream fis = new FileInputStream(f);
				int i = 0;
				
				while((i=fis.read())!=-1) {
					System.out.println((char)i);
				}fis.close();
				System.out.println("파일 읽기 성공");

			}
		}catch(Exception e) {
			e.getCause();
		}
		

	}

}