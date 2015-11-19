package lastfm.artist;

/*import java.io.IOException;*/

import lastfm.artist.events.Events;
import lastfm.artist.events.EventsWrapper;
import lastfm.util.FetchJSON;
import lastfm.util.DeserializeObject;

/*import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;*/

/**
 * class to fetch the artist events from the last.fm API
 * @author gaurav
 *
 */
public class ArtistEvents {

	private String genMethod;
	
	/**
	 * the default constructor
	 * @param apiKey represents the API key for callback
	 * @param artist represents the artist to find events for
	 */
	public ArtistEvents(String apiKey, String artist){
		genMethod = "";
		genMethod += EventsAPIMethods.ARTIST_EVENTS+"&format=json";
		genMethod += "&api_key="+ apiKey;
		genMethod += "&artist="+ artist;
	}
	
	/**
	 * call this method to get the provided artists events
	 * @return <code>lastfm.events.facades.Events</code> if events found
	 */
	public Events getArtistEvents(){
		String fetchJson = FetchJSON.fetchJSONFrom(genMethod);
		if(fetchJson != null){
			
			DeserializeObject<EventsWrapper> deserializer = new DeserializeObject<>();
			EventsWrapper eventsWrapper = deserializer.deserealize(fetchJson, EventsWrapper.class);
				return eventsWrapper.getEvents();
			
			/*ObjectMapper mapper = new ObjectMapper().enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
			EventsWrapper events;
			try {
				
				events = mapper.readValue(fetchJson, EventsWrapper.class);
				return events.getEvents();
				
			} catch (IOException e) {
				e.printStackTrace();
			}*/
		}
		return null;
			
	}
}
