package lastfm.artist.events;

import java.util.List;
import com.google.gson.annotations.Expose;

public class EventTags {

	@Expose private List<String> tag;
	
	public void setTag(List<String> tag){
		this.tag = tag;
	}
	
	public List<String> getTag(){
		return tag;
	}
	
}
