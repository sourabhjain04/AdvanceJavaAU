package com.koenig.JunitExample;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Ignore;
import org.junit.Test;

public class FirstDayAtSchoolTest {

	FirstDayAtSchool school = new FirstDayAtSchool();
	String[] bag1 = {"Books","Notebooks","Pens"};
	
	String[] bag2 = {"Books","Notebooks","Pens","Pencils"};

	@Test
	public void testPrepareMyBag() {
		System.out.println("Inside testPrepareMyBag");
		assertArrayEquals(bag1, school.prepareMyBag());
	}
	
	@Test
	public void testAddPencils() {
		System.out.println("Inside testAddPencils");
		assertArrayEquals(bag2, school.addPencils());
	}
	
	
	
}
