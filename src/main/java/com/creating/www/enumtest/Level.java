package com.creating.www.enumtest;

import static com.creating.www.enumtest.LevelConstants.A;
import static com.creating.www.enumtest.LevelConstants.B;

public enum Level {
	LEVELA(A, "A", "he"), LEVELB(B, "B", "he");
	private int indexInt;
	private String type;
	private String he;

	Level(int indexInt, String type, String he) {
		this.indexInt = indexInt;
		this.type = type;
		this.he = he;
	}

	public int toindexInt() {
		return this.indexInt;
	}

	public String toType() {
		return this.type;
	}

	public String toHe() {
		return this.he;
	}
}
