package lastfm.artist.info;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Links {

	@JsonProperty("link") private List<Link> links;
	
	public void setLinks(List<Link> links){
		this.links = links;
	}
	public List<Link> getLinks(){
		return links;
	}
}
