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
			System.out.println("회원이십니까? 1.네 2.아니오");
			n = sc.nextInt(); // 회원여부 확인

			if (n == 1) {

				System.out.println("로그인하실 아이디를 입력해주세요.");
				id = sc.next();

				System.out.println("로그인하실 패스워드를 입력해주세요.");
				pass = sc.next();

				while (run) {
					if (id.equals(cus_info.getNewid()) && pass.equals(cus_info.getNewpass())) {

						System.out.println("로그인되었습니다.");

						bank_menu menu = new bank_menu();
					}

					else {
						System.out.println("아이디나 패스워드가 잘못되었습니다.");
						System.out.println("로그인을 다시 시도해주세요.");
						break;
					}
				}
			}

			else if (n == 2) {
				System.out.println("회원가입 창으로 이동합니다.");
				System.out.println("사용하실 아이디를 입력해주세요.");

				cus_info cus_info = new cus_info(); // 회원 가입 코드
			}

			else {
				System.out.println("선택하신 메뉴는 존재하지 않습니다. 처음으로 돌아갑니다.");
			}

		}
	}

}
