package lastfm.chart.topartists;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lastfm.types.Image;

public class ChartTopArtist {
	@JsonProperty public String name;
	@JsonProperty public long playcount;
	@JsonProperty public long listeners;
	@JsonProperty public String mbid;
	@JsonProperty public String url;
	@JsonProperty public String streamable;
	@JsonProperty public List<Image> image;
}
