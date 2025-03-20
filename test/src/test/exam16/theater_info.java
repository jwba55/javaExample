package test.exam16;

import java.util.Scanner;
import test.exam16.*;

class theater_info {
	static String movie, time, row, newn;
	static int col;
	static int m, t, r, c;
	boolean run = true;

	public theater_info() {
		Scanner sc = new Scanner(System.in);

		movie = exam16.movie;
		if ("�丣".equals(this.getmovie())) {
			this.m = 1;
		} else if ("���˿�������".equals(this.getmovie())) {
			this.m = 2;
		} else if ("���ϸ���".equals(this.getmovie())) {
			this.m = 3;
		} else if ("����������".equals(this.getmovie())) {
			this.m = 4;
		}

		time = exam16.time;
		if ("10:00".equals(this.gettime())) {
			this.t = 1;
		} else if ("14:00".equals(this.gettime())) {
			this.t = 2;
		} else if ("16:00".equals(this.gettime())) {
			this.t = 3;
		} else if ("18:00".equals(this.gettime())) {
			this.t = 4;
		} else if ("21:00".equals(this.gettime())) {
			this.t = 5;
		}

		row = exam16.row;
		if ("A".equals(this.getrow())) {
			this.r = 1;
		}
		if ("B".equals(this.getrow())) {
			this.r = 2;
		}
		if ("C".equals(this.getrow())) {
			this.r = 3;
		}
		if ("D".equals(this.getrow())) {
			this.r = 4;
		}
		if ("E".equals(this.getrow())) {
			this.r = 5;
		}
		if ("F".equals(this.getrow())) {
			this.r = 6;
		}
		if ("G".equals(this.getrow())) {
			this.r = 7;
		}
		if ("H".equals(this.getrow())) {
			this.r = 8;
		}
		if ("I".equals(this.getrow())) {
			this.r = 9;
		}
		if ("J".equals(this.getrow())) {
			this.r = 10;
		}

		col = exam16.col;
		for (int i = 1; i == this.getcol(); i++) {
			this.c = i;

			cus_info cus_info = new cus_info();
		}

	}

	public theater_info(String movie, String time, String row, int col, int m, int t) {
		super();
		this.movie = movie;
		this.time = time;
		this.row = row;
		this.col = col;
		this.r = r;
		this.c = c;
		this.m = m;
		this.t = t;

	}

	public static String getrow() {
		return row;
	}

	public void setrow(String row) {
		this.row = row;
	}

	public static int getcol() {
		return col;
	}

	public void setcol(int col) {
		this.col = col;
	}

	public static int getr() {
		return r;
	}

	public void setr(int r) {
		this.r = r;
	}

	public static int getc() {
		return c;
	}

	public void setc(int c) {
		this.c = c;
	}

	public static int getm() {
		return m;
	}

	public void setm(int m) {
		this.m = m;
	}

	public static int gett() {
		return t;
	}

	public void sett(int t) {
		this.t = t;
	}

	public static String getmovie() {
		return movie;
	}

	public void setmovie(String movie) {
		this.movie = movie;
	}

	public static String gettime() {
		return time;
	}

	public void settime(String time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "movie";
	}
}
