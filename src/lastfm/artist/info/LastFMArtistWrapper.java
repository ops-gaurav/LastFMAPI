package lastfm.artist.info;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LastFMArtistWrapper {
	
	@JsonProperty private LastFMArtist artist;
	
	public void setArtist(LastFMArtist artist){
		this.artist = artist;
	}
	public LastFMArtist getArtist(){
		return artist;
	}
}
