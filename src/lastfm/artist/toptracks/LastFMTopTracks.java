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
public class LastFMTopTracks {

	@JsonProperty("track") private List<LastFMTopTrack> tracks;
	@JsonProperty("@attr") private LastFMResultAttr resultAttributes;
	
	public void setTracks(List<LastFMTopTrack> tracks){
		this.tracks = tracks;
	}
	/**
	 * get the list of top tracks
	 * @return list of top tracks as <code>List&lt;lastfm.artist.toptracks.TopTrack&gt;</code>
	 */
	public List<LastFMTopTrack> getTracks(){
		return tracks;
	}
	
	public void setResultAttributes(LastFMResultAttr resultAttributes){
		this.resultAttributes = resultAttributes;
	}
	/**
	 * get the result metadata POJO
	 * @return result attributes/metadata as <code>lastfm.artist.toptracks.ResultAttr</code>
	 */
	public LastFMResultAttr getResultAttributes(){
		return resultAttributes;
	}
}
