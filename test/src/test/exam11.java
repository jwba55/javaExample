package test;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class exam11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer[] arr;
		arr = new Integer[5];

		System.out.println("5개의 정수를 입력해주세요.");
		for (int i = 0; i < 5; i++) {
			int a = sc.nextInt();
			arr[i] = a;
		}
		Arrays.sort(arr, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});
		System.out.println(Arrays.toString(arr));
		Integer[] arr2 = new Integer[5];
		Arrays.sort(arr);
		arr2 = arr;
		System.out.println(Arrays.toString(arr2));
	}

}
