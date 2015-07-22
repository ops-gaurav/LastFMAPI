package lastfm.artist.info;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class LastFMLinks {

	@JsonProperty("link") private List<LastFMLink> links;
	
	public void setLinks(List<LastFMLink> links){
		this.links = links;
	}
	public List<LastFMLink> getLinks(){
		return links;
	}
}
