package test;

import java.util.Scanner;

public class exam4a {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean t = true;
		int n = 0;

		while (t) {

			System.out.println("숫자 0을 입력해주세요.");
			n = sc.nextInt();

			if (n != 0) {
				System.out.println("0이 아닙니다 다시 입력해주세요.");

			} else if (n == 0) {
				System.out.println("0을 입력하셨습니다. 감사합니다.");
				t = false;
			}
		}

	}

}
