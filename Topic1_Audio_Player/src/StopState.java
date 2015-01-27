
public class StopState implements AudioPlayerCommand{
	String current = "stop";
	
	@Override
	public void goNext(Playlist p,String nextstate) {
		if("pause".equals(nextstate)){
			AudioPlayerCommand pausestate = new PauseState();
			p.setState(pausestate);
			System.out.println("Pause mode.");
		}
		else{
			AudioPlayerCommand playstate = new PlayState();
			p.setState(playstate);
			System.out.println("Play mode: " + p.getCurrentSong());
		}
	}

}
