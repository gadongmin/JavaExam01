package com.javaex.ex03;

public class Person {
	// 필드
	private String name;
	private String hp;
	private String cp;

	// 생성자
	public Person() {}

	public Person(String name, String hp, String cp) {
		this.name = name;
		this.hp = hp;
		this.cp = cp;
	}

	// 메소드 gs
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String getCp() {
		return cp;
	}

	public void setCp(String cp) {
		this.cp = cp;
	}

	// 메소드 일반
	@Override
	public String toString() {
		return "Peson [name=" + name + ", hp=" + hp + ", cp=" + cp + "]";
	}

	public void showInfo() {
		System.out.println("---------------------------------");
		System.out.println("이  름: " + name);
		System.out.println("핸드폰: " + hp);
		System.out.println("회  사: " + cp);
		System.out.println("---------------------------------");
	}
}
