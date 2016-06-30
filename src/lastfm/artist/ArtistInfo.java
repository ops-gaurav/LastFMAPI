package lastfm.artist;

import lastfm.artist.info.Artist;
import lastfm.artist.info.ArtistWrapper;
import lastfm.util.FetchJSON;
import lastfm.util.DeserializeObject;
import lastfm.apimethods.ArtistAPIMethods;

public class ArtistInfo {

	private String genMethod = "";
	
	/**
	 * default constructor, must provide with the API key
	 * @param apiKey
	 */
	public ArtistInfo(String apiKey){
		genMethod += ArtistAPIMethods.ARTIST_INFO;
		genMethod += "&api_key="+ apiKey;
	}
	
	/**
	 * fetch the artist info from this method
	 * @param artist represents the name of the artist
	 * @return
	 */
	public Artist fetchArtistInfo(String artist){
		genMethod += "&artist="+ artist;
		
		String json = FetchJSON.fetchJSONFrom(genMethod);
		if(json != null){
			DeserializeObject<ArtistWrapper> artistWrapper = new DeserializeObject<>();
			ArtistWrapper wrapper = artistWrapper.deserealize(json, ArtistWrapper.class);
			return wrapper.getArtist();
		}
		return null;
	}
}
