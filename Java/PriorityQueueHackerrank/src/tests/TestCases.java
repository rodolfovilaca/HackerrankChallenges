package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import exercise.Student;

public class TestCases {

	@Test
	public void johnMarkCompareTest() {
		Student john = new Student(50,"John",3.75);
		Student mark = new Student(24,"Mark",3.8);
		assertEquals(john.compareTo(mark),1);
	}
	
	@Test
	public void shafaetSamihaCompareTest() {
		Student shafaet = new Student(35,"Shafaet",3.7);
		Student samiha = new Student(36,"Samiha",3.85);
		assertEquals(shafaet.compareTo(samiha),1);
	}
	
	@Test
	public void ashleyMariaCompareTest() {
		Student ashley = new Student(42,"Ashley",3.9);
		Student maria = new Student(46,"Maria",3.6);
		assertEquals(ashley.compareTo(maria),-1);
	}
	
	@Test
	public void anikDanCompareTest() {
		Student anik = new Student(49,"Anik",3.95);
		Student dan = new Student(50,"Dan",3.95);
		assertEquals(anik.compareTo(dan),-1);
	}
	
}
