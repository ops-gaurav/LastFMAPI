package lastfm.artist.toptracks;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * this class contains 2 properties called the list of top tracks
 * and the result attributes property, that contains the metadata information
 * about the result.
 * @author gaurav
 *
 */
public class TopTracks {

	@JsonProperty("track") private List<TopTrack> tracks;
	@JsonProperty("@attr") private ResultAttr resultAttributes;
	
	public void setTracks(List<TopTrack> tracks){
		this.tracks = tracks;
	}
	/**
	 * get the list of top tracks
	 * @return list of top tracks as <code>List&lt;lastfm.artist.toptracks.TopTrack&gt;</code>
	 */
	public List<TopTrack> getTracks(){
		return tracks;
	}
	
	public void setResultAttributes(ResultAttr resultAttributes){
		this.resultAttributes = resultAttributes;
	}
	/**
	 * get the result metadata POJO
	 * @return result attributes/metadata as <code>lastfm.artist.toptracks.ResultAttr</code>
	 */
	public ResultAttr getResultAttributes(){
		return resultAttributes;
	}
}
