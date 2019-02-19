package com.creating.www.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileResourceComptition {
	private final static String docpath = "doc";
	private static File docfile = new File(docpath);
	private static File targetfile;

	private FileResourceComptition() {
	}

	public static void getSingelTon() {
		if (targetfile == null) {
			for (File f : docfile.listFiles()) {
				targetfile = f;
			}
		}
	}

	public static File getTargetFile() {
		getSingelTon();
		return targetfile;
	}

	public static void main(String[] args) {
		new Thread(new Runnable() {
			@Override
			public void run() {
				FileReader fr = null;
				try {
					fr = new FileReader(getTargetFile());
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
				BufferedReader br = new BufferedReader(fr);
				while (true) {
					try {
						System.out.println("Thread001:" + br.ready());
						System.out.println("Thread001:" + br.readLine());
					} catch (IOException e) {
						e.printStackTrace();
					}
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
		;
		new Thread(new Runnable() {
			@Override
			public void run() {
				FileReader fr = null;
				try {
					fr = new FileReader(getTargetFile());
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
				BufferedReader br = new BufferedReader(fr);
				while (true) {
					try {
						System.out.println("Thread002:" + br.ready());
						System.out.println("Thread002:" + br.readLine());
					} catch (IOException e) {
						e.printStackTrace();
					}
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
		;
	}
}
