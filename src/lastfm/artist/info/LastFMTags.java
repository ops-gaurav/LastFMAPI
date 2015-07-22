package lastfm.artist.info;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class LastFMTags {

	@JsonProperty("tag") private List<LastFMTag> tags;
	
	public void setTags(List<LastFMTag> tag){
		this.tags = tag;
	}
	public List<LastFMTag> getTags(){
		return tags;
	}
}
