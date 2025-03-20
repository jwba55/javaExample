package test;

import java.util.Arrays;
import java.util.Scanner;

public class exam7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("2진수로 변환하고자하는 10진수를 입력해주세요");
		int n = sc.nextInt();

		String bin = "";

		while (n > 0) {
			bin = (n % 2) + bin;
			n /= 2;
		}
		System.out.println(bin);
	}

}
