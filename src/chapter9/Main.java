package chapter9;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

public class Main {
	public static void main(String[] args) throws Exception {
		String inFile = args[0];
		String outFile = args[1];
		FileInputStream fis = null;
		GZIPOutputStream gzos = null;
		try {
			fis = new FileInputStream(inFile);
			FileOutputStream fos = new FileOutputStream(outFile);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			gzos = new GZIPOutputStream(bos);
			System.out.println("コピーを作成します。");
			int i = fis.read();
			while(i != -1) {
				gzos.write(i);
				i = fis.read();
			}
			System.out.println("コピーが終了しました。");
			gzos.flush();
			gzos.close();
			fis.close();
		} catch(IOException e) {
			System.err.println("ファイル操作に失敗しました。");
			try {
				if(fis != null) {
					fis.close();
				}
				if(gzos != null) {
					gzos.close();
				}
			} catch(IOException ee) { }
		}
	}
}
