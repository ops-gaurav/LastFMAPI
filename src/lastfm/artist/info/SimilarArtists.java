package lastfm.artist.info;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SimilarArtists {
	
	@JsonProperty("artist") private List<MinimalArtist> artists;
	
	public SimilarArtists(){}
	public SimilarArtists(String emptyString){
		this.artists = null;
	}
	
	public void setArtists(List<MinimalArtist> artist){
		this.artists = artist;
	}
	public List<MinimalArtist> getArtists(){
		return artists;
	}
}
