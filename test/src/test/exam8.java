package test;

import java.util.Scanner;

public class exam8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int day;
		int dis = 0;
		int m1;
		int m2;

		System.out.println("�칰�� ���̸� �Է����ּ���");
		int n = sc.nextInt();
		System.out.println("�����̰� ������ �̵��ϴ� �Ÿ��� �������ּ���.");
		m1 = sc.nextInt();
		System.out.println("�����̰� �㵿�� �̲����� �Ÿ��� �������ּ���.");
		m2 = sc.nextInt();

		for (day = 0; dis < n; day++) {
			dis = dis + m1;
			if (dis < n) {
				dis = dis - m2;
			} else if (dis >= n) {
				if (day < 7) {
					System.out.println("�����̴� �� " + dis + "cm �̵��߰�");
					System.out.println(day + "�� ���� Ż���߽��ϴ�.");
					System.out.println("���� �� ���� �칰�̳׿�.");
				} else if (14 > day && day >= 7) {
					System.out.println("�����̴� �� " + dis + "cm �̵��߰�");
					System.out.println(day + "�� ���� Ż���߽��ϴ�.");
					System.out.println("����� �칰�̳׿�.");
				} else if (day >= 14) {
					System.out.println("�����̴� �� " + dis + "cm �̵��߰�");
					System.out.println(day + "�� ���� Ż���߽��ϴ�.");
					System.out.println("�� ���� �칰�̳׿�.");
				} else if (day >= 21) {
					System.out.println("�����̴� �� " + dis + "cm �̵��߰�");
					System.out.println(day + "�� ���� Ż���߽��ϴ�.");
					System.out.println("63���� ��ġ�� �칰�̳׿�.");
				}
			}

		}

	}

}
