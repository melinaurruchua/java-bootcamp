import java.util.ArrayList;
import java.util.List;


public class TrackContainer {
	private String name;
	protected int totalTimeInSec;
	protected List<TrackSong> songs= new ArrayList<TrackSong>();
	
	public TrackContainer(String name){
		this.name=name;
		this.totalTimeInSec=0;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTotalTimeInSec(){
		for (TrackSong song: songs){
			totalTimeInSec+=song.getDurationInSec();
		}
		return totalTimeInSec;
	}

	public void setTotalTimeInSec(int totalTimeInSec) {
		this.totalTimeInSec = totalTimeInSec;
	}
	
	public void addTrack(TrackSong track){
		songs.add(track);
	}
	
	public void removeTrack(TrackSong track){
		songs.remove(track);
	}
	
}
