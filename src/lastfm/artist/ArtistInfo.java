package lastfm.artist;

import lastfm.artist.info.LastFMArtist;
import lastfm.artist.info.LastFMArtistWrapper;
import lastfm.util.FetchJSON;
import lastfm.util.DeserializeObject;

public class ArtistInfo {

	private String genMethod = "";
	
	public ArtistInfo(String apiKey, String artist){
		genMethod += EventsAPIMethods.ARTIST_INFO;
		genMethod += "&api_key="+ apiKey;
		genMethod += "&artist="+ artist;
	}
	
	public LastFMArtist fetchArtistInfo(){
		
		String json = FetchJSON.fetchJSONFrom(genMethod);
		if(json != null){
			DeserializeObject<LastFMArtistWrapper> artistWrapper = new DeserializeObject<>();
			LastFMArtistWrapper wrapper = artistWrapper.deserealize(json, LastFMArtistWrapper.class);
			return wrapper.getArtist();
		}
		return null;
	}
}
