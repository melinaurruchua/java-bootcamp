
public class playState implements State{
	String current = "play";
	
	@Override
	public void goNext(playlist p,String nextstate) {
		if("pause".equals(nextstate)){
			State pausestate = new pauseState();
			p.setState(pausestate);
			System.out.println("Pause mode.");
		}
		else{
			State stopstate = new stopState();
			p.setState(stopstate);
			System.out.println("Stop mode.");
		}
	}

}
