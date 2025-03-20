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
		System.out.println("발음을 확인 할 알파벳을 입력해주세요.");
		String alpha = sc.nextLine();
		if (alpha.equalsIgnoreCase(a)) {
			System.out.println("입력하신 알파벳의 발음은 ei입니다");
		} else if (alpha.equalsIgnoreCase(b)) {
			System.out.println("입력하신 알파벳의 발음은 bi입니다");
		} else if (alpha.equalsIgnoreCase(c)) {
			System.out.println("입력하신 알파벳의 발음은 si입니다");
		} else if (alpha.equalsIgnoreCase(d)) {
			System.out.println("입력하신 알파벳의 발음은 di입니다");
		} else if (alpha.equalsIgnoreCase(e)) {
			System.out.println("입력하신 알파벳의 발음은 e입니다");
		} else if (alpha.equalsIgnoreCase(f)) {
			System.out.println("입력하신 알파벳의 발음은 ef입니다");
		} else {
			System.out.println("A~F까지만 출력됩니다.");
		}
	}

}
