package ex1;


public class B extends Thread {
	private Good good;
	private int count = 0;
	private static int numberOfGoods = 0;
	private static int totalWeight = 0;

	public B(Good good) {
		this.good = good;
	}
	public static int getWeight(){
		return B.totalWeight;
	}
	public static int getNumOfGoods(){
		return B.numberOfGoods;
		
	}
	@Override
	public void run() {
		String goodToPrint;
		
		while ((goodToPrint = good.getGood()) != null) {
			String[] arr = new String[2];
			arr = goodToPrint.split(" ");
			
			numberOfGoods++;
			count++;
			totalWeight += Integer.parseInt(arr[1]);
			if (count == 100) {
				System.out.println("counted the weight of " + numberOfGoods + " goods");
				count = 0;

			}
		}
		B.getWeight();
		

	}

}