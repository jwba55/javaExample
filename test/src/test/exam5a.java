package test;

import java.util.*;

public class exam5a {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] sub;
		int n;
		int total = 0;
		int avg = 0;

		System.out.println("평균을 구할 과목 수를 입력하시오.");
		n = sc.nextInt();
		sub = new int[n];
		String name = "";
		for (int i = 0; i < sub.length; i++) {
			System.out.println("과목 명을 입력해주세요.");
			name = sc.next();
			System.out.println("과목의 점수를 입력해주세요.");
			int score = sc.nextInt();
			char grade;

			if (score >= 90) {
				grade = 'A';
				System.out.println(name + "의 학점은 " + grade + " 입니다.");
			} else if (80 <= score && score < 90) {
				grade = 'B';
				System.out.println("해당 과목의 학점은 " + grade + " 입니다.");
			} else if (70 <= score && score < 80) {
				grade = 'C';
				System.out.println("해당 과목의 학점은 " + grade + " 입니다.");
			} else if (60 <= score && score < 70) {
				grade = 'D';
				System.out.println("해당 과목의 학점은 " + grade + " 입니다.");

			} else if (50 <= score && score < 60) {
				grade = 'E';
				System.out.println("해당 과목의 학점은 " + grade + " 입니다.");

			} else {
				grade = 'F';
				System.out.println("해당 과목의 학점은 " + grade + " 입니다.");
			}

			sub[i] = score;
			total += sub[i];

		}
		avg = total / n;

		System.out.println("평균 점수는 " + avg + "점 입니다.");

	}

}
