
public class ShavedIceStateDemo {
	
	public static void main(String[] args) {
		
		Context context = new Context();
		
		//freez state
		Heat temp = new Heat(0);
		
		context.setState(new ShavedIceAtHeat());
 
		context.start();
		
		context.setTemp(temp);
		
		System.out.println("\n If temparature is 0 \n");
		
		context.changeState(Heat.FREEZ_TEMP);
		
	}

}
