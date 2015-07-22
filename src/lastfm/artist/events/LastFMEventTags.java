package lastfm.artist.events;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class LastFMEventTags {

	@JsonProperty private List<String> tag;
	
	public void setTag(List<String> tag){
		this.tag = tag;
	}
	
	public List<String> getTag(){
		return tag;
	}
	
}
