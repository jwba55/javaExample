package test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class codingtest1 {
	public static void main(String[] args) {
		int n;
		int w;
		Scanner sc = new Scanner(System.in);
		int repeat = 1;
		int remain;
		int h;
		int outBox;
		int box;
		int num = 0;
		int i;
		int j;
		int response = 1;
		System.out.println("택배 상자의 총 갯수를 입력해주세요. 2~100까지만 입력가능합니다.");
		n = sc.nextInt();
		if (2 <= n && n <= 100) {
			System.out.println("가로 열에 상자를 몇개씩 놓을지 입력해주세요. 1~10까지만 입력가능합니다.");
			w = sc.nextInt();

			if (1 <= w && w <= 10) {
				remain = n % w; // 나머지 구하기

				System.out.println(remain);
				h = (remain == 0) ? (n / w) : (n / w + 1);
				System.out.println(h);
				int[][] arr = new int[h][w]; // 2차원 배열 생성
				for (i = 0; i < h; i++) {
					for (j = 0; j < w; j++) {
						if (i == h && remain <= j) { // 선택된 세로 열이 최고 길이 이고 선택된 가로 열이 나머지보다 크거나 같을 경우 번호를 채우지 않는다
							System.out.println("택배정리가 완료되었습니다.");
						} else {
							arr[i][j] = response++; // 택배 번호 채우기

						}
					}
				}

				for (; 1 <= repeat && repeat < h; repeat++) { // repeat의 숫자만큼 반복시키고 repeat를 기준으로 몇번째 열인지 확인하고 열이 바뀔때 마다
					// 몇번째 열이지 어떻게 확인할 것인가? 첫번째 숫자를 기준으로 오름차순 혹은 내림차순으로 배열을 정리하도록 한다.
					// 홀수인지 짝수인지 확인하여 repeat가 홀수이면 오름차순 정렬, repeat가 짝수이면 내림차순 정렬

					final int currentRepeat = repeat;
					if (currentRepeat % 2 == 1) {
						Arrays.sort(arr[currentRepeat]); // 오름차순 정렬
					} else if (currentRepeat % 2 == 0) {
						Arrays.sort(arr[currentRepeat]);
						for (j = 0; j < w / 2; j++) { // 내림차순 정렬 (배열 반전)
							int temp = arr[currentRepeat][j];
							arr[currentRepeat][j] = arr[currentRepeat][w - j - 1];
							arr[currentRepeat][w - j - 1] = temp;
						}
					} else {
						System.out.println("에외 처리");
					}
				} // 배열 생성 완료

				// 꺼낼 택배: 꺼낼 택배의 번호를 입력 받고, 꺼낼 택배들의 택배 위에 다른 택배가 있을 경우 그위에 있는 택배를 먼저 꺼내야함. 꺼내려는
				// 택배 번호에 해당하는 배열의 위치부터 파악해야함.
				System.out.println("꺼낼 택배의 개수를 입력해주세요");
				outBox = sc.nextInt();
				if (0 < outBox && outBox <= n) {
					int[] boxNum = new int[outBox];

					for (; outBox >= 1; outBox--) {
						System.out.println("꺼낼 택배의 번호를 입력해주세요");
						boxNum[outBox] = sc.nextInt();
					}
					System.out.println("@@@@@@@@@@@@@@@@@@");
					// 입력받은 택배의 위치를 확인하고 택배 꺼내기
					for (i = 0; i < outBox;) {
						box = boxNum[i];
						System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
						for (; i < h; i++) { // 꺼내기로 한 택배의 수 만큼 반복
							for (j = 0; j < w; j++) { // 가로 세로 열 확인
								if (arr[i][j] == box) { // 입력받은 숫자가 해당 위치의 값과 일치하는지 확인
									for (; i < h; i++) { // 최종 높이인지 확인 필요, 0의 총 개수 확인
										if (arr[h - i][j] != 0) { // 최종 높이가 아닐 경우 해당 위치에 있는 택배가 비어있는지 확인 필요
											arr[h - i][j] = 0; // 그 위치에 택배가 있을 경우 택배를 꺼냄
											num++; // 꺼낸 택배의 수를 저장
										}
									}
								}

							}
						}
					}
					System.out.println("꺼내야 할 택배의 개수는 전부 " + num + "개 입니다.");
				} else {
					System.out.println("꺼낼 택배의 수가 맞지 않습니다.");
				}

			} else {
				System.out.println("입력한 숫자가 조건에 맞는 숫자인지 다시 한번 확인해주세요.");
			}

		} else {
			System.out.println("조건에 부합하지않는 상자의 갯수입니다.");
			sc.close();
		}

	}
}