package com.creating.www.file;

import java.io.*;

public class FileLoad {
	private File file;

	public FileLoad() throws File2IOException {
		// TODO Auto-generated constructor stub
		file = new File("config/hello");
		System.out.println("文件是否存在:" + file.exists());
		System.out.println(file.getAbsolutePath());
		InputStream i = null;
		try {
			i = new FileInputStream(file);
			byte[] b = new byte[1024];
			while (i.read(b) != -1) {
				System.out.println(new String(b));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			throw new File2IOException("文件异常!!", i);
		}
	}

}
