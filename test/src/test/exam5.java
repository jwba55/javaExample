package test;

import java.util.Scanner;

public class exam5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char grade;
		int total;

		System.out.println("����, ����, ����, ��ȸ, ������ ������ ������� �Է��Ͻÿ�.");
		int sb1 = sc.nextInt();
		int sb2 = sc.nextInt();
		int sb3 = sc.nextInt();
		int sb4 = sc.nextInt();
		int sb5 = sc.nextInt();

		total = sb1 + sb2 + sb3 + sb4 + sb5;
		double avg = (double) ((double) total / 5);

		if (avg >= 90) {
			grade = 'A';
		} else if (80 <= avg && avg < 90) {
			grade = 'B';
		} else if (70 <= avg && avg < 80) {
			grade = 'C';
		} else if (60 <= avg && avg < 70) {
			grade = 'D';
		} else if (50 <= avg && avg < 60) {
			grade = 'E';
		} else {
			grade = 'F';
		}
		System.out.println("����� ������" + grade + "�Դϴ�");

	}

}
