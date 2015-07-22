package lastfm.artist.toptracks;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * represnts the artist facade
 * @author gaurav
 *
 */
public class LastFMTopTracksArtist {

	@JsonProperty private String name;
	@JsonProperty private String mbid;
	@JsonProperty private String url;
	
	public void setName(String name){
		this.name = name;
	}
	/**
	 * get the name of the artist
	 * @return name as String
	 */
	public String getName(){
		return name;
	}
	public void setMbid(String mbid){
		this.mbid = mbid;
	}
	/**
	 * get the mbid of the artist
	 * @return mbid as String
	 */
	public String getMbid(){
		return mbid;
	}
	public void setUrl(String url){
		this.url = url;
	}
	/**
	 * get the url of the artist
	 * @return url as String
	 */
	public String getUrl(){
		return url;
	}
}
