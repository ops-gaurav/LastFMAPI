package lastfm.track.info;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LastFMTrackAlbumAttr {

	@JsonProperty private int position;
	
	public void setPosition(int position){
		this.position = position;
	}
	public int getPosition(){
		return position;
	}
}
