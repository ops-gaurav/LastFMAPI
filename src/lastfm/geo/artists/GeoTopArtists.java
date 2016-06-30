package lastfm.geo.artists;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import lastfm.geo.ResultAttr;

public class GeoTopArtists {

	@JsonProperty("artist") private List<GeoTopArtist> artists;
	@JsonProperty("@attr") private ResultAttr resultAttr;
	
	public void setTopArtists (List<GeoTopArtist> artists) {
		this.artists = artists;
	}
	
	public List<GeoTopArtist> getTopArtists () {
		return artists;
	}
	
	public void setResultAttr (ResultAttr resultAttr) {
		this.resultAttr = resultAttr;
	}
	
	public ResultAttr getResultAttr () {
		return resultAttr;
	}
	
}
