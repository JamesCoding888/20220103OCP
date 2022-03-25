package com.study.ocp.day22;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
public class WebImageDownload {
	public static void main(String[] args) {
		String sourcePath = "http://mdc.idv.tw/mdc/air/su27/su27-17.jpg";
		String destPath = "src\\com\\study\\ocp\\day22\\su-27.jpg";
		try(InputStream is = getImageStream(sourcePath);
			FileOutputStream fos = new FileOutputStream(destPath);) {
			byte[] buffer = new byte[1];
			while(is.read(buffer) != -1 ) {
				fos.write(buffer);
			}
			System.out.println("download ok");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	private static InputStream getImageStream(String sourcePath) throws IOException {
		URL url = new URL(sourcePath);
		return url.openStream();
	}	
}
