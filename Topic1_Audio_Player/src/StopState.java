
public class stopState implements State{
	String current = "stop";
	
	@Override
	public void goNext(playlist p,String nextstate) {
		if("pause".equals(nextstate)){
			State pausestate = new pauseState();
			p.setState(pausestate);
			System.out.println("Pause mode.");
		}
		else{
			State playstate = new playState();
			p.setState(playstate);
			System.out.println("Play mode: " + p.getCurrentSong());
		}
	}

}
