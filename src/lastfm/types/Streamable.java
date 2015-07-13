package lastfm.types;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Streamable {

	@JsonProperty("#text") private int isStreamable;
	@JsonProperty("fulltrack") private int fullTrackStreamable;
	
	public void setStreamable(int streamable){
		this.isStreamable = streamable;
	}
	public int getStreamable(){
		return isStreamable;
	}
	
	public void setFullTrackStreamable(int fulltrack){
		this.fullTrackStreamable = fulltrack;
	}
	public int getFullTrackStreamable(){
		return fullTrackStreamable;
	}
}
