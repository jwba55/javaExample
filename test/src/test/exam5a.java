package test;

import java.util.*;

public class exam5a {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] sub;
		int n;
		int total = 0;
		int avg = 0;

		System.out.println("����� ���� ���� ���� �Է��Ͻÿ�.");
		n = sc.nextInt();
		sub = new int[n];
		String name = "";
		for (int i = 0; i < sub.length; i++) {
			System.out.println("���� ���� �Է����ּ���.");
			name = sc.next();
			System.out.println("������ ������ �Է����ּ���.");
			int score = sc.nextInt();
			char grade;

			if (score >= 90) {
				grade = 'A';
				System.out.println(name + "�� ������ " + grade + " �Դϴ�.");
			} else if (80 <= score && score < 90) {
				grade = 'B';
				System.out.println("�ش� ������ ������ " + grade + " �Դϴ�.");
			} else if (70 <= score && score < 80) {
				grade = 'C';
				System.out.println("�ش� ������ ������ " + grade + " �Դϴ�.");
			} else if (60 <= score && score < 70) {
				grade = 'D';
				System.out.println("�ش� ������ ������ " + grade + " �Դϴ�.");

			} else if (50 <= score && score < 60) {
				grade = 'E';
				System.out.println("�ش� ������ ������ " + grade + " �Դϴ�.");

			} else {
				grade = 'F';
				System.out.println("�ش� ������ ������ " + grade + " �Դϴ�.");
			}

			sub[i] = score;
			total += sub[i];

		}
		avg = total / n;

		System.out.println("��� ������ " + avg + "�� �Դϴ�.");

	}

}
