package test;

import java.util.*;

public class exam13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int[] arr;
		arr = new int[10];
		for (int i = 0; i < 10; i++) {
			System.out.println("0�̻��� ���� 10���� �Է����ּ���.");
			n = sc.nextInt();
			arr[i] = n;
		}
		for (int c = 0; c < 10; c++) {
			if (arr[c] > 5) {
				System.out.println(arr[c]);
			}
		}
	}

}
