package zad1;

public abstract class Patient {
	private String name;

	Patient(String name) {
		this.name = name;

	}

	public String surname() {
		return name;
	}

	abstract String disease();

	abstract String treatment();

}


