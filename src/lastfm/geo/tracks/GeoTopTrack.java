package lastfm.geo.tracks;

import com.fasterxml.jackson.annotation.JsonProperty;
import lastfm.types.Streamable;
import lastfm.types.Image;
import java.util.List;

public class  GeoTopTrack{
	@JsonProperty public String name;
	@JsonProperty public long listeners;
	@JsonProperty public long duration;
	@JsonProperty public String mbid;
	@JsonProperty public String url;
	@JsonProperty public Streamable streamable;
	@JsonProperty public GeoTopTrackArtist artist;
	@JsonProperty public List<Image> image;
	@JsonProperty("@attr") GeoTopTrackAttr attr;
}
