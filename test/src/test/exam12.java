package test;

import java.util.Scanner;

public class exam12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String arr;
		System.out.println("ȸ�����θ� Ȯ���� ������ �Է��ϼ���.");
		arr = sc.next();
		String reversed = new StringBuilder(arr).reverse().toString();
		System.out.println(arr.equals(reversed));
	}

}
