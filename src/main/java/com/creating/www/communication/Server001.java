package com.creating.www.communication;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;

public class Server001 {
public static void main(String[] args) 
{

	// TODO Auto-generated method stub
try {
	RandomAccessFile raf=new RandomAccessFile(new File("TEST"),"rw");
	FileChannel c=raf.getChannel();
	MappedByteBuffer sharemem=null;
	try {
		sharemem=c.map(MapMode.READ_WRITE,0,4096);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	String rec_str="";
	System.out.println("response: "+new String(sharemem.asCharBuffer().array()));
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

}
}
