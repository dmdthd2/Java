package chap12;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class 파일실험 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f =new File("은송테스트.txt");
		
		try {
			if(!f.exists()) {
				f.createNewFile();
				FileOutputStream fo= new FileOutputStream(f);
				System.out.println("만드럿다.");
				
				String str ="테스트라기 보단 실습 ㅋㅋ";
				byte[]dmdthd=str.getBytes();
				fo.write(dmdthd);
				fo.close();
			}else if(f.exists()) {
				int data;
				byte []b =new byte[1024];
				FileInputStream fi= new FileInputStream(f);
				while((data=fi.read(b))!=-1) {
					System.out.print(new String(b, 0, data));
				}
			}
			}catch(Exception e) {
				e.getMessage();
		}
		
	}
}
