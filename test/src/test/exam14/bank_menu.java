package test.exam14;

import java.util.Scanner;

class bank_menu {

	private static int tm, n, i, p;

	public bank_menu(int tm) {
		super();
		this.tm = tm;
	}

	public bank_menu() {
		Scanner sc = new Scanner(System.in);

		System.out.println("�̿��Ͻ� �޴��� �������ּ���. 1.�Ա� 2.��� 3.�ܰ� 4.����");
		n = sc.nextInt();

		if (n == 1) {
			System.out.println("�Ա��Ͻ� �ݾ��� �Է����ּ���.");
			i = sc.nextInt();
			System.out.println(i + "�� �ԱݵǾ����ϴ�.");
			tm += i;
			System.out.println("���� �ܾ��� " + tm + " �� �Դϴ�");
			System.out.println("�̿����ּż� �����մϴ�. ���� â���� ���ư��ϴ�.");
		}

		else if (n == 2) {
			System.out.println("����Ͻ� �ݾ��� �Է����ּ���.");
			p = sc.nextInt();

			if (p > tm) {
				System.out.println("�ܾ��� �����մϴ�.");
				System.out.println("�ٽ� ���� â���� ���ư��ϴ�.");
			}

			else {
				System.out.println(p + " �� ��ݵǾ����ϴ�.");
				tm = -p;
				System.out.println("���� �ܾ��� " + tm + " �� �Դϴ�");
				System.out.println("�̿����ּż� �����մϴ�. ���� â���� ���ư��ϴ�.");
			}
		}

		else if (n == 3) {
			System.out.println("���� �ܾ��� " + tm + " �� �Դϴ�");
			System.out.println("�̿����ּż� �����մϴ�. ���� â���� ���ư��ϴ�.");
		}

		else if (n == 4) {
			System.out.println("�̿����ּż� �����մϴ�. ���α׷��� �����մϴ�.");
		}

		else {
			System.out.println("�����Ͻ� �޴��� �������� �ʽ��ϴ�.");
			System.out.println("���� â���� ���ư��ϴ�.");
		}
	}

	public static int gettm() {
		return tm;
	}

	public void settm(int tm) {
		this.tm = tm;
	}

}
