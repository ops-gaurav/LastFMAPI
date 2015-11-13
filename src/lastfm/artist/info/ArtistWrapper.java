package lastfm.artist.info;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ArtistWrapper {
	
	@JsonProperty private Artist artist;
	
	public void setArtist(Artist artist){
		this.artist = artist;
	}
	public Artist getArtist(){
		return artist;
	}
}
