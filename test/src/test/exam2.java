package test;

import java.util.*;

public class exam2 {

	public static void main(String[] args) {
		System.out.println("���丮���� ���ϰ� ���� ���� �Է����ּ���");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int fac = 1;
		for (int i = num; i > 0; i--) {
			fac = fac * i;
		}

		System.out.println(num + "! =" + fac + "�Դϴ�.");
	}

}
