package zad2;

public abstract class Flower {

	private int quantity;

	public Flower(int quantity) {
		this.quantity = quantity;
	}

	abstract String getName();

	abstract String getColor();

	public int getQuantity() {
		return quantity;
	}

}

class Rose extends Flower {
	private final String name = "rose";
	private final String color = "red";

	public Rose(int quantity) {
		super(quantity);
	}

	@Override
	String getName() {

		return name;
	}

	@Override
	String getColor() {

		return color;
	}

}

class Peony extends Flower {
	private final String name = "peony";
	private final String color = "pink";

	public Peony(int quantity) {
		super(quantity);
	}

	@Override
	String getName() {

		return name;
	}

	@Override
	String getColor() {
		
		return color;
	}

}

class Freesia extends Flower {
	private final String name = "freesia";
	private final String color = "yellow";

	public Freesia(int quantity) {
		super(quantity);
	}

	@Override
	String getName() {

		return name;
	}

	@Override
	String getColor() {
		
		return color;
	}

}

class Lilac extends Flower {
	private final String name = "lilac";
	private final String color = "white";

	public Lilac(int quantity) {
		super(quantity);
	}

	@Override
	String getName() {

		return name;
	}

	@Override
	String getColor() {
		
		return color;
	}
}
