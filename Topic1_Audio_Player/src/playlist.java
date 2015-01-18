import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class playlist extends trackContainer{
	private State state;
	
	private List<trackSong> songs= new ArrayList<trackSong>();
	
	private String currentSong;
	
	public playlist(String name) {
		super(name);
	}
	
	public void addTrack(trackSong track){
		songs.add(track);
	}
	
	public void goNext(String nextstate){
		state.goNext(this,nextstate);
	}
	
	public void setState(State s){
		this.state=s;
	}
	
	public void reproduction() throws InterruptedException{
		boolean on=true;
		while (on){
			boolean onrandom=true;
			Iterator<trackSong> it = songs.iterator();
			while (it.hasNext() && on) {
				trackSong track = it.next();
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
