package com.creating.www.design;

public class Proxy {
	private Before before;
	private Target target;
	private After after;

	public Proxy() {
		// TODO Auto-generated constructor stub
	}

	public void addBefore(Before b) {
		System.out.println(System.currentTimeMillis());
	}

	public void addTarget(Target t) {
		this.target = t;
		t.execute();
	}

	public void addAfter(After a) {
		System.out.println(System.currentTimeMillis());
	}

	public void start() throws Exception {
		if (target == null)
			throw new Exception("没有目标");
		if (before != null)
			before.execute();
		target.execute();
		if (after != null)
			after.execute();
	}
}
