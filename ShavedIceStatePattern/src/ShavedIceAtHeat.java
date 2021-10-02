
public class ShavedIceAtHeat implements State {

	@Override
	public void freez() {
		 
		System.out.println("Shaved ice at Freez state");
		
	}

	@Override
	public void heat() {
		System.out.println("Shaved ice at Heat state");
		
	}

}
