package test;

import java.util.Scanner;

public class exam9 {

	public static void main(String[] args) {
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		int n;
		int i;
		int p;
		int tm = 0;
		while (run) {
			System.out.println("�̿��Ͻ� �޴��� �������ּ���. 1.�Ա� 2.��� 3.�ܰ� 4.����");
			n = sc.nextInt();
			if (n == 1) {
				System.out.println("�Ա��Ͻ� �ݾ��� �Է����ּ���.");
				i = sc.nextInt();
				System.out.println(i + "�� �ԱݵǾ����ϴ�.");
				tm += i;
				System.out.println("���� �ܾ��� " + tm + " �� �Դϴ�");
				System.out.println("�̿����ּż� �����մϴ�. ���� â���� ���ư��ϴ�.");
			} else if (n == 2) {
				System.out.println("����Ͻ� �ݾ��� �Է����ּ���.");
				p = sc.nextInt();
				if (p > tm) {
					System.out.println("�ܾ��� �����մϴ�.");
					System.out.println("�ٽ� ���� â���� ���ư��ϴ�.");
				} else {
					System.out.println(p + " �� ��ݵǾ����ϴ�.");
					tm -= p;
					System.out.println("���� �ܾ��� " + tm + " �� �Դϴ�");
					System.out.println("�̿����ּż� �����մϴ�. ���� â���� ���ư��ϴ�.");
				}
			} else if (n == 3) {
				System.out.println("���� �ܾ��� " + tm + " �� �Դϴ�");
				System.out.println("�̿����ּż� �����մϴ�. ���� â���� ���ư��ϴ�.");
			} else if (n == 4) {
				System.out.println("�̿����ּż� �����մϴ�. ���α׷��� �����մϴ�.");
			} else {
				System.out.println("�����Ͻ� �޴��� �������� �ʽ��ϴ�.");
				System.out.println("���� â���� ���ư��ϴ�.");
			}
		}

	}

}
