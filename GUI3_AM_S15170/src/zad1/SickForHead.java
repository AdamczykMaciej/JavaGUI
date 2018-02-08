package zad1;

public class SickForHead extends Patient {
	
	SickForHead(String name) {
		super(name);
 	}

	@Override
	String disease() {
		
		return "head";
	}

	@Override
	String treatment() {
		
		return "aspirin";
	}


}
