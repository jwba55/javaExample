package test;

import java.util.Arrays;
import java.util.Scanner;

public class exam7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("2������ ��ȯ�ϰ����ϴ� 10������ �Է����ּ���");
		int n = sc.nextInt();

		String bin = "";

		while (n > 0) {
			bin = (n % 2) + bin;
			n /= 2;
		}
		System.out.println(bin);
	}

}
