package test;

import java.util.Scanner;

public class exam4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean T = true;
		while (T) {
			System.out.println("0을 입력해주세요");
			int n = sc.nextInt();

			if (0 == n) {
				System.out.println("입력된 값은 0입니다.");

				break;
			}

		}

	}

}
