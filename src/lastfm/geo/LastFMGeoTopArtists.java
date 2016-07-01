package lastfm.geo;

import lastfm.apimethods.GeoTopsAPIMethods;
import lastfm.geo.artists.GeoTopArtistWrapper;
import lastfm.geo.artists.GeoTopArtists;
import lastfm.util.DeserializeObject;
import lastfm.util.FetchJSON;

/**
 * get the top artists based upon the geographic location
 * @author gaurav
 *
 */
public class LastFMGeoTopArtists {
	
	private String genMethod;
	private int limit = 10;
	
	/**
	 * the default constructor
	 * @param key
	 */
	public LastFMGeoTopArtists (String key) {
		genMethod = "";
		genMethod += GeoTopsAPIMethods.GEO_TOP_ARTISTS+"&format=json";
		genMethod += "&api_key="+ key;
	}
	
	public void setLimit (int limit) {
		this.limit = limit;
	}
	
	/**
	 * get the top tracks based on the location
	 * @param country represents the country name
	 * @return
	 */
	public GeoTopArtists fetchGeoTopArtists (String country) {
		
		genMethod += "&country="+ country;
		genMethod += "&limit="+ limit;
		
		String json = FetchJSON.fetchJSONFrom(genMethod);
		
		System.out.println(json);
		
		if (json != null) {
			
			DeserializeObject<GeoTopArtistWrapper> deserialize = new DeserializeObject<>();
			GeoTopArtistWrapper topArtistWrapper = deserialize.deserialize(json, GeoTopArtistWrapper.class);
			
			return topArtistWrapper.getArtists();
		}
		
		return null;
		
	}
}
