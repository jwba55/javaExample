package test.exam14;

import java.util.Scanner;

import test.exam14.bank_menu;

import test.exam14.cus_info;

public class exam14index {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String id = "";
		String pass = "";

		boolean run = true;
		int n;
		while (run) {
			System.out.println("ȸ���̽ʴϱ�? 1.�� 2.�ƴϿ�");
			n = sc.nextInt(); // ȸ������ Ȯ��

			if (n == 1) {

				System.out.println("�α����Ͻ� ���̵� �Է����ּ���.");
				id = sc.next();

				System.out.println("�α����Ͻ� �н����带 �Է����ּ���.");
				pass = sc.next();

				while (run) {
					if (id.equals(cus_info.getNewid()) && pass.equals(cus_info.getNewpass())) {

						System.out.println("�α��εǾ����ϴ�.");

						bank_menu menu = new bank_menu();
					}

					else {
						System.out.println("���̵� �н����尡 �߸��Ǿ����ϴ�.");
						System.out.println("�α����� �ٽ� �õ����ּ���.");
						break;
					}
				}
			}

			else if (n == 2) {
				System.out.println("ȸ������ â���� �̵��մϴ�.");
				System.out.println("����Ͻ� ���̵� �Է����ּ���.");

				cus_info cus_info = new cus_info(); // ȸ�� ���� �ڵ�
			}

			else {
				System.out.println("�����Ͻ� �޴��� �������� �ʽ��ϴ�. ó������ ���ư��ϴ�.");
			}

		}
	}

}
