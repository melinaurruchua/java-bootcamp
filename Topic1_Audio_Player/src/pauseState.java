
public class pauseState implements State{
	String current = "pause";
	
	@Override
	public void goNext(playlist p,String nextstate) {
		if("play".equals(nextstate)){
			State playstate = new playState();
			p.setState(playstate);
			System.out.println("Play mode: " + p.getCurrentSong());
		}
		else{
			State stopstate = new stopState();
			p.setState(stopstate);
			System.out.println("Stop mode.");
		}
	}

}
