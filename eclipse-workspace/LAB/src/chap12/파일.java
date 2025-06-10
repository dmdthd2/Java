package chap12;

import java.io.File;
import java.io.FileOutputStream;

public class 파일 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("은송구구단.txt");
		
		try {
		if(!f.exists()) {
			f.createNewFile();	
			System.out.println("생성되었어요!");
			FileOutputStream fos = new FileOutputStream(f);
			for(int i=2; i<10; i++) {
				for(int j=1; j<10; j++) {
					String str=i+"X"+j+"="+ i*j+"\n";
					byte[]b=str.getBytes();
					fos.write(b);
					
				}
			}fos.close();
			System.out.println("파일쓰기 성공");
		}
		}catch(Exception e) {
			e.getMessage();
		}
		
	}

}
