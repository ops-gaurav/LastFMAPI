package lastfm.chart.topartists;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lastfm.types.ResultAttr;

public class ChartTopArtists {
	
	@JsonProperty public List<ChartTopArtist> artist;
	@JsonProperty("@attr") public ResultAttr attr;

}
