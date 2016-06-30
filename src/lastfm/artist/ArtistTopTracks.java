package lastfm.artist;

import lastfm.artist.toptracks.TopTracksWrapper;
import lastfm.apimethods.ArtistAPIMethods;
import lastfm.artist.toptracks.TopTracks;
import lastfm.util.DeserializeObject;
import lastfm.util.FetchJSON;

/**
 * Class to fetch the artist top tracks
 * @author gaurav
 *
 */
public class ArtistTopTracks {

	private String genMethod = ArtistAPIMethods.ARTIST_TOP_TRACKS;
	private int count = 5;
	private int page = 1;
	
	/**
	 * the default constructor 
	 * @param apiKey represents the last.fm API key
	 * @param artist represents the artists to fetch top tracks of
	 */
	public ArtistTopTracks(String apiKey){
		
		genMethod += "&api_key="+ apiKey;
	}
	
	/**
	 * fetch the top tracks for the given artist
	 * @return <code>lastfm.artist.toptracks.TopTracks</code> if tracks found
	 */
	public TopTracks fetchTopTracks(String artist){
		genMethod += "&artist="+ artist;
		genMethod += "&limit=" + count;
		genMethod += "&page=" + page;
		
		String json = FetchJSON.fetchJSONFrom(genMethod);
		DeserializeObject<TopTracksWrapper> deserializer = new DeserializeObject<>();
		TopTracksWrapper tracksWrapper = deserializer.deserealize(json, TopTracksWrapper.class);
		
			return tracksWrapper.getToptracks();
	}
	
	/**
	 * set the result limit. This method must be called before calling <code>fetchTopTracks()</code>
	 * @param count represents the limit of results to set
	 */
	public void setLimit(int count){
		this.count = count;
	}
	
	/**
	 * use this setter to set the page number to fetch.The default is 1st page
	 * @param page represents the page number
	 */
	public void setPage(int page){
		this.page = page;
	}
	
}
