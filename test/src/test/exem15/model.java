package test.exem15;

import java.util.*;

import test.exem15.*;

class model {
	static String model;
	static String galaxy21 = "galaxy21";
	static String v50 = "v50";
	static String iphone12 = "iphone12";
	static String note9 = "note9";
	static int m, n;

	public model() {
		Scanner sc = new Scanner(System.in);
		model = sc.next();

		if (galaxy21.equals(this.getmodel())) {
			this.m = 1;
			System.out.println(m);
		} else if (v50.equals(this.getmodel())) {
			this.m = 2;
		} else if (iphone12.equals(this.getmodel())) {
			this.m = 3;
			System.out.println(model + "¿‘¥œ¥Ÿ");
		} else if (note9.equals(this.getmodel())) {
			this.m = 4;
		}
	}

	public model(String model, int m) {
		super();
		this.model = model;
		this.m = m;

	}

	public static int getm() {
		return m;
	}

	public void setm(int m) {
		this.m = m;
	}

	public static String getmodel() {
		return model;
	}

	public void setmodel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "model";
	}
}
