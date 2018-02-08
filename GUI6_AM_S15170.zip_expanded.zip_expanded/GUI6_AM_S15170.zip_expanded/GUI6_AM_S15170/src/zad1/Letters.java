package zad1;

public class Letters {
	private String str;
	private final Thread[] threadarr;

	public Letters(String str) {
		this.str = str;

		threadarr = new Thread[str.length()];
		for (int i = 0; i < this.str.length(); i++) {
			char character;
			character = str.charAt(i);
			threadarr[i] = new Thread(() -> {
				while (true) {
					try {
						Thread.sleep(1000);
						System.out.print(character);
					} catch (InterruptedException e) {
						return;
					}
				}
			}, "Thread " + this.str.charAt(i));

		}
	}

	public Thread[] getThreads() {

		return threadarr;
	}

}