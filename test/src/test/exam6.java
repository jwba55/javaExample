package test;

import java.util.Scanner;

public class exam6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = "a";
		String b = "b";
		String c = "c";
		String d = "d";
		String e = "e";
		String f = "f";
		System.out.println("������ Ȯ�� �� ���ĺ��� �Է����ּ���.");
		String alpha = sc.nextLine();
		if (alpha.equalsIgnoreCase(a)) {
			System.out.println("�Է��Ͻ� ���ĺ��� ������ ei�Դϴ�");
		} else if (alpha.equalsIgnoreCase(b)) {
			System.out.println("�Է��Ͻ� ���ĺ��� ������ bi�Դϴ�");
		} else if (alpha.equalsIgnoreCase(c)) {
			System.out.println("�Է��Ͻ� ���ĺ��� ������ si�Դϴ�");
		} else if (alpha.equalsIgnoreCase(d)) {
			System.out.println("�Է��Ͻ� ���ĺ��� ������ di�Դϴ�");
		} else if (alpha.equalsIgnoreCase(e)) {
			System.out.println("�Է��Ͻ� ���ĺ��� ������ e�Դϴ�");
		} else if (alpha.equalsIgnoreCase(f)) {
			System.out.println("�Է��Ͻ� ���ĺ��� ������ ef�Դϴ�");
		} else {
			System.out.println("A~F������ ��µ˴ϴ�.");
		}
	}

}
