package com.creating.www.communication;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.Channel;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;

public class Client001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			RandomAccessFile raf = new RandomAccessFile(new File("TEST"), "rw");
			FileChannel c = raf.getChannel();
			MappedByteBuffer sharemem = null;
			try {
				sharemem = c.map(MapMode.READ_WRITE, 0, 4096);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String str = "大家好,我是客户端";
			for (char ac : str.toCharArray()) {
				sharemem.putChar(ac);
			}
			System.out.println("send: " + str);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
