package test.exam14;

import java.util.Scanner;

class cus_info {

	private static String newid;
	private static String newpass;

	public cus_info() {
		Scanner sc = new Scanner(System.in);
		newid = sc.next();
		System.out.println("아이디 입력이 완료되었습니다.");
		System.out.println("사용하실 패스워드를 입력해주세요.");
		newpass = sc.next();
		System.out.println("패스워드 입력이 완료되었습니다.");
	};

	public cus_info(String newid, String newpass) {
		super();
		this.newid = newid;
		this.newpass = newpass;
	}

	public static String getNewid() {
		return newid;
	}

	public void setNewid(String nnewid) {
		this.newid = newid;
	}

	public static String getNewpass() {
		return newpass;
	}

	public void setNewpass(String newpass) {
		this.newpass = newpass;
	}

	@Override
	public String toString() {
		return "cus_info[]";
	}

}
