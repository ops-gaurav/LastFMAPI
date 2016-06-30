package lastfm.geo.tracks;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GeoTopTracksWrapper {

	@JsonProperty("tracks") public GeoTopTracks tracks;
	
}
