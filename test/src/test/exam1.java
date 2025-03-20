package test;

import java.util.*;

public class exam1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		double w;
		System.out.println("직사각형의 가로를 입력해주세요");
		a = sc.nextInt();
		System.out.println("직사각형의 세로를 입력해주세요");
		b = sc.nextInt();
		w = sc.nextInt();
		System.out.println(w);
		System.out.println("해당 직사각형의 둘레는" + (a + b) * 2 + "㎝이며");
		System.out.println("해당 직사각형의 넓이는" + (a * b) + "㎠입니다");

	}
}