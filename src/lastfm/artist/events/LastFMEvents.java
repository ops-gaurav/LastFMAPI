package lastfm.artist.events;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LastFMEvents {

	@JsonProperty private List<LastFMEvent> event;
	
	public void setEvent(List<LastFMEvent> event){
		this.event = event;
	}
	
	public List<LastFMEvent> getEvent(){
		return event;
	}
}
