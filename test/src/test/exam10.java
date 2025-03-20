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
			System.out.println("회원이십니까? 1.네 2.아니오");
			n = sc.nextInt();

			if (n == 1) {
				System.out.println("로그인하실 아이디를 입력해주세요.");
				id = sc.next();
				System.out.println("로그인하실 패스워드를 입력해주세요.");
				pass = sc.next();

				while (run) {
					if (id.equals(newid) && pass.equals(newpass)) {
						System.out.println("로그인되었습니다.");

						System.out.println("이용하실 메뉴를 선택해주세요. 1.입금 2.출금 3.잔고 4.종료");
						n = sc.nextInt();
						if (n == 1) {
							System.out.println("입금하실 금액을 입력해주세요.");
							i = sc.nextInt();
							System.out.println(i + "원 입금되었습니다.");
							tm += i;
							System.out.println("현재 잔액은 " + tm + " 원 입니다");
							System.out.println("이용해주셔서 감사합니다. 선택 창으로 돌아갑니다.");
						} else if (n == 2) {
							System.out.println("출금하실 금액을 입력해주세요.");
							p = sc.nextInt();
							if (p > tm) {
								System.out.println("잔액이 부족합니다.");
								System.out.println("다시 선택 창으로 돌아갑니다.");
							} else {
								System.out.println(p + " 원 출금되었습니다.");
								tm -= p;
								System.out.println("현재 잔액은 " + tm + " 원 입니다");
								System.out.println("이용해주셔서 감사합니다. 선택 창으로 돌아갑니다.");
							}
						} else if (n == 3) {
							System.out.println("현재 잔액은 " + tm + " 원 입니다");
							System.out.println("이용해주셔서 감사합니다. 선택 창으로 돌아갑니다.");
						} else if (n == 4) {
							System.out.println("이용해주셔서 감사합니다. 프로그램을 종료합니다.");
						} else {
							System.out.println("선택하신 메뉴는 존재하지 않습니다.");
							System.out.println("선택 창으로 돌아갑니다.");
						}
					} else {
						System.out.println("아이디나 패스워드가 잘못되었습니다.");
						System.out.println("로그인을 다시 시도해주세요.");
						break;
					}
				}
			} else if (n == 2) {
				System.out.println("회원가입 창으로 이동합니다.");
				System.out.println("사용하실 아이디를 입력해주세요.");
				newid = sc.next();

				System.out.println("아이디 입력이 완료되었습니다.");
				System.out.println("사용하실 패스워드를 입력해주세요.");
				newpass = sc.next();
				System.out.println("감사합니다. 회원가입이 완료되었습니다.");
				System.out.println("메인 메뉴로 돌아갑니다.");
			}

			else {
				System.out.println("선택하신 메뉴는 존재하지 않습니다. 처음으로 돌아갑니다.");
			}
		}

	}

}
