package lastfm.track.info;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LastFMTrackInfoWrapper {

	@JsonProperty("track") private LastFMTrack trackInfo;
	
	public void setTrackInfo(LastFMTrack track){
		this.trackInfo = track;
	}
	public LastFMTrack getTrackInfo(){
		return trackInfo;
	}
}
