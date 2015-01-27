
public class PauseState implements AudioPlayerCommand{
	String current = "pause";
	
	@Override
	public void goNext(Playlist p,String nextstate) {
		if("play".equals(nextstate)){
			AudioPlayerCommand playstate = new PlayState();
			p.setState(playstate);
			System.out.println("Play mode: " + p.getCurrentSong());
		}
		else{
			AudioPlayerCommand stopstate = new StopState();
			p.setState(stopstate);
			System.out.println("Stop mode.");
		}
	}

}
