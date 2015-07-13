package lastfm.artist.events;

import com.google.gson.annotations.Expose;

public class EventsWrapper {
	
	@Expose private Events events;
	
	public void setEvenets(Events events){
		this.events = events;
	}
	
	public Events getEvents(){
		return events;
	}
	
}
