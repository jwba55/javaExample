package test;

import java.util.*;

public class exam10 {

	public static void main(String[] args) {
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		String id = "wlwl45wl", pass = "1234";
		String newid = null, newpass = null;
		int n;
		int i;
		int p;
		int tm = 0;
		while (run) {
			System.out.println("ȸ���̽ʴϱ�? 1.�� 2.�ƴϿ�");
			n = sc.nextInt();

			if (n == 1) {
				System.out.println("�α����Ͻ� ���̵� �Է����ּ���.");
				id = sc.next();
				System.out.println("�α����Ͻ� �н����带 �Է����ּ���.");
				pass = sc.next();

				while (run) {
					if (id.equals(newid) && pass.equals(newpass)) {
						System.out.println("�α��εǾ����ϴ�.");

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
					} else {
						System.out.println("���̵� �н����尡 �߸��Ǿ����ϴ�.");
						System.out.println("�α����� �ٽ� �õ����ּ���.");
						break;
					}
				}
			} else if (n == 2) {
				System.out.println("ȸ������ â���� �̵��մϴ�.");
				System.out.println("����Ͻ� ���̵� �Է����ּ���.");
				newid = sc.next();

				System.out.println("���̵� �Է��� �Ϸ�Ǿ����ϴ�.");
				System.out.println("����Ͻ� �н����带 �Է����ּ���.");
				newpass = sc.next();
				System.out.println("�����մϴ�. ȸ�������� �Ϸ�Ǿ����ϴ�.");
				System.out.println("���� �޴��� ���ư��ϴ�.");
			}

			else {
				System.out.println("�����Ͻ� �޴��� �������� �ʽ��ϴ�. ó������ ���ư��ϴ�.");
			}
		}

	}

}
