package lastfm.geo.tracks;

import com.fasterxml.jackson.annotation.JsonProperty;

import lastfm.geo.ResultAttr;

import java.util.List;

public class GeoTopTracks {
	
	@JsonProperty public List<GeoTopTrack> track;
	@JsonProperty("@attr") public ResultAttr attr;
	
}
