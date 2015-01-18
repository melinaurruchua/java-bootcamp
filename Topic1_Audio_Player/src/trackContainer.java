import java.util.ArrayList;
import java.util.List;


public class trackContainer {
	private String name;
	protected int totalTimeInSec;
	protected List<trackSong> songs= new ArrayList<trackSong>();
	
	public trackContainer(String name){
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
		for (trackSong song: songs){
			totalTimeInSec+=song.getDurationInSec();
		}
		return totalTimeInSec;
	}

	public void setTotalTimeInSec(int totalTimeInSec) {
		this.totalTimeInSec = totalTimeInSec;
	}
	
	public void addTrack(trackSong track){
		songs.add(track);
	}
	
	public void removeTrack(trackSong track){
		songs.remove(track);
	}
	
}
