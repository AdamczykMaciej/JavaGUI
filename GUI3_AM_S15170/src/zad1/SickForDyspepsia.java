package zad1;

public class SickForDyspepsia extends Patient {
	
	SickForDyspepsia(String name) {
		super(name);

	}


	@Override
	String disease() {
		
		return "dyspepsia";
	}

	@Override
	String treatment() {
		
		return "activated charcoal";
	}

}
