package test.exem15;

import java.util.*;

import test.exem15.model;

import test.exem15.phone_info;

public class exam15index {

	public static void main(String[] args) {
		boolean t = true;
		while (t) {
			System.out.println("정보를 얻고자하는 휴대폰(갤럭시21, v50, 아이폰12, 노트9)의 모델명을 입력해주세요.");
			model model = new model();

			System.out.println(model.model + "의 정보를 출력합니다.");
			phone_info phone_info = new phone_info();

		}

	}
}
