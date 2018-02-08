package zad1;

public class SickForLeg extends Patient {
	
	SickForLeg(String name) {
		super(name);

	}



	@Override
	String disease() {
		
		return "leg";
	}

	@Override
	String treatment() {
		
		return "plaster cast";
	}

}
