package test;

import java.util.Scanner;

public class exam8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int day;
		int dis = 0;
		int m1;
		int m2;

		System.out.println("우물의 깊이를 입력해주세요");
		int n = sc.nextInt();
		System.out.println("달팽이가 낮동안 이동하는 거리를 설정해주세요.");
		m1 = sc.nextInt();
		System.out.println("달팽이가 밤동안 미끄러질 거리를 설정해주세요.");
		m2 = sc.nextInt();

		for (day = 0; dis < n; day++) {
			dis = dis + m1;
			if (dis < n) {
				dis = dis - m2;
			} else if (dis >= n) {
				if (day < 7) {
					System.out.println("달팽이는 총 " + dis + "cm 이동했고");
					System.out.println(day + "일 만에 탈출했습니다.");
					System.out.println("별로 안 깊은 우물이네요.");
				} else if (14 > day && day >= 7) {
					System.out.println("달팽이는 총 " + dis + "cm 이동했고");
					System.out.println(day + "일 만에 탈출했습니다.");
					System.out.println("평범한 우물이네요.");
				} else if (day >= 14) {
					System.out.println("달팽이는 총 " + dis + "cm 이동했고");
					System.out.println(day + "일 만에 탈출했습니다.");
					System.out.println("꽤 깊은 우물이네요.");
				} else if (day >= 21) {
					System.out.println("달팽이는 총 " + dis + "cm 이동했고");
					System.out.println(day + "일 만에 탈출했습니다.");
					System.out.println("63빌딩 뺨치는 우물이네요.");
				}
			}

		}

	}

}
