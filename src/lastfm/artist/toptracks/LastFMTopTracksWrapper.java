package lastfm.artist.toptracks;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * the wrapper for the whole toptracks POJO's
 * this class is the top level class in the JSON Deserialization heirarchy
 * @author gaurav
 *
 */
public class LastFMTopTracksWrapper {

	@JsonProperty private LastFMTopTracks toptracks;
	
	public void setToptracks(LastFMTopTracks toptracks){
		this.toptracks = toptracks;
	}
	/**
	 * get top tracks 
	 * @return top tracks as <code>lastfm.artist.toptracks.TopTracks</code> that
	 * contains the list of <code>lastfm.artist.toptracks.TopTrack</code> that represents
	 * an individual track.
	 */
	public LastFMTopTracks getToptracks(){
		return toptracks;
	}
}
