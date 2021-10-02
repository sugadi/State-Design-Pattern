
public class Context {
	
	private State state;
	
	private Heat temp;

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public Heat getTemp() {
		return temp;
	}

	public void setTemp(Heat temp) {
		this.temp = temp;
	}
	
	public void changeState(int temparature) {
		
		if(temparature==0) {
			state.freez();
		}else {
			state.heat();
		}
		
		
	}
	
	public void start() {
		this.state.heat();
	}
	
	

}
