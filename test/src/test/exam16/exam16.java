package test.exam16;

import java.util.Scanner;

public class exam16 {

	public static String movie;
	public static String time;
	public static int p;
	public static String row;
	public static int col;
	public static String sit;

	static cus_info cus_info = new cus_info();

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		boolean run = true;
		int n;

		while (run) {
			System.out.println("���Ÿ� �Ͻ� ���̽ʴϱ�?");
			System.out.println("�����ϼ����� 1��, ���� �����Ͻ÷��� 2�� �Է����ּ���.");
			n = sc.nextInt();
			if (n == 1) {
				System.out.println("�߱ǹ�ȣ�� �Է����ּ���.");
				int newn = sc.nextInt();
				if (newn == cus_info.getnewn()) {
					System.out.println("�����Ͻ� ��ȭ�� ������" + cus_info.m);
				} else {
					System.out.println("�ش��ϴ� ���� ������ �����ϴ�.ó������ ���ư��ϴ�.");
				}
			} else if (n == 2) {
				System.out.println("�� ���̼� �����Ͻó���?");
				p = sc.nextInt();
				System.out.println("�����Ͻ� ��ȭ�� �������ּ���.");
				System.out.println("�丣, ���˿��� ����, ���ϸ���, ����������.");
				movie = sc.next();

				System.out.println("�󿵽ð��� �������ּ���.");
				System.out.println("10:00, 14:00, 16:00, 18:00, 21:00");
				time = sc.next();

				if (0 < p && p <= 10) {
					for (int i = 1; i <= p; i++) {
						System.out.println("�¼��� �������ּ���.");
						System.out.println("���° ���� ������ A~J�� �߿� �������ּ���.");
						row = sc.next();
						System.out.println("�� ���� ĭ�� ������ 1~10 �߿� �������ּ���.");
						col = sc.nextInt();
						sit = row + col;
						System.out.println("���Ű� �Ϸ�Ǿ����ϴ�. �����Ͻ� ��ȭ�� " + time + " �� " + movie + "�̸�,");
						System.out.println("�¼��� " + sit + "�Դϴ�.");

					}
					System.out.println("�߱ǹ�ȣ: " + cus_info.getnewn());
				} else {
					System.out.println("1~10����� ���Ű����մϴ�. ó������ ���ư��ϴ�.");
				}

			}

			else {
				System.out.println("�����Ͻ� ��ȣ�� ���� �޴��Դϴ�. ó������ ���ư��ϴ�.");
			}

		}

	}

}
