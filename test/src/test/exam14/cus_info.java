package test.exam14;

import java.util.Scanner;

class cus_info {

	private static String newid;
	private static String newpass;

	public cus_info() {
		Scanner sc = new Scanner(System.in);
		newid = sc.next();
		System.out.println("���̵� �Է��� �Ϸ�Ǿ����ϴ�.");
		System.out.println("����Ͻ� �н����带 �Է����ּ���.");
		newpass = sc.next();
		System.out.println("�н����� �Է��� �Ϸ�Ǿ����ϴ�.");
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
