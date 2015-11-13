package lastfm.artist;

import lastfm.artist.info.Artist;
import lastfm.artist.info.ArtistWrapper;
import lastfm.util.FetchJSON;
import lastfm.util.DeserializeObject;

public class ArtistInfo {

	private String genMethod = "";
	
	public ArtistInfo(String apiKey, String artist){
		genMethod += EventsAPIMethods.ARTIST_INFO;
		genMethod += "&api_key="+ apiKey;
		genMethod += "&artist="+ artist;
	}
	
	public Artist fetchArtistInfo(){
		
		String json = FetchJSON.fetchJSONFrom(genMethod);
		if(json != null){
			DeserializeObject<ArtistWrapper> artistWrapper = new DeserializeObject<>();
			ArtistWrapper wrapper = artistWrapper.deserealize(json, ArtistWrapper.class);
			return wrapper.getArtist();
		}
		return null;
	}
}
