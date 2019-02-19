package com.creating.www.classinit;

public class TimeCounter {
	private long start;// 开始
	private long end;// 结束

	public TimeCounter(long start, long end) {
		// TODO Auto-generated constructor stub
		this.start = start;
		this.end = end;
	}

	/**
	 * 时间类求时间差
	 * 
	 * @return 时间差
	 * 
	 */
	public long gap() {
		return end - start;
	}
}
