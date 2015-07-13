package lastfm.types;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Tags {

	@JsonProperty("tag") private List<TagFacade> tags;
	
	public void setTags(List<TagFacade> tags){
		this.tags = tags;
	}
	public List<TagFacade> getTags(){
		return tags;
	}
}
