package com.koenig.testSuitExample;

import java.util.Arrays;

public class FirstDayAtSchool {

	public String[] prepareMyBag() {
		String[] schoolbag = {"Books","Notebooks","Pens"};
		System.out.println("My School bag Contains : " + Arrays.toString(schoolbag));
		return schoolbag;
		
	}
	
	public String[] addPencils() {
		String[] schoolbag = {"Books","Notebooks","Pens","Pencils"};
		System.out.println("Now my School bag Contains : " + Arrays.toString(schoolbag));
		return schoolbag;
		
	}
}
