package test;

import java.util.Scanner;

public class exam3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��ȯ�� �ʸ� �Է����ּ���");
		int n = sc.nextInt();
		int h = n / 3600;
		int m = (n - h * 3600) / 60;
		int s = n - (h * 3600 + m * 60);
		System.out.println("ȯ��� �ð���" + h + "�ð�" + m + "��" + s + "���Դϴ�.");
	}

}
