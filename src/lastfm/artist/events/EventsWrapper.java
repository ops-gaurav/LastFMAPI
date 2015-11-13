package lastfm.artist.events;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EventsWrapper {
	
	@JsonProperty private Events events;
	
	public void setEvenets(Events events){
		this.events = events;
	}
	
	public Events getEvents(){
		return events;
	}
	
}
