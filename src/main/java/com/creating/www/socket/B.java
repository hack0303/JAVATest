package com.creating.www.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;

public class B {
  private ServerSocket ss=null;
  private int port=5555;
	public B() {
		try {
			ss=new ServerSocket(port);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
public static void main(String[] args)
{
		new B().start();
}
public void start(){
	Socket one=null;
	BufferedReader br=null;
	try {
		one=ss.accept();
	br=new BufferedReader(new InputStreamReader(one.getInputStream()));
	String line="";
	while((line=br.readLine())!=null)
		System.out.println(line);
	} 
	catch (IOException e)
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally 
	{
		if(one!=null)
			try {
				one.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		if(br!=null)
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
}
}
