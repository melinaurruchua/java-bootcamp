import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Playlist extends TrackContainer{
	private AudioPlayerCommand state;
	
	private List<TrackSong> songs= new ArrayList<TrackSong>();
	
	private String currentSong;
	
	public Playlist(String name) {
		super(name);
	}
	
	public void addTrack(TrackSong track){
		songs.add(track);
	}
	
	public void goNext(String nextstate){
		state.goNext(this,nextstate);
	}
	
	public void setState(AudioPlayerCommand s){
		this.state=s;
	}
	
	public void reproduction() throws InterruptedException{
		boolean on=true;
		while (on){
			boolean onrandom=true;
			Iterator<TrackSong> it = songs.iterator();
			while (it.hasNext() && on) {
				TrackSong track = it.next();
				currentSong=track.getName();
				while (onrandom){
					int r= (int) Math.random();
					if (r<3){
						goNext("pause");
						wait(100);
					}
					else if (r>7){
						goNext("stop");
						wait(100);
					}
					else if (r==5){
						onrandom=false;
					}
					else wait(track.getDurationInSec());
				}
				int exit= (int) Math.random();
				if (exit<5) on=false;
			}
			
		}
		System.out.println("End Playing");
	}

	public String getCurrentSong() {
		return currentSong;
	}

}
