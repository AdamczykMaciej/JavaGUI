package ex1;

import java.util.ArrayList;

public class Good {
	private String good;
	private boolean newgood;
	

	synchronized public void setGood(String good) {
		while (newgood) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("Exception");
			}
		}
		this.good = good;
		this.newgood = true;
		notify();

	}

	synchronized public String getGood() {
		while (!newgood) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("Exception");
			}
		}
		this.newgood = false;
		notify();
		return this.good;

	}

}
