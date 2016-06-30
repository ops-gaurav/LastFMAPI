package lastfm.geo.artists;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GeoTopArtistWrapper {

	@JsonProperty("topartists") private GeoTopArtists topArtists;
	
	public void setArtists (GeoTopArtists topArtists) {
		this.topArtists = topArtists;
	}
	
	public GeoTopArtists getArtists () {
		return topArtists;
	}
}
