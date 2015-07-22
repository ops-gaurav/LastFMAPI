package lastfm.artist.info;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class LastFMSimilarArtists {
	
	@JsonProperty("artist") private List<LastFMMinimalArtist> artists;
	
	public LastFMSimilarArtists(){}
	public LastFMSimilarArtists(String emptyString){
		this.artists = null;
	}
	
	public void setArtists(List<LastFMMinimalArtist> artist){
		this.artists = artist;
	}
	public List<LastFMMinimalArtist> getArtists(){
		return artists;
	}
}
