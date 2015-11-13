package lastfm.artist.toptracks;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Streaming properties of track
 * @author gaurav
 *
 */
public class Streamable {

	@JsonProperty("#text") private int isStreamable;
	@JsonProperty("fulltrack") private int isFulltrack;
	
	public void setIsStreamable(int streamable){
		this.isStreamable = streamable;
	}
	/**
	 * get the streamable property
	 * @return 1 of streamable otherwise 0
	 */
	public int getIsStreamable(){
		return isStreamable;
	}
	public void setIsFulltrack(int fulltrack){
		this.isFulltrack = fulltrack;
	}
	/**
	 * get the is full track streamable property
	 * @return 1 if full track is streamable, otherwise 0
	 */
	public int getIsFulltrack(){
		return isFulltrack;
	}
}
