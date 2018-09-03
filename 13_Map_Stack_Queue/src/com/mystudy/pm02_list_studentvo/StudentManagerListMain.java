package com.mystudy.pm02_list_studentvo;

public class StudentManagerListMain {

	public static void main(String[] args) {
		StudentManagerList manager = new StudentManagerList();
		manager.inputBasicData();
		manager.printSungjuk();
		
		manager.updateData(new StudentVO("±èÀ¯½Å", 90,80,70));
		manager.printSungjuk();
		

	}

}
