package ex1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ThreadA extends Thread {
	private Objects object;

	public ThreadA(Objects object) {
		this.object = object;

	}

	@Override
	synchronized public void run() {
		object.createObjects();

	}

}
