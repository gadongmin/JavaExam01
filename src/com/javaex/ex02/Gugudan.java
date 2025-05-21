package com.javaex.ex02;

import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("단을 입력하세요.");
		System.out.print("단: ");

		int number = sc.nextInt();
		int result;

		if (2 <= number && number <= 9) {
			for (int i = 1; i <= 9; i++) {
				result = number * i;
				System.out.println(number + " * " + i + " = " + result);
			}

		} else {
			System.out.println("2단에서 9단까지만 출력 가능합니다.");
		}

		sc.close();

	}

}
