package lastfm.artist.events;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Events {

	@JsonProperty private List<Event> event;
	
	public void setEvent(List<Event> event){
		this.event = event;
	}
	
	public List<Event> getEvent(){
		return event;
	}
}
