package lastfm.artist.events;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class LastFMEventArtists {

	@JsonProperty private List<String> artist;
	//@JsonProperty private String[] artist;
	@JsonProperty private String headliner;
	
	public void setArtist(List<String> artist){
		this.artist = artist;
	}
	
	public void setHeadliner(String headliner){
		this.headliner = headliner;
	}
	
	public List<String> getArtist(){
		return artist;
	}
	public String getHeadliner(){
		return headliner;
	}
}
