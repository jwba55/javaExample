package test.exam16;

import test.exam16.*;

import java.util.Scanner;

class cus_info {
	static String movie_info;
	static int newn;
	static int m;
	static int[][][][] sit = new int[4][5][10][10];

	public cus_info() {

		sit[theater_info.getm()][theater_info.gett()][theater_info.getr()][theater_info.getc()] = m;
		newn = (int) (Math.random() * 1000000000) + 100000;
	}

	public cus_info(String movie_info, int newn) {
		super();
		this.newn = newn;
		this.movie_info = movie_info;
	}

	public static String getmovie_info() {
		return movie_info;
	}

	public void setmovie_info(String movie_info) {
		this.movie_info = movie_info;
	}

	public static int getnewn() {
		return newn;
	}

	public void setnewn(int newn) {
		this.newn = newn;
	}

}
