package lastfm.chart.toptracks;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lastfm.types.Streamable;
import lastfm.types.Image;

public class ChartTopTrack {
	@JsonProperty public String name;
	@JsonProperty public int duration;
	@JsonProperty public long playcount;
	@JsonProperty public long listeners;
	@JsonProperty public String mbid;
	@JsonProperty public String url;
	@JsonProperty public Streamable streamable;
	@JsonProperty public List<Image> image;
	@JsonProperty public ChartTopTrackArtist artist;
	
	public class ChartTopTrackArtist {
		@JsonProperty public String name;
		@JsonProperty public String mbid;
		@JsonProperty public String url;
	}
}
