package lastfm.chart.toptracks;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lastfm.types.ResultAttr;

public class ChartTopTracks {
	
	@JsonProperty("track") public List<ChartTopTrack> tracks;
	@JsonProperty("@attr") public ResultAttr attr;
}
