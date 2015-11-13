package lastfm.album.info;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class AlbumTracks {

	@JsonProperty private List<AlbumTrack> track;
	
	public void setTrack(List<AlbumTrack> track){
		this.track = track;
	}
	
	public List<AlbumTrack> getTrack(){
		return track;
	}
	
}
