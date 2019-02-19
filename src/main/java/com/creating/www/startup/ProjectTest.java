package com.creating.www.startup;

import java.util.Random;

import com.creating.www.project.AlarmModel;

public class ProjectTest {

	public ProjectTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 1000; i++) {
			AlarmModel am = new AlarmModel();
			am.id = new Integer(new Random().nextInt());
			System.out.println("---------------hashcode@" + am.hashCode());
		}
	}

}
