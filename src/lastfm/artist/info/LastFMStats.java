package lastfm.artist.info;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LastFMStats {
	@JsonProperty private int listeners;
	@JsonProperty private int playcount;
	
	public void setListener(int listeners){
		this.listeners = listeners;
	}
	public int getListeners(){
		return listeners;
	}
	
	public void setPlaycount(int playcount){
		this.playcount = playcount;
	}
	public int getPlaycount(){
		return playcount;
	}
}
