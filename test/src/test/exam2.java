package test;

import java.util.*;

public class exam2 {

	public static void main(String[] args) {
		System.out.println("팩토리얼을 구하고 싶은 수를 입력해주세요");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int fac = 1;
		for (int i = num; i > 0; i--) {
			fac = fac * i;
		}

		System.out.println(num + "! =" + fac + "입니다.");
	}

}
