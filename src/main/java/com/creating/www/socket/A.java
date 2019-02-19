package com.creating.www.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;

public class A {
	private Socket a = null;

	public A() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		new A().work();
	}

	public void work() {
		try {
			a = new Socket("127.0.0.1", 5555);
			while (true) {
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				PrintWriter pw = new PrintWriter(a.getOutputStream());
				String line = "";
				while ((line = br.readLine()) != null) {
					pw.write(line);
					System.out.println("------" + line + "--------");
				}
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
