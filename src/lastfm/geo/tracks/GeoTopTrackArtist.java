package lastfm.geo.tracks;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GeoTopTrackArtist {
	@JsonProperty public String name;
	@JsonProperty public String mbid;
	@JsonProperty public String url;
}
