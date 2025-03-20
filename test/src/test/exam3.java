package test;

import java.util.Scanner;

public class exam3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("변환할 초를 입력해주세요");
		int n = sc.nextInt();
		int h = n / 3600;
		int m = (n - h * 3600) / 60;
		int s = n - (h * 3600 + m * 60);
		System.out.println("환산된 시간은" + h + "시간" + m + "분" + s + "초입니다.");
	}

}
