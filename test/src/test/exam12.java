package test;

import java.util.Scanner;

public class exam12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String arr;
		System.out.println("회문여부를 확인할 문장을 입력하세요.");
		arr = sc.next();
		String reversed = new StringBuilder(arr).reverse().toString();
		System.out.println(arr.equals(reversed));
	}

}
