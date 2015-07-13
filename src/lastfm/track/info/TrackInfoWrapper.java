package lastfm.track.info;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TrackInfoWrapper {

	@JsonProperty("track") private Track trackInfo;
	
	public void setTrackInfo(Track track){
		this.trackInfo = track;
	}
	public Track getTrackInfo(){
		return trackInfo;
	}
}
