package lastfm.album.info;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class LastFMAlbumTracks {

	@JsonProperty private List<LastFMAlbumTrack> track;
	
	public void setTrack(List<LastFMAlbumTrack> track){
		this.track = track;
	}
	
	public List<LastFMAlbumTrack> getTrack(){
		return track;
	}
	
}
