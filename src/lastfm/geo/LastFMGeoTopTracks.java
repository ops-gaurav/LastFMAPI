package lastfm.geo;

import lastfm.apimethods.GeoTopsAPIMethods;
import lastfm.geo.tracks.GeoTopTracks;
import lastfm.geo.tracks.GeoTopTracksWrapper;
import lastfm.util.DeserializeObject;
import lastfm.util.FetchJSON;

/**
 * a class to fetch the LastFM top tracks based on geo location
 * @author gaurav
 *
 */
public class LastFMGeoTopTracks {

	private String genMethod = "";
	private int limit = 10;
	
	public LastFMGeoTopTracks (String key){
		genMethod += GeoTopsAPIMethods.GEO_TOP_TRACKS+"&format=json";
		genMethod += "&api_key="+ key;
		
	}
	
	public void setLimit (int limit) {
		this.limit = limit;
	}
	
	public GeoTopTracks fetchGeoTopTracks (String country) {
		
		genMethod += "&country="+ country;
		genMethod += "&limit="+ limit;
		
		String json = FetchJSON.fetchJSONFrom(genMethod);
		
		if (json != null) {
			
			DeserializeObject<GeoTopTracksWrapper> deserializer = new DeserializeObject<>();
			GeoTopTracksWrapper geoTracksWrapper = deserializer.deserialize(json, GeoTopTracksWrapper.class);
			
			return geoTracksWrapper.tracks;
			
		}
		
		return null;
		
	}
	
}
