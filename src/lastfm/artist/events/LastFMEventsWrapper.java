package lastfm.artist.events;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LastFMEventsWrapper {
	
	@JsonProperty private LastFMEvents events;
	
	public void setEvenets(LastFMEvents events){
		this.events = events;
	}
	
	public LastFMEvents getEvents(){
		return events;
	}
	
}
