package com.creating.www.bean002;

public class Service {

	public Service() {
		// TODO Auto-generated constructor stub
	}
private static void operationA(ParentClass pc){
	pc.operationA();
}
public static void operationA_all(ParentClass[] pc){
	for(ParentClass pc_i:pc) {
		operationA(pc_i);
	}
}
}
