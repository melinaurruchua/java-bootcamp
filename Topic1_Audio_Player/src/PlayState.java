
public class PlayState implements AudioPlayerCommand{
	String current = "play";
	
	@Override
	public void goNext(Playlist p,String nextstate) {
		if("pause".equals(nextstate)){
			AudioPlayerCommand pausestate = new PauseState();
			p.setState(pausestate);
			System.out.println("Pause mode.");
		}
		else{
			AudioPlayerCommand stopstate = new StopState();
			p.setState(stopstate);
			System.out.println("Stop mode.");
		}
	}

}
