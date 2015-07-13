package lastfm.artist.toptracks;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Rank attribute represents the rank of the track
 * @author gaurav
 *
 */
public class RankAttr {

	@JsonProperty private int rank;
	
	public void setRank(int rank){
		this.rank = rank;
	}
	/**
	 * get the rank of the track
	 * @return rank as integer
	 */
	public int getRank(){
		return rank;
	}
}
