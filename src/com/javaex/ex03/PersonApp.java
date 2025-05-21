package com.javaex.ex03;

public class PersonApp {

	public static void main(String[] args) {

		Person person01 = new Person("유재석", "010-1111-1111", "02-1111-1111");
		Person person02 = new Person("이효리", "010-2222-2222", "02-2222-2222");
		Person person03 = new Person("박명수", "010-3333-3333", "02-3333-3333");

		person01.showInfo();
		person02.showInfo();
		person03.showInfo();
	}

}
