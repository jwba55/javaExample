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
			System.out.println("예매를 하신 분이십니까?");
			System.out.println("예매하셨으면 1을, 새로 예매하시려면 2를 입력해주세요.");
			n = sc.nextInt();
			if (n == 1) {
				System.out.println("발권번호를 입력해주세요.");
				int newn = sc.nextInt();
				if (newn == cus_info.getnewn()) {
					System.out.println("예매하신 영화의 정보는" + cus_info.m);
				} else {
					System.out.println("해당하는 예매 정보가 없습니다.처음으로 돌아갑니다.");
				}
			} else if (n == 2) {
				System.out.println("몇 분이서 예매하시나요?");
				p = sc.nextInt();
				System.out.println("예매하실 영화를 선택해주세요.");
				System.out.println("토르, 범죄와의 전쟁, 포켓몬스터, 끝까지간다.");
				movie = sc.next();

				System.out.println("상영시간을 선택해주세요.");
				System.out.println("10:00, 14:00, 16:00, 18:00, 21:00");
				time = sc.next();

				if (0 < p && p <= 10) {
					for (int i = 1; i <= p; i++) {
						System.out.println("좌석을 선택해주세요.");
						System.out.println("몇번째 열에 앉을지 A~J열 중에 선택해주세요.");
						row = sc.next();
						System.out.println("몇 번쩨 칸에 앉을지 1~10 중에 선택해주세요.");
						col = sc.nextInt();
						sit = row + col;
						System.out.println("예매가 완료되었습니다. 예매하신 영화는 " + time + " 의 " + movie + "이며,");
						System.out.println("좌석은 " + sit + "입니다.");

					}
					System.out.println("발권번호: " + cus_info.getnewn());
				} else {
					System.out.println("1~10명까지 예매가능합니다. 처음으로 돌아갑니다.");
				}

			}

			else {
				System.out.println("선택하신 번호는 없는 메뉴입니다. 처음으로 돌아갑니다.");
			}

		}

	}

}
