package test;

import java.util.Scanner;

public class exam4a {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean t = true;
		int n = 0;

		while (t) {

			System.out.println("���� 0�� �Է����ּ���.");
			n = sc.nextInt();

			if (n != 0) {
				System.out.println("0�� �ƴմϴ� �ٽ� �Է����ּ���.");

			} else if (n == 0) {
				System.out.println("0�� �Է��ϼ̽��ϴ�. �����մϴ�.");
				t = false;
			}
		}

	}

}
