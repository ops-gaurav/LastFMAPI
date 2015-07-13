package lastfm.artist.events;

import java.util.List;
import com.google.gson.annotations.Expose;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Events {

	@Expose private List<Event> event;
	
	public void setEvent(List<Event> event){
		this.event = event;
	}
	
	public List<Event> getEvent(){
		return event;
	}
}
