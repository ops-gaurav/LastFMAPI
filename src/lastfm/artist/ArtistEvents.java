package lastfm.artist;

/*import java.io.IOException;*/

import lastfm.artist.events.Events;
import lastfm.artist.events.EventsWrapper;
import lastfm.util.FetchJSON;
import lastfm.util.DeserializeObject;

import lastfm.apimethods.ArtistAPIMethods;;

/*import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;*/

/**
 * class to fetch the artist events from the last.fm API
 * deprecated as last.fm does not supports events any more
 * @author gaurav
 *
 */
@Deprecated
public class ArtistEvents {

	private String genMethod;
	
	/**
	 * the default constructor
	 * @param apiKey represents the API key for callback
	 * @param artist represents the artist to find events for
	 */
	public ArtistEvents(String apiKey){
		genMethod = "";
		genMethod += ArtistAPIMethods.ARTIST_EVENTS+"&format=json";
		genMethod += "&api_key="+ apiKey;
	}
	
	/**
	 * call this method to get the provided artists events
	 * @return <code>lastfm.events.facades.Events</code> if events found
	 */
	public Events getArtistEvents(String artist){
		
		genMethod += "&artist="+ artist;
		
		String fetchJson = FetchJSON.fetchJSONFrom(genMethod);
		if(fetchJson != null){
			
			DeserializeObject<EventsWrapper> deserializer = new DeserializeObject<>();
			EventsWrapper eventsWrapper = deserializer.deserialize(fetchJson, EventsWrapper.class);
				return eventsWrapper.getEvents();
		}
		return null;
			
	}
}
