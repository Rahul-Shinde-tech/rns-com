package com.embeddeding;

public class TestMain {

	public static void main(String[] args) {
		Student s = new Student();
		s.setsName("Ricky");
		s.setsDept("Cricket");
		s.setsTalk(true);
		Address add = new Address();
		add.setPincode(12345);
		add.setStreeName("main street main road ");
		s.setAddress(add);
		StudentDAO.saveInfo(s);
	}

}
