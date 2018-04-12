package com.creating.www.file;
import java.io.*;

public class File2IOException extends IOException {
    public InputStream is;
    private String msg;
    public File2IOException(String msg) {
		// TODO Auto-generated constructor stub
    	this.msg=msg;
	}
    public File2IOException(){}
    public File2IOException(String msg, InputStream is) {
		// TODO Auto-generated constructor stub
    	this.msg=msg;
    	this.is=is;
	}
	@Override
    public String getMessage() {
    	// TODO Auto-generated method stub
    	return msg;
    }
}
