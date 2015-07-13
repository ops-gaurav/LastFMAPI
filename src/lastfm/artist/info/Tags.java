package lastfm.artist.info;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Tags {

	@JsonProperty("tag") private List<Tag> tags;
	
	public void setTags(List<Tag> tag){
		this.tags = tag;
	}
	public List<Tag> getTags(){
		return tags;
	}
}
